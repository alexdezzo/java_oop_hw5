package hw5.com.example.uni.controller;

import hw5.com.example.uni.model.StudentsGroup;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;
import hw5.com.example.uni.service.StudentGroupService;

import java.util.List;

public class StudentGroupController {
    private StudentGroupService service = new StudentGroupService();
    private TeachersController teacherService = new TeachersController();


    public StudentsGroup getStudentGroup(int teacher, List<Integer> s) {
        return service.getStudentGroup(teacherService.getById(teacher), s);
    }

    public List<StudentsGroup> getAllStudentsGroup() {
        return service.getAllStudentsGroup();
    }


}
