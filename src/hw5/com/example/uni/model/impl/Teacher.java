package hw5.com.example.uni.model.impl;

import hw5.com.example.uni.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    public final List<Integer> groups = new ArrayList<>();

    int groupID; // к какой группе относится учитель

    public Teacher(int id, String firstName, String lastName, int groupID) {
        super(id, firstName, lastName);
        this.groupID = groupID;
    }


    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + " id = %s, first_name = %s, last_name = %s, GROUP ID: %s", id, firstName, lastName, groupID);
    }






}
