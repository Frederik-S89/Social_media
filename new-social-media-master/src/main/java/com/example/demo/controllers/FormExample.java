package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FormExample {
    // Showing how to create a form using thymeleaf
    @GetMapping("/form")
    public String renderForm() {
        return "form";
    }

    @GetMapping(value="/list")
    @ResponseBody
    public ArrayList renderList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("orange");

        // This list gets returned as json!
        return list;
    }
}
