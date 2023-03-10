package com.example.importmaven.controller;

import counter.CharCounter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MvnController {

    @GetMapping("/counter")
    public static String charCount(@RequestParam(name="word", defaultValue = "hello")String word){
        List<String> stringList = new ArrayList<>();
        stringList.add(word);

        return CharCounter.processStringArr(stringList).toString();

    }
}
