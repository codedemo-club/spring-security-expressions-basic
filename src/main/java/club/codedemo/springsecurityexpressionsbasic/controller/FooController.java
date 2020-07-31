package club.codedemo.springsecurityexpressionsbasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FooController {

    @RequestMapping
    public boolean someControllerMethod(HttpServletRequest request) {
        return request.isUserInRole("ROLE_ADMIN");
    }
}
