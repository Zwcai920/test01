package com.zwc.service.impl;

import com.zwc.dao.StudentDao;
import com.zwc.domain.Student;
import com.zwc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }


    @Override
    public int addStudent(Student student) {
        System.out.println("正在执行studentServiceImpl中的addStudent方法");
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> findStudents() {
        System.out.println("正在执行studentServiceImpl中的findStudents方法");
        return studentDao.selectAllStudents();
    }
}
