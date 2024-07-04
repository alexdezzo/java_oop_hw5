package hw5.com.example.uni.controller;

import hw5.com.example.uni.model.StudentsGroup;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;
import hw5.com.example.uni.service.StudentGroupService;

import java.util.List;

public class StudentGroupController {
    private StudentGroupService service = new StudentGroupService();
    private TeachersController tService = new TeachersController();


    private StudentsGroup createGroup(Teacher teacher, List<Student> students){
        return service.createGroup(teacher, students);
    }


    public List<StudentsGroup> getStudentGroup(){
        return service.getStudentGroup();
    }





}
