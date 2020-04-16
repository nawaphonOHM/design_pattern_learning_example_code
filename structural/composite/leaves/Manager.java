package structural.composite.leaves;

import structural.composite.components.Employee;

public class Manager extends Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position){
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.empId + " " + this.name);
    }

}