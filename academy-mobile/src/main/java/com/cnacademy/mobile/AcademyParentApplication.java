package com.cnacademy.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication()
//使用tk.mabatis注解，否则报错找不到方法
@MapperScan("com.cnacademy.mappers")
@ComponentScan(basePackages = {"com.cnacademy.mobile","com.cnacademy.service"})
public class AcademyParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcademyParentApplication.class, args);
    }
}
