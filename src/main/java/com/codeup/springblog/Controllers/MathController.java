package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/math")
    @ResponseBody
    public String math() {
        return "Math";
    }

    @RequestMapping(path = "/add/{x}/and/{y}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int x, @PathVariable int y) {
        return "add = : " + (x + y);
    }
    @RequestMapping(path = "/subtract/{x}/from/{y}", method = RequestMethod.GET)
    @ResponseBody
    public String sub(@PathVariable int x, @PathVariable int y) {
        return "sub = : " + (x - y);
    }

    @RequestMapping(path = "/multiply/{x}/and/{y}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int x, @PathVariable int y){return "product = : " + (x * y);}

    @RequestMapping(path = "/divide/{x}/by/{y}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int x, @PathVariable int y){return "product = : " + (x / y);}
}
