package structural.composite.leaves;

import structural.composite.components.Employee;

public class Developer extends Employee {
    final private String name;
    final private long empId;
    final private String position;

    public Developer(long empId, String name, String position){
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.empId + " " + this.name);
    }

}