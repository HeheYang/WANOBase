package tk.mybatis.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HEHE on 2017/2/7.
 */
@RestController
public class test {

    @RequestMapping("/hehe")
    public String hehe(){
        return "WANO框架搭建完成";
    }
}
