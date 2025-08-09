package pkg_08_07_2025_JDBC;

public class StudentPOJO {
    private int id;
    private String name;
    private int marks;

    // Default constructor
    public StudentPOJO() {
        // Empty constructor needed for manual setters
    }

    // Parameterized constructor (optional if not used)
    public StudentPOJO(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // toString method
    @Override
    public String toString() {
        return "StudentPOJO [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
