package hw5.com.example.uni.model;

public abstract class User {

    protected int id;
    protected String firstName;
    protected String lastName;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + " id = %s, first_name = %s, last_name = %s", id, firstName, lastName);
    }
}
