package com.zwc.controller;

import com.zwc.domain.Student;
import com.zwc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        int rows = studentService.addStudent(student);
        if (rows>0){
            mv.addObject("msg","注册成功");
            mv.setViewName("success");
        }else {
            mv.addObject("msg","注册失败");
            mv.setViewName("fail");
        }
        return mv;
    }

    @RequestMapping("/findStudent.do")
    @ResponseBody
    public List<Student> queryStudent(){
        System.out.println("接受到了哟");
        List<Student> students = studentService.findStudents();
        return students;
    }
}
