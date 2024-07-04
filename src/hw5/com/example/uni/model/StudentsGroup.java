package hw5.com.example.uni.model;

import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.List;

public class StudentsGroup {
    public static int id;
    public Teacher teacher;
    public static List<Student> students;


    public StudentsGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
        StudentsGroup.id = dataBase.studentGroupDB.size()+1;
    }

    public StudentsGroup(Teacher t){
        this.teacher = t;
        StudentsGroup.id = dataBase.studentGroupDB.size() + 1;
    }

}
