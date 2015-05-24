#!/bin/bash

function check_availability {
    for ((i=0; i<60; i=i+1)); do
        if [ "`uname -s`" == "Linux" ]; then
            nc -w 3 0.0.0.0 $1 -e "/usr/bin/date"
        else
            nc -z -w 3 0.0.0.0 $1
            if [ $? == 0 ]; then
                return
            fi
        fi
        sleep $2
    done
    echo 'Timeout to start service'
    exit -1
}

echo "Cleanup environment..."
pkill redis-server
ps aux | grep java | grep gateway/build/libs/gateway-1.0.0-SNAPSHOT.war | awk '{print $2}' | xargs kill
ps aux | grep java | grep ui/build/libs/ui-1.0.0-SNAPSHOT.war | awk '{print $2}' | xargs kill
ps aux | grep java | grep resource/build/libs/resource-1.0.0-SNAPSHOT.war | awk '{print $2}' | xargs kill
ps aux | grep java | grep admin/build/libs/admin-1.0.0-SNAPSHOT.war | awk '{print $2}' | xargs kill

echo "Build code..."
#gradle build -q
echo "Start redis server..."
nohup redis-server > logs/redis.log 2>&1 &
check_availability 6379 1
echo $?
echo "Start gateway server..."
nohup java -jar gateway/build/libs/gateway-1.0.0-SNAPSHOT.war > logs/gateway.log 2>&1 &
check_availability 8080 3
echo "Start ui server..."
nohup java -jar ui/build/libs/ui-1.0.0-SNAPSHOT.war > logs/ui.log 2>&1 &
check_availability 9000 3
echo "Start resource server..."
nohup java -jar resource/build/libs/resource-1.0.0-SNAPSHOT.war > logs/resource.log 2>&1 &
check_availability 9001 3
echo "Start admin server..."
nohup java -jar admin/build/libs/admin-1.0.0-SNAPSHOT.war > logs/admin.log 2>&1 &
check_availability 9002 3
