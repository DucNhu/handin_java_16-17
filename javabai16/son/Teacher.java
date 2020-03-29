package com.company.javabai16.son;

import com.company.javabai16.dad.Person;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    //
    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course))
                return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        boolean found = false;
        int courseIndex = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                courseIndex = 1;
                found = true;
                break;
            }
        }
        if (found) {
                for (int a = courseIndex; a < numCourses - 1; a++) {
                    courses[a] = courses[a + 1];
                }
                numCourses--;
                return true;
            }
            else {
                return false;
            }
        }
    }
