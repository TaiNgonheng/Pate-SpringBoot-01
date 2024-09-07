package com.TaiNgonheng.Pate_SpringBoot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/Couses")
    public List<Cousre> get() {
        return Arrays.asList(
                new Cousre(1, "heng", "ngon"),
                new Cousre(2, "heng", "hehehehhe"),
                new Cousre(3, "jrjrge", "grjaekgrea"),
                new Cousre(4, "hgraegr", "gryaegrea"),
                new Cousre(5, "uuuu", "green"),
                new Cousre(6, "greagrea", "hiuoujon"),
                new Cousre(7, "hrge", "greagreagreahrehh"),
                new Cousre(8, "This is the rest api", "greargeajjjjjjjj"),
                new Cousre(90, "rgaer", "33"),
                new Cousre(6, "greagrea", "hiuoujon"),
                new Cousre(9, "gr", "grea"),
                new Cousre(10, "gr", "gragr"),
                new Cousre(1, "ggragr", "geag")
        );
    }
}


//package com.TaiNgonheng.Pate_SpringBoot;
//
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RestController
//public class CourseController {
//
//    @RequestMapping("/courses")
//    public List<Cousre> retrieveAllcourses(){
//        return Arrays.asList(
//                new Cousre(1,"Tai Ngonheng","pate"),
//                new Cousre(2,"Nhep PhengLeang","Lup")
//        );
//    }
//    @RequestMapping("/hi")
//    public List<Cousre> hi(){
//        return Arrays.asList(
//                new Cousre(1,"hello everybody","pate"),
//                new Cousre(2,"kk","Lup")
//        );
//    }
//    @RequestMapping("/baby")
//    public List<Cousre> bu(){
//        return Arrays.asList(
//          new Cousre(3,"hehhehe","ghra")
//        );
//    }
//
//}
