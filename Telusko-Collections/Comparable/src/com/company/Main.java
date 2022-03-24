package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(1, 55));
        studs.add(new Student(2, 75));
        studs.add(new Student(3, 65));
        studs.add(new Student(4, 15));
        studs.add(new Student(5, 95));

//        Collections.sort(studs, (s1, s2) -> {
//            return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;
//        });


        Collections.sort(studs); // uses the compareTo method

        for(Student s : studs){
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student s) {

        return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
    }
}