package com.md.api;

import com.md.model.User;
import java.util.List;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 14:05
 * @Version 1.0
 */
public interface UserApi {

  List<User> findAll();

}
