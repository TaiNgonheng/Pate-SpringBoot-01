package com.TaiNgonheng.Pate_SpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration Congfiguration;


    @RequestMapping("/hi")
    public CurrencyServiceConfiguration get() {
        return Congfiguration;
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
