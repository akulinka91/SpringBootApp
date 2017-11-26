package com.akulina.Dao;

import com.akulina.Entity.Student;

import java.util.Collection;

/**
 * Created by User on 19.11.2017.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
