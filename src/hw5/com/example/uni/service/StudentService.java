package hw5.com.example.uni.service;

import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Student;

import java.util.List;

public class StudentService {

    public Student crateStudent(String fName, String lName, int idGroup) { // только за создание студента (чистый метод)
        int id;
        int size = dataBase.studentsDB.size();
        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Student student = new Student(id, fName, lName, idGroup);
        dataBase.studentsDB.add(student);
        return student;
    }


    public Student getById(int id) throws Exception {
        Student student = dataBase.studentsDB // список студентов
                .stream() // запускаем поток для вычесления
                .filter(s -> s.getId() == id) // вызываем метод filter фильтруя по условию (s =  student)
                .findFirst() // если нашли первого найденного *в данном случае он будет уникальным, возвращает найденного студента
                .orElse(null);// если не нашел, вернуть null. orElse закрывает поток (.stream)
        if (student == null) {
            throw new Exception("Student not found"); // проверяемое исключение
        }

        return student;
    }


    public List<Student> getAllStudents(){
        return dataBase.studentsDB;
    }

}
