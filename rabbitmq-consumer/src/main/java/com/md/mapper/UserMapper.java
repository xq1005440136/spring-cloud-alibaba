package com.md.mapper;

import com.md.vo.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 15:45
 * @Version 1.0
 */
@Mapper
public interface UserMapper {


  void saveUser(User user);


  void deleteUser(User user);

  void updateUser(User user);


  List<User> getUserList(User user);


  User getUserById(User user);


}
