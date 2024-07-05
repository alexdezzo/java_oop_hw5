package hw5.com.example.uni.model;

import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.List;

public class StudentsGroup {
    public static int id;
    public Teacher teacher;
    public static List<Student> students;


    public StudentsGroup(int id, Teacher teacher, List<Student> students) {
        this.id = id;
        this.students = students;
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + " id группы = %s, Учитель у группы = %s, студенты = %s", id, teacher, students);
    }
}
