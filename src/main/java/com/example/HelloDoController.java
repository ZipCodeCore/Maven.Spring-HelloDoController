package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloDoController {
    @RequestMapping(value="/HelloDo", method= RequestMethod.GET)
    public String helloGet(@RequestParam String msg)
    {
        return "Hello " + msg;
    }

    @RequestMapping(value="/HelloDo", method = RequestMethod.POST)
    public String helloPOST(@RequestBody String msg)
    {
        return "Hello with a post" + msg;
    }
}
