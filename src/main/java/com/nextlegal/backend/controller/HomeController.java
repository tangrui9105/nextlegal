package com.nextlegal.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/user")
    @ResponseBody
    public Map<String, Object> user(Principal user) {
        System.out.println(user);
        return Collections.<String, Object> singletonMap("name", user.getName());
    }

    @RequestMapping("/login")
    public String login() {
        return "forward:/";
    }
}
