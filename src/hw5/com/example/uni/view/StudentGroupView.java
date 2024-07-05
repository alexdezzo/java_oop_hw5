package hw5.com.example.uni.view;

import hw5.com.example.uni.controller.StudentGroupController;
import hw5.com.example.uni.model.StudentsGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGroupView {

    private StudentGroupController controller = new StudentGroupController();

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - создать учебную группу\n2 - вернуться назад\n3 - выход из программы");
            switch (scanner.nextInt()){
                case 1 -> getStudentGroup();
                case 2 -> new StudentView().stat();
                case 3 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }


//    private StudentsGroup createGroup(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ID студента");
//        int idStudent = scanner.nextInt();
//        return new StudentsGroup();
//    }

    private StudentsGroup getStudentGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id учителя");
        int teacherId = scanner.nextInt();
        List <Integer> sc = new ArrayList<>();
        System.out.println("Введите колличество студентов:");
        int count = scanner.nextInt();
        System.out.println("Введите id студента");
        for (int i = 0; i != count; i++) {
            sc.add(scanner.nextInt());

        }

        return controller.getStudentGroup(teacherId, sc);
    }

}
