package com.million.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 */
@SpringBootApplication
public class MainApplication {

  public static void main(String[] args) {
    //启动程序，返回IOC容器
    ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
    //2、查看容器里面的组件
    String[] name = run.getBeanDefinitionNames();
    for (String each: name) {
      System.out.println(each);
    }


  }
}