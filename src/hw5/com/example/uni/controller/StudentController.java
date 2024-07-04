package hw5.com.example.uni.controller;

import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService service = new StudentService();

    public Student crateStudent(String fName, String lName, int idgroup) {
        return service.crateStudent(fName, lName, idgroup);

    }


    public Student getById(int id) {
        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return student;
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }


}
