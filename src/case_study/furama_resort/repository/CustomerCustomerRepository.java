package case_study.furama_resort.repository;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.utils.ReadWrite;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerCustomerRepository implements ICustomerRepository {
    private final String pathFile = "src/case_study/furama_resort/data/customer.csv";

    @Override
    public List<Customer> getCustomerList() {
        List<Customer> customerList= new ArrayList<>();
        List<String> stringList;
        try {
            stringList = ReadWrite.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Customer customer = new Customer(
                        array[1], //hoten
                        dateFormat.parse(array[2]), //ngaysinh
                        array[3], //gioitinh
                        array[4], //cmnd
                        array[5], //dt
                        array[6], //email
                        array[0], //idkh
                        array[7], //kieuKH
                        array[8] //diachi
                );
                customerList.add(customer);
            }

        } catch (IOException | ParseException e) {
            System.out.println("Lỗi đọc file");
        }
        return customerList;
    }
    @Override
    public boolean add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCsv());
        try {
            ss8_clean_code.util.ReadWrite.writeFileCSV(pathFile, stringList, true);
        } catch (IOException e) {
            System.out.println("Error write file");
            return false;
        }
        return true;
    }

    @Override
    public Customer findById(String id) {
        List<Customer> customerList = getCustomerList();
        for(Customer customer:customerList){
            if(customer.getIdCustomer().equals(id)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void updateFile(Customer customerEdit) {
        List<Customer> customerList = getCustomerList();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getIdCustomer(), customerEdit.getIdCustomer())) {
                customerList.set(i, customerEdit);
            }
        }

        for(Customer customer:customerList){
            stringList.add(customer.getInfoToCsv());
        }
        try {
            ReadWrite.writeFileCSV(pathFile,stringList,false);
        } catch (IOException e) {
            System.out.println("Error write File" + e.getMessage());
        }
    }
}
