package com.md.controller;

import com.md.api.UserApi;
import com.md.model.User;
import com.md.utils.ExcelExportUtils;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 14:01
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private UserApi userApi;

  @Autowired
  private HttpServletResponse response;

  @RequestMapping(value = "export")
  public void excelExport() {
    System.out.println("response=======================" + response);
    List<User> userList = userApi.findAll();
    ExcelExportUtils.exportExcel(userList, "人员信息", "人员信息表", User.class, "信息统计.xls", response);

  }


}
