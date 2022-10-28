package com.million.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController //这是前两个的合体
public class HelloController {

  @RequestMapping("/hello") //对应的响应请求
  public String handle01(){
    return "Hello, Spring Boot 2!"; //返回的字符串
  }

}
