package com.vmware.sample.controller;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserController.class)
public class UserControllerTest {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void obtainUserTest() throws Exception {
        mvc.perform(get("/api/v1/users"))
                .andExpect(status().isOk());

        mvc.perform(get(String.format("/api/v1/user/%d", 0)))
                .andExpect(status().isOk());

        mvc.perform(get("/api/v1/user")
                .queryParam("name", "Bob"))
                .andExpect(status().isOk());
    }

//    @Test
//    public void createUserTest() throws Exception {
//        mvc.perform(post("/api/v1/user")
//                .param("id", "4")
//                .param("name", "Black"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void updateUserTest() throws Exception {
//        mvc.perform(put("/api/v1/user")
//                .param("id", "4")
//                .param("name", "Black")
//                .param("age", "32"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void deleteUserTest() throws Exception {
//        mvc.perform(delete(String.format("/api/v1/user/%d", 0)))
//                .andExpect(status().isOk());
//    }
}
