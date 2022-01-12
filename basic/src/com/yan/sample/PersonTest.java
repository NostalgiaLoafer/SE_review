package com.yan.sample;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(95, "江泽民");
        System.out.println(p1);
        p1.setAge(100);
        System.out.println(p1);
    }

}
