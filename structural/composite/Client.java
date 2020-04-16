package structural.composite;

import structural.composite.composites.CompanyDirectory;
import structural.composite.leaves.Developer;
import structural.composite.leaves.Manager;

public class Client {
    public static void main(String[] args){
        Developer dev1 = new Developer(101, "Mr.Hello World", "Junior Developer");
        Developer dev2 = new Developer(102, "คุณสวัสดี ชาวโลก", "Middle Developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(201, "AAA bb c", "SEO Manager");
        Manager man2 = new Manager(202, "กกก ขข ค", "Something Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);

        directory.showEmployeeDetails();
    }
}