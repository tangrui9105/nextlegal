# Next Legal

## Architecture

<img src="https://github.com/tangrui9105/nextlegal/blob/master/docs/architecture.jpg">

## Installation

### Prerequisites

Install the following tools before you continue:

* Java 1.8
* Gradle 2.4
* Redis server 2.8

### Build and run by one script

```
./run.sh
```

This script will run four servers in local, please make sure the ports are not occupied:

* Gateway: localhost:8080
* UI: localhost:9000
* Resource: localhost:9001
* Admin: localhost:9002

Access "http://localhost:8080" in your browser, use user/password for login.

### Code generation

```
cd codegen && ./codegen.sh
```
