package ua.opnu;

public class Student extends Person {
    public String group;
    private String studentId;

    public Student(String surname, String name, int age, String group, String studentId) {
        super(surname, name, age);
        this.group = group;
        this.studentId = studentId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("Студент групи %s, %s, %s, вік: %d. Номер студентського квитка: %s",
                group, getSurname(), getName(), getAge(), studentId);
    }
}
