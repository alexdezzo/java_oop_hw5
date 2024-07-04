package hw5.com.example.uni.view;

import hw5.com.example.uni.controller.TeachersController;
import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {

    public void Start(){
        dataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - создать учителя\n2 - найти учителя по его ID\n3 - отобразить список учителей\n4 - выход");
            switch (scanner.nextInt()){
                case 1 -> createTeacher();
                case 2 -> getById();
                case 3 -> getAllTeachers();
                case 4 -> System.exit(0);
                default -> System.out.println("Неверная операция");
            }

        }
    }


    private TeachersController controller = new TeachersController();


    private Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя учителя");
        String fName = scanner.nextLine();
        System.out.println("Введите фамилию учителя");
        String lName = scanner.nextLine();
        Teacher teacher = controller.createTeacher(fName, lName);
        System.out.println(teacher);
        return teacher;
    }

    private Teacher getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID учителя для поиска");
        int id = scanner.nextInt();
        Teacher teacher = controller.getById(id);
        System.out.println(teacher);
        return teacher;
    }

    private List<Teacher> getAllTeachers() {
        List<Teacher> teachers = controller.getAllTeachers();
        System.out.println(teachers);
        return teachers;
    }


}
