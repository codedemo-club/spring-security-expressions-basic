package club.codedemo.springsecurityexpressionsbasic.service;

import club.codedemo.springsecurityexpressionsbasic.entity.Foo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FooService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<Foo> findAll() {
        return Arrays.asList(new Foo(), new Foo());
    }

}
