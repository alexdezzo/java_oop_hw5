package hw5.com.example.uni.controller;

import hw5.com.example.uni.model.impl.Teacher;
import hw5.com.example.uni.service.TeacherService;

import java.util.List;

public class TeachersController {
    private TeacherService service = new TeacherService();



    public Teacher createTeacher(String fName, String lName, int groupID){
        return service.createTeacher(fName, lName, groupID);
    }


    public Teacher getById(int id){
        Teacher teacher = null;

        try {
            teacher = service.getById(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return teacher;

    }

    public List<Teacher> getAllTeachers(){
        return service.getAllTeachers();
    }







}
