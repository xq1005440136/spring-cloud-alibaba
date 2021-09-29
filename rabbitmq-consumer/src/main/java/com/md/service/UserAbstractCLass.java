package com.md.service;

import com.md.api.UserApi;
import com.md.vo.User;
import java.util.List;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 15:59
 * @Version 1.0
 */
public class UserAbstractCLass implements UserApi {

  @Override
  public void saveUser(User user) {

  }

  @Override
  public void deleteUser(User user) {

  }

  @Override
  public void updateUser(User user) {

  }

  @Override
  public List<User> getUserList(User user) {
    return null;
  }

  @Override
  public User getUserById(User user) {
    return null;
  }
}
