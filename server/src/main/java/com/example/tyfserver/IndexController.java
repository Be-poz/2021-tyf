package com.example.tyfserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/nores")
    public String asdf() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/res")
    public String res() {
        return "res";
    }
}
