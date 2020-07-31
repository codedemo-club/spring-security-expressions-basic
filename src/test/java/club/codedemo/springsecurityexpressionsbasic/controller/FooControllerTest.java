package club.codedemo.springsecurityexpressionsbasic.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class FooControllerTest {
    @Autowired
    MockMvc mockMvc;

    /**
     * 使用ADMIN角色模拟请求，返回true
     * @throws Exception
     */
    @Test
    @WithMockUser(roles = "ADMIN")
    public void someControllerMethodWithAdmin() throws Exception {
        assertEquals(this.mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andReturn().getResponse().getContentAsString(), "true");
    }

    /**
     * 使用USER模拟请求，返回false
     * @throws Exception
     */
    @Test
    @WithMockUser(roles = "USER")
    public void someControllerMethodWithUser() throws Exception {
        assertEquals(this.mockMvc.perform(MockMvcRequestBuilders.get("/"))
                                 .andReturn().getResponse().getContentAsString(), "false");
    }
}