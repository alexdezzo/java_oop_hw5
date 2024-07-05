package hw5.com.example.uni.service;

import hw5.com.example.uni.controller.StudentController;
import hw5.com.example.uni.model.StudentsGroup;
import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {


    public StudentsGroup createGroup(Teacher teacher, List<Student> students) {
        int id;
        int size = dataBase.studentGroupDB.size();
        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        StudentsGroup studentsGroup = new StudentsGroup(id, teacher, students);
        dataBase.studentGroupDB.add(studentsGroup);
        return studentsGroup;

    }

    public StudentsGroup getStudentGroup(Teacher teacher, List<Integer> s) {
        StudentController studentController = new StudentController();
        List<Student> students = new ArrayList<>();
        for (int i : s) {
            Student student = studentController.getById(i);
            students.add(student);
        }
        System.out.println("Группа создана!");
//        System.out.println(teacher);
//        System.out.println(students);
        return createGroup(teacher, students);
    }

    public List<StudentsGroup> getAllStudentsGroup(){
        return dataBase.studentGroupDB;
    }


}
