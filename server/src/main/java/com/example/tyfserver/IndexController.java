package com.example.tyfserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/nores")
    public String asdf() {
        return "nores";
    }

    @GetMapping("/res")
    public String res() {
        return "res";
    }
}
