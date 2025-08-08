package ss5_access_modifier.manage;

public class Student {
    private int id;
    String name;
    public static String school ="BK";

    public Student() {

    }
    public Student(int id, String name) {
        this.id =id;
        this.name = name;
    }
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school" + school+
                '}';
    }
}
