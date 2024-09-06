package com.TaiNgonheng.Pate_SpringBoot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Cousre> retrieveAllcourses(){
        return Arrays.asList(
                new Cousre(1,"Tai Ngonheng","pate"),
                new Cousre(2,"Nhep PhengLeang","Lup")
        );
    }
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
