package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String Hello() {
        return "Hello World!";
    }
    @RequestMapping(path="/hello/{name}/and/{age}", method = RequestMethod.GET)
    @ResponseBody
    public  String helloNameAndAge(@PathVariable String name, @PathVariable int age) {
        return "name: " + name + " age: " + age + "!";
    }
}
