package org.geekster.dao;

import org.geekster.HandleMail;
import org.geekster.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Dao {

    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);

        HandleMail mailer = new HandleMail();
        mailer.sendMail();
    }
}
