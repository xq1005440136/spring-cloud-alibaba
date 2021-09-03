package com.md.utils;

import java.io.Serializable;
import javax.naming.directory.SearchResult;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 15:01
 * @Version 1.0
 */
public class ResultReturn<T> implements Serializable {

  private Integer msg;
  private String content;
  private T t;
  private T respData;
  private String refUrl;
  private String ssoId;
  private String ssoValue;
  private Object other;
  private Object businessData;

  public void setBusinessData(Object businessData) {
    this.businessData = businessData;
  }

  public Object getBusinessData() {
    return this.businessData;
  }

  public void setOther(Object other) {
    this.other = other;
  }

  public Object getOther() {
    return this.other;
  }

  public void setRespData(T respData) {
    this.respData = respData;
  }

  public T getRespData() {
    return this.respData;
  }

  public String getSsoId() {
    return this.ssoId;
  }

  public void setSsoId(String ssoId) {
    this.ssoId = ssoId;
  }

  public String getSsoValue() {
    return this.ssoValue;
  }

  public void setSsoValue(String ssoValue) {
    this.ssoValue = ssoValue;
  }

  public Integer getMsg() {
    return this.msg;
  }

  public void setMsg(Integer msg) {
    this.msg = msg;
  }

  public T getT() {
    return this.t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public String getRefUrl() {
    return this.refUrl;
  }

  public void setRefUrl(String refUrl) {
    this.refUrl = refUrl;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ResultReturn() {
  }

  public ResultReturn(Integer msg, String content, T t) {
    this.msg = msg;
    this.content = content;
    this.t = t;
  }

  public ResultReturn(String content) {
    this.msg = ReturnCode.R404;
    this.content = content;
    this.t = null;
  }

  public ResultReturn(String content, T t) {
    this.msg = ReturnCode.R404;
    this.content = content;
    this.t = t;
  }

  public ResultReturn(String content, String ssoId, String ssoValue) {
    this.content = content;
    this.ssoId = ssoId;
    this.ssoValue = ssoValue;
  }
}
