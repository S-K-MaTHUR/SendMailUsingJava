package org.geekster.controller;

import org.geekster.dao.Dao;
import org.geekster.model.Student;
import org.geekster.util.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Dao dao;
    @Autowired
    private Teacher teacher;
    @PostMapping("add-student")
    public String addStudent(@RequestBody Student student){
        dao.addStudent(student);
        teacher.teacher();
        return "Student added into the database";
    }


}
