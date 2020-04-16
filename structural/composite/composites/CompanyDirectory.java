package structural.composite.composites;

import java.util.ArrayList;
import java.util.List;

import structural.composite.components.Employee;

public class CompanyDirectory extends Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for(Employee emp : this.employeeList){
            emp.showEmployeeDetails();
        }
    }

    @Override
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    @Override
    public void removeEmployee(Employee emp){
        employeeList.remove(emp);
    }


}