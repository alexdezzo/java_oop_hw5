package hw5.com.example.uni.service;

import hw5.com.example.uni.model.StudentsGroup;
import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.List;

public class StudentGroupService {



    public void addToGroup(List<Student> students){
        StudentsGroup.students.addAll(students);
    }


    public StudentsGroup createGroup(Teacher teacher, List<Student> students){
        return new StudentsGroup(teacher, students);
    }


    public List<StudentsGroup> getStudentGroup(){
        return dataBase.studentGroupDB;
    }

}
