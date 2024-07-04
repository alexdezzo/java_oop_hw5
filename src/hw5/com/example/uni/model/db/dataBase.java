package hw5.com.example.uni.model.db;

import hw5.com.example.uni.model.StudentsGroup;
import hw5.com.example.uni.model.impl.Student;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class dataBase {


    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudentsGroup> studentGroupDB = new ArrayList<>();


    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Ivan", "Ivanov", 1);
        Teacher teacher2 = new Teacher(2, "Viktor", "Homes", 2);

//        teacher.addGroupId(1);
        teachersDB.add(teacher);
        teachersDB.add(teacher2);

        Student student = new Student(2, "Vasya", "Petrov", 1);
        Student student2 = new Student(3,"Mihkail", "Paluch",2);
        studentsDB.add(student);
        studentsDB.add(student2);
    }

}
