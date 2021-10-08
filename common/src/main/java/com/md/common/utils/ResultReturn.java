package com.md.common.utils;

import java.io.Serializable;

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
  public ResultReturn(T t){
    this.setRespData(t);
    this.setContent("操作成功");
    this.setMsg(ReturnCode.R201);
  }
  public ResultReturn(String url,String msg){
    this.setContent(msg);
    this.setRefUrl(url);
    this.setMsg(ReturnCode.R201);
  }

  public ResultReturn(Integer msg, String content, T t) {
    this.msg = msg;
    this.content = content;
    this.t = t;
  }
  public ResultReturn(Integer msg, String content) {
    this.msg = msg;
    this.content = content;
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

  public static <T>ResultReturn<T> success(T t){
    return new ResultReturn<>(t);
  }
  public static <T>ResultReturn<T> success(String url,T t){
    return new ResultReturn<>(url,t);
  }

  public static <T>ResultReturn<T> successUrl(String url){
    return new ResultReturn<>(url,"success");
  }

  public static <T>ResultReturn<T> successUrl(String url,T t){
    return new ResultReturn<>(url,t);
  }

  public static <T>ResultReturn<T> success(String msg){
    return new ResultReturn<>(ReturnCode.R201,msg);
  }

  public static <T> ResultReturn <T> error(String msg,T t){
    return new ResultReturn<>(ReturnCode.R302,msg,t);
  }
  public static <T> ResultReturn <T> errorCode(Integer code,String msg){
    return new ResultReturn<>(code,msg);
  }
  public static <T> ResultReturn<T> error(String msg){
    return new ResultReturn<>(ReturnCode.R302,msg);
  }

  public static class DefaultView {
  }
}
