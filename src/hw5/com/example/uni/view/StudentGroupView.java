package hw5.com.example.uni.view;

import hw5.com.example.uni.controller.StudentGroupController;
import hw5.com.example.uni.model.StudentsGroup;

import java.util.List;
import java.util.Scanner;

public class StudentGroupView {

    private StudentGroupController controller = new StudentGroupController();



    private StudentsGroup createGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID студента");
        int idStudent = scanner.nextInt();
        return new StudentsGroup();
    }

    private List<StudentsGroup> getStudentGroup(){}

}
