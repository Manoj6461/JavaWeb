package com.web.controller;

import com.web.service.WebServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("web")
public class WebController {

    @Autowired
    WebServie webServie;

    @GetMapping(value = "/home")
    public ResponseEntity<String> getMapping() {
        return ResponseEntity.ok("Hello Manoj!!! ");
    }

    @GetMapping(value = "/anagram")
    public ResponseEntity<String> checkAnagram(@RequestBody Map<String, String> anagramStrings) {
        String result = "";
        if (anagramStrings.get("s1") != null && anagramStrings.get("s2") != null) {
            String s1 = anagramStrings.get("s1");
            String s2 = anagramStrings.get("s2");
            result = webServie.checkAnagram(s1, s2);
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.badRequest().body("Please enter values...");
        }
    }


}
