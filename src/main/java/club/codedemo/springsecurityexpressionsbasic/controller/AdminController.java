package club.codedemo.springsecurityexpressionsbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping("test")
    public String test() {
        return "admin/test";
    }
}
