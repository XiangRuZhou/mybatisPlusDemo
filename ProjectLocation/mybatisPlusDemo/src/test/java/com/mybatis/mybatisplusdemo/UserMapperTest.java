package com.mybatis.mybatisplusdemo;

import com.mybatis.mybatisplusdemo.dao.UserMapper;
import com.mybatis.mybatisplusdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void selectUserListTest(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
