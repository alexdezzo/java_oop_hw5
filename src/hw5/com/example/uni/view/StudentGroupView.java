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
            System.out.println("1 - создать учебную группу\n2 - показать учебные группы\n3 - вернуться назад\n4 - выход из программы");
            switch (scanner.nextInt()){
                case 1 -> getStudentGroup();
                case 2 -> getAllStudentsGroup();
                case 3 -> new StudentView().stat();
                case 4 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

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

    private List<StudentsGroup> getAllStudentsGroup() {
        List<StudentsGroup> studentsGroups = controller.getAllStudentsGroup();
        System.out.println(studentsGroups);
        return studentsGroups;

    }

}
