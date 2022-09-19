package com.hydrapi.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {
  @GetMapping("/hello")
  String helloWorld() {
    return "Hello, World!";
  }
}