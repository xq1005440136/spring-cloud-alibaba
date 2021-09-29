package com.md.service;

import com.md.api.UserApi;
import com.md.vo.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 15:44
 * @Version 1.0
 */
@Service
public class UserService extends UserAbstractCLass {

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

  public static void main(String[] args) {
    String str = "abbbacd";
    char[] chars = str.toCharArray();
//    Map<Character,Integer> map = new HashMap<>();
    List<String> strList = new ArrayList<>();
    List<Integer> countList = new ArrayList<>();
    int index = 0;
    for (int i = 0; i < chars.length; i++) {
      strList.add(String.valueOf(chars[i]));
      if(i<chars.length){
       if(i<chars.length-1&&String.valueOf(chars[i+1]).equals(strList.get(strList.size()-1))||i==chars.length-1){
         countList.add(strList.size());
         index++;
         strList.clear();
       }
      }
    }
    if(index==0){
      countList.add(strList.size());
    }

   countList = countList.stream().sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println("最大的连续不重复字符串长度为：==========:"+countList.get(countList.size()-1));

  }
}
