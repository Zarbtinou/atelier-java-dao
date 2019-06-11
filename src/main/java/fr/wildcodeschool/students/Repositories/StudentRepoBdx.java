package fr.wildcodeschool.students.Repositories;


import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentRepoBdx implements StudentDao {

    @Override
    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob"));
        students.add(new Student("Marley"));
        students.add(new Student("ForEver"));
        return students;
    }
}