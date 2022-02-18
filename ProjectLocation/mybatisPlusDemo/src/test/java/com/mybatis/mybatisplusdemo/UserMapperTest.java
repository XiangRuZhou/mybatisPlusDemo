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

    @Test
    public void insertTest(){
        User user = new User();
        user.setAge(19);
        user.setEmail("178687658@qq.com");
        user.setName("张三");
        int insert = userMapper.insert(user);
        System.out.println("受影响的行数:"+ insert);
        System.out.println("插入的User参数："+user.toString());
        //此处ID是自动生成
    }

    @Test
    public void testIdWorker(){
        /**
         *DTYPE 有5种主键策略
         * 1-数据库ID自增 AUTO @TableId(type = IdType.AUTO) 需要在数据库表中设置主键自增
         * 2-未设置主键类型 NONE
         * 3-用户输入Id 该类型可以自己注册自动填充插件进行填充 INPUT
         * --一下三种类型，当插入的对象ID为空时，自动填充
         * 4-ID_WORK 全局唯一ID
         * 5-UUID 全局唯一ID
         * 6-ID_WORKER_STR 字符串形式的ID_WORKER
         */


    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("李四");
        int i = userMapper.updateById(user);
        System.out.println("受影响的行数:"+i);
        User user1 = userMapper.selectById(1);
        System.out.println("修改之后的结果："+user1.toString());

    }











}
