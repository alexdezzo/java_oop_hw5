package hw5.com.example.uni.model.impl;

import hw5.com.example.uni.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    public final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }




    public void addGroup(int id){ // убрать в сервис (ошибка проектирования)!!
        groups.add(id);
    }

}
