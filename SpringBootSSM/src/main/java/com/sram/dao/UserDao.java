package com.sram.dao;

import com.sram.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<User> findUser();

    public User getUser(Integer id);
}
