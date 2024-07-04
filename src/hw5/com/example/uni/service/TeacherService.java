package hw5.com.example.uni.service;

import hw5.com.example.uni.model.db.dataBase;
import hw5.com.example.uni.model.impl.Teacher;

import java.util.List;

public class TeacherService {


    public Teacher createTeacher(String fName, String lName,int groupID){
        int id;
        int size = dataBase.teachersDB.size();
        if (size == 0){
            id = 1;
        } else {
            id = size + 1;
        }

        Teacher teacher = new Teacher(id, fName, lName, groupID);
        dataBase.teachersDB.add(teacher);
        return teacher;
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = dataBase.teachersDB
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null){
            throw new Exception("Teacher not found");
        }
        return teacher;
    }

//    public void addGroupId(int groupId){ // убрать в сервис (ошибка проектирования)!!
//        groups.add(groupId);
//    }



    public List<Teacher> getAllTeachers(){
        return dataBase.teachersDB;
    }

}
