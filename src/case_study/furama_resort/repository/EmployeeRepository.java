package case_study.furama_resort.repository;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.utils.ReadWrite;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private final String pathFile = "src/case_study/furama_resort/data/employee.csv";
@Override
    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList;
        try {
            stringList = ReadWrite.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Employee employee = new Employee(
                        array[1], //hoten
                        dateFormat.parse(array[2]), //ngaysinh
                        array[3], //gioitinh
                        array[4], //cmnd
                        array[5], //dt
                        array[6], //email
                        array[0], //idnv
                        array[7], //trinhdo
                        array[8], //vitri
                        Double.parseDouble(array[9]) //luong
                );
                employeeList.add(employee);
            }

        } catch (IOException | ParseException e) {
            System.out.println("Lỗi đọc file");
        }
        return employeeList;
    }
@Override
    public boolean add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToCsv());
        try {
            ss8_clean_code.util.ReadWrite.writeFileCSV(pathFile, stringList, true);
        } catch (IOException e) {
            System.out.println("Error write file");
            return false;
        }
        return true;
    }

    @Override
    public Employee findById(String id) {
    List<Employee> employeeList = getEmployeeList();
    for(Employee employee:employeeList){
        if(employee.getIdEmployee().equals(id)){
            return employee;
        }
    }
    return null;
    }

    @Override
    public void updateFile(Employee employeeEdit) {
        List<Employee> employeeList = getEmployeeList();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getIdEmployee(), employeeEdit.getIdEmployee())) {
                employeeList.set(i, employeeEdit);
            }
        }

        for(Employee employee:employeeList){
            stringList.add(employee.getInfoToCsv());
        }
        try {
            ReadWrite.writeFileCSV(pathFile,stringList,false);
        } catch (IOException e) {
            System.out.println("Error write File" + e.getMessage());
        }
    }
}



