package com.bidi.auth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return  "public";
    }

    @GetMapping("/api/private")
    public String privateEndpoint() {
        return  "private";
    }


}
