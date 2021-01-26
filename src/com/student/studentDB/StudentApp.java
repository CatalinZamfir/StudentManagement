package com.student.studentDB;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //cati studenti vrem sa adaugam
        System.out.println("Enter number of student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        //creaza n numar de studenti
        for(int n = 0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }



    }





}
