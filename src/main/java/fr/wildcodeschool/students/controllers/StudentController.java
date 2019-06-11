package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.dao.StudentDao;

import fr.wildcodeschool.students.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentRepoBdx")
    public StudentDao studentDaoBdx;

    @Autowired
    @Qualifier("studentRepoTls")
    public StudentDao studentDaoTls;

    @ResponseBody
    @GetMapping("/studentsBdx")
    public List<Student> getStudentsBdx() {

        return studentDaoBdx.findAll();
    }

    @ResponseBody
    @GetMapping("/studentsTls")
    public List<Student> getStudentsTls() {

        return studentDaoTls.findAll();
    }


    }
