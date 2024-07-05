package hw5.com.example.uni.view;

import hw5.com.example.uni.controller.StudentController;
import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    public void stat() {
//        dataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студентов\n2 - найти студента по его ID\n3 - распечатать инфу по студентам\n4 - Перейти к созданию учителя\n5 - создать учебную группу\n6 - выход");
            switch (scanner.nextInt()) {
                case 1 -> crateStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> new TeacherView().Start();
                case 5 -> new StudentGroupView().start();
                case 6 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private StudentController controller = new StudentController();
//    private TeacherView tv = new TeacherView();

    private Student crateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String fname = scanner.nextLine();
        System.out.println("Введите фамилию");
        String lname = scanner.nextLine();
        System.out.println("Введите номер группы");
        int groupId = scanner.nextInt();
        Student student = controller.crateStudent(fname, lname, groupId);
        System.out.println(student);
        return student;
    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента для поиска");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudents() {
        List<Student> student = controller.getAllStudents();
        System.out.println(student);
        return student;

    }


}
