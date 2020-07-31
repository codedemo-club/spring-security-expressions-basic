package club.codedemo.springsecurityexpressionsbasic.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FooServiceTest {

    @Autowired
    FooService fooService;

    /**
     * 使用匿名用户登录
     * 断言发生AccessDeniedException异常
     */
    @Test
    @WithAnonymousUser
    public void findAll() {
        assertThrows(AccessDeniedException.class, () -> this.fooService.findAll());
    }

    /**
     * 使用 ADMIN角色访问
     * 正常
     */
    @Test
    @WithMockUser(roles = "ADMIN")
    public void findAllWithUser() {
        this.fooService.findAll();
    }
}