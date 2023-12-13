package Seminar_5_HW.model;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeaherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId +
                ", firstName=" + super.getFirstName() +
                ", secondName=" + super.getSecondName() +
                ", lastName=" + super.getLastName() + "]";
    }
}
