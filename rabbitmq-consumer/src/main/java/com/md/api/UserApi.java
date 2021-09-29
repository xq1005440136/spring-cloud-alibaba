package com.md.api;

import com.md.vo.User;
import java.util.List;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 15:44
 * @Version 1.0
 */
public interface UserApi {


  void saveUser(User user);


  void deleteUser(User user);

  void updateUser(User user);


  List<User> getUserList(User user);


  User getUserById(User user);

  static void hello() {

    System.out.println("helllo");
  }


}
