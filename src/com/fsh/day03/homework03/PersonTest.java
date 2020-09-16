package com.fsh.day03.homework03;

import java.util.TreeSet;

public class PersonTest {

    public static void main(String []args){
        TreeSet<Person> set = new TreeSet<>();
        Person p1 = new Person("张一",15);
        Person p2 = new Person("张三",17);
        Person p3 = new Person("张三",15);
       // Person p4 = new Person("张三",15);
        Person p5 = new Person("张三",16);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //set.add(p4);
        set.add(p5);

        for (Person person : set) {
            System.out.println(person);
        }
    }




}
