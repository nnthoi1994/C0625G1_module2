package ss5_access_modifier.manage;

public class Product {
    // class chức năng quan lý đối tượng student = >CRUD
    private static Student[] studentList = new Student[100];

    static {
        Student student1 = new Student(1, "Chánh1");
        Student student2 = new Student(2, "Chánh2");
        studentList[0] = student1;
        studentList[1] = student2;
    }

    // phương hiển htij
    public Student[] getAll() {
        // xu ly gia tri null

        int count = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                count++;
            } else {
                break;
            }
        }

        Student[] students = new Student[count];
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                students[i] = studentList[i];
            } else {
                break;
            }
        }
        return students;
    }

    public void add(Student student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public Student find(int id) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && id == studentList[i].getId()) {
                return studentList[i];
            }
        }
        return null;
    }
}