package com.fsh.day03.homework01;
/*
 * 1.List作业
模拟登陆，编写用户类，测试类。
  1>.给集合中存储5个用户对象。
  2>.从控制台输入用户名和密码，和集合中的对象信息进行比较，
  相同表示成功，不同表示失败。
  3>.有三次输入机会。
 */

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
