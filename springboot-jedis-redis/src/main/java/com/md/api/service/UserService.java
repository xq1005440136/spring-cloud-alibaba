package com.md.api.service;

import com.md.api.UserApi;
import com.md.dao.UserDao;
import com.md.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 14:06
 * @Version 1.0
 */
@Service
public class UserService implements UserApi {

  @Autowired
  private UserDao userDao;

  @Override
  public List<User> findAll() {
    return userDao.findAll();
  }
}
