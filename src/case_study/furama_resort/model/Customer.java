package case_study.furama_resort.model;

import java.util.Date;

public class Customer extends Person{
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, Date dateOfBirth, String gender, String idNumber, String phoneNumber, String email, String idEmployee, String educationLevel, String position, double salary) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhacHang='" + idCustomer + '\'' +
                ", loaiKhach='" + typeCustomer + '\'' +
                ", diaChi='" + address + '\'' +
                "} " + super.toString();
    }
}
