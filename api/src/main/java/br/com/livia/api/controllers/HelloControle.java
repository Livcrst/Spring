package br.com.livia.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControle {

    @GetMapping(value = "/")
    public String getMethodName() {

        return "Hello Wolrd!";

    }

}
