package br.com.livia.api.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping(value = "/")
    public String getMethodName() {
        return "Hello World";
    }

    @PostMapping(value = "/")
    public float dateString(@RequestBody float value) {

        float result = value + (value * (12 / 100));

        return result;

    }

    @PostMapping(value = "/date")
    public int date(@RequestBody Date startData, Date endDate) {
        return 1;
    }

}
