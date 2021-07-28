package com.example.tyfserver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

//    private final Key key;

    @GetMapping("/nores")
    public String asdf() {
        return "nores";
    }

    @GetMapping("/res")
    public String res() {
        return "res";
    }

    @GetMapping("/fds")
    public String fds() {
        return "fdsff";
    }

    @GetMapping("/zxc")
    public String zxc() {
        return "zxc";
    }

    @GetMapping("/fff")
    public String fff() {
        return "dfsfdfsfa";
    }

//    @GetMapping("/key")
//    public String key() {
//        return key.getSecret();
//    }
}
