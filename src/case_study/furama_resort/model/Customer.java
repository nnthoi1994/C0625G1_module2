package case_study.furama_resort.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer extends Person{
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, Date dateOfBirth, String gender, String idNumber, String phoneNumber, String email, String idCustomer, String typeCustomer, String address) {
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
        return  "ID customer='" + idCustomer + '\'' +
                ", Type customer='" + typeCustomer + '\'' +
                ", Adress='" + address + '\'' +
                " " + super.toString();
    }

    public String getInfoToCsv(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhFormatted = dateFormat.format(this.getDateOfBirth());
        return this.getIdCustomer() + ","+ this.getName() + "," +ngaySinhFormatted + "," +this.getGender() + "," +this.getIdNumber() + "," +this.getPhoneNumber() + ","  +this.getEmail()+ ","  +this.getTypeCustomer() + "," +this.getAddress();
    }
}
