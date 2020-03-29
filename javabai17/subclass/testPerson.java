package com.company.javabai17.subclass;

import com.company.javabai17.superclass.Person;
import org.w3c.dom.ls.LSOutput;

public class testPerson {
    public static void main(String[] args) {
//        Person
        Person p1 = new Person("ducnhu", "Daik");
        System.out.println(p1);
//        Student
        Student st1 = new Student("ducnhudsik", "AN lau", " pro", 2020, 2.0);
        st1.setFee(3.2);
        System.out.println(st1);
//   Staff
        Staff s1 = new Staff("duc", "String", "lQD", 90);
        System.out.println(s1);
    }

}
