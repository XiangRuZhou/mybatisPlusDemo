package com.mybatis.mybatisplusdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.mybatisplusdemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
