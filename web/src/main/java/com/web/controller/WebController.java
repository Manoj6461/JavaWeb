package com.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web")
public class WebController {

    @GetMapping(value = "/home")
    public ResponseEntity<String> getMapping() {
        return ResponseEntity.ok("Hello Manoj!!! ");
    }

}
