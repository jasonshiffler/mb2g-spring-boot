package com.shiffler.mb2gspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){

        Map<String, Object> returnVal = new HashMap<>();

        returnVal.put("hello","world");

        return returnVal;
    }

}
