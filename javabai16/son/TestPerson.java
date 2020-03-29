package com.company.javabai16.son;

public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("Duc Nhu", "Ducnhu happy");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 69);
        s1.printGrades();
        System.out.println("Avarage is " + s1.getAverageGrade());
//
        Teacher t1 = new Teacher("Kim thi", "8 TTyc");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM13"};
        for(String cs: courses) {
            if(t1.addCourse(cs)) {
                System.out.println(cs + "added");
            }
            else {
                System.out.println(cs + "cannot be added");
            }
        }
        for(String ss: courses) {
            if(t1.addCourse(ss)) {
                System.out.println(ss + "removed");
            }
            else {
                System.out.println(ss + " cannot be added");
            }
        }
    }
}
