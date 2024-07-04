package hw5.com.example.uni.model.impl;

import hw5.com.example.uni.model.User;

public class Student extends User {


    int groupId; // к какой группе относиться студент

    public Student(int id, String firstName, String lastName, int groupId) {
        super(id, firstName, lastName);
        this.groupId = groupId;
    }
}
