package com.md;

import com.alibaba.fastjson.JSON;
import com.md.utils.ResultReturn;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 14:52
 * @Version 1.0
 */
public class BaseInteceper implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    if(StringUtils.isBlank(request.getHeader("loginType"))){
       returnJsonError(request,response,"用户账号已在别处登录！");
       return false;
    }
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {

  }

  private void returnJsonError(HttpServletRequest request, HttpServletResponse response, String msg)
      throws Exception {
    response.setStatus(HttpStatus.OK.value());
    response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
    response.setCharacterEncoding("UTF-8");
    ResultReturn<String> resultReturn = new ResultReturn<String>("账号已在其他设备登录，请重新登录！");
    resultReturn.setMsg(303);
    response.getWriter().write(JSON.toJSONString(resultReturn));
  }
}
