package com.nowcoder.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class IndexController {

    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index(){
        return "Hello NowCoder";
    }

    @RequestMapping(path = {"/profile/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId){
        return "Profile Page of " + userId;
    }

    @RequestMapping(path = {"/", "index"})
    public String helloHtml() {
        return "home";
    }

}
