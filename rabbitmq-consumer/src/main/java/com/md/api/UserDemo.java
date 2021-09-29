package com.md.api;

import com.md.vo.User;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 16:00
 * @Version 1.0
 */
public interface UserDemo extends UserApi {

  @Override
  void saveUser(User user);

  @Override
  void deleteUser(User user);
}
