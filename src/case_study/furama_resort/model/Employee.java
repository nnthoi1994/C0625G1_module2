package case_study.furama_resort.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person{
    private String idEmployee;
    private String educationLevel;
    private String position;
    private double salary;


    public Employee(String name, Date dateOfBirth, String gender, String idNumber, String phoneNumber, String email, String idEmployee, String educationLevel, String position, double salary) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }


    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfoToCsv(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhFormatted = dateFormat.format(this.getDateOfBirth());
        return this.getIdEmployee() + ","+ this.getName() + "," +ngaySinhFormatted + "," +this.getGender() + "," +this.getIdNumber() + "," +this.getPhoneNumber() + ","  +this.getEmail()+ ","  +this.getEducationLevel() + "," +this.getPosition() + "," +this.getSalary();
    }

    @Override
    public String toString() {
        return "ID Employee: '" + idEmployee + '\'' +
                ", Education level :'" + educationLevel + '\'' +
                ", Position: '" + position + '\'' +
                ", Salary: '" + salary + '\'' +
                " " + super.toString();
    }
}
