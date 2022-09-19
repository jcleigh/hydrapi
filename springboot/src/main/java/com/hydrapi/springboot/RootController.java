package com.hydrapi.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RootController {
  @GetMapping("/")
  String root() {
    return "java/springboot";
  }
}