package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloSpringController {

    //Handles requests of the form /hello?name=LaunchCode
    //lives at /hello/hello
    @RequestMapping(value = "hello", method= {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name +"!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //Handles requests of the form /hello/LaunchCode
    //lives at /hello/name
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return"hello  ";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("Javascript");
        model.addAttribute("names", names);
        return "hello-list";
    }
}
