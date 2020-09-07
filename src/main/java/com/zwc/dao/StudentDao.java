package com.zwc.dao;

import com.zwc.domain.Student;

import java.util.List;


public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectAllStudents();
}
