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
//        dataBase.studentGroupDB.add(teacher, students);
        return new StudentsGroup(teacher, students);

    }


//    public addToGroup(Teacher teacher, List<Student> students){
//        dataBase.studentGroupDB.add();
//    }


    public int getID() {
        return StudentsGroup.id;
    }

//    public void addStudents(List<Student> students) {
//        StudentsGroup.students.addAll(students);
//    }

    public StudentsGroup getStudentGroup(Teacher teacher, List<Integer> s){
        StudentController studentController = new StudentController();
        List<Student> students = new ArrayList<>();
        for (int i : s) {
            Student student = studentController.getById(i);
            students.add(student);
        }

        System.out.println(teacher);
        System.out.println(students);
        return createGroup(teacher, students);
    }


//    public List<StudentsGroup> getStudentGroup() {
//        return dataBase.studentGroupDB;
//    }

}
