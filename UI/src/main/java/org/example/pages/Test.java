package org.example.pages;

import org.example.models.Student;

public class Test {

    public void creatNewStudent (Student student){

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getCurrentAddress());
        System.out.println(student.getEmail());
        System.out.println(student.getPhoneNumber());

    }
}
