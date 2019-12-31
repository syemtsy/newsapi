package com.news.java;

import com.news.java.dao.entity.UserLogin;
import com.news.java.dao.mapper.LoginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsapiApplicationTests {
    @Resource
    private LoginMapper loginMapper;
    @Test
    public void contextLoads() {
        UserLogin userLogin=new UserLogin();
        userLogin.setId((long) 1);
        userLogin.setUId((long) 1);
        userLogin.setUsername(String.valueOf(4));
        userLogin.setPassword(String.valueOf(1));
       loginMapper.Save(userLogin);
        System.out.println("wuneigui");
       System.out.println(loginMapper.findAll().toString());
    }

}
