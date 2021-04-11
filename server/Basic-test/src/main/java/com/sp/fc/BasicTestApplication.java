package com.sp.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicTestApplication {

    public static void main(String[] args) {

        Person person = Person.builder().name("test").build();
//      다른 디렉토리 객체를 사용하기 위해선 레퍼런스 적용 필요
//      build.gradle> compile project(":comp-common-utils") 적용
        System.out.println(person);

//        SpringApplication.run(BasicTestApplication.class, args);
    }
}
