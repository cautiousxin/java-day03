package com.fsh.day03.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("张一","123"));
        userList.add(new User("张二","123"));
        userList.add(new User("张三","123"));
        userList.add(new User("张四","123"));
        userList.add(new User("张五","123"));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String userName = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        int count = 1;
        while(count!=3) {
            for (User user : userList) {
                if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
                    System.out.println("登录成功");
                    return;
                }
            }
            System.out.println("账号密码错误或者用户不存在，重新输入！");
            System.out.println("请输入姓名");
            userName = sc.next();
            System.out.println("请输入密码：");
            password = sc.next();
            count++;
        }
        if(count == 3){
            System.out.println("输入机会已经用完，账户锁定，无法登陆");
        }
    }
}
