package com.starujupite.test.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/alive")
@Slf4j
public class TestController {
    
    @GetMapping
    public ResponseEntity<String> getOKResponse() {
        log.info("Accessed /alive endpoint");
        return new ResponseEntity<>("Hello World! version: 08", HttpStatus.OK);
    }

}
