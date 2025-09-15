package com.example.demo_test.controller;


import com.example.demo_test.Member;
import com.example.demo_test.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerTest {

    @Autowired
    private final Repository repository;

    public ControllerTest(Repository repository) {
        this.repository = repository;
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        return repository.findAll();
    }

}
