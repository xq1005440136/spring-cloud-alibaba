package com.md.dao;

import com.md.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 14:07
 * @Version 1.0
 */
@Mapper
public interface UserDao {

  List<User> findAll();

}
