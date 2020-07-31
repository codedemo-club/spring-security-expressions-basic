package club.codedemo.springsecurityexpressionsbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HasRoleController {

    @RequestMapping("part")
    public String part() {
        return "part";
    }
}
