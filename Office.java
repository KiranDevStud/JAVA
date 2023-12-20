class Employee {
    int age;
    String name, address;
    long phno;
    double salary;

    Employee(String name, String address, int age, long phno, double salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
    }

    double print_salary() {
        return salary;
    }

    void print_details() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phno);
    }
}

class Manager extends Employee {
    String specialization;

    Manager(String name, String address, int age, long phno, double salary, String specialization) {
        super(name, address, age, phno, salary);
        this.specialization = specialization;
    }
}

class Officer extends Employee {
    String department;

    Officer(String name, String address, int age, long phno, double salary, String department) {
        super(name, address, age, phno, salary);
        this.department = department;
    }
}

public class Office {
    public static void main(String args[]) {
        Manager obm = new Manager("John", "Kochi", 47, 9478745778L, 150000, "HR");
        Officer obo = new Officer("Doe", "Kottayam", 26, 6865946564L, 750000, "Sales");
        
        obm.print_details();
        System.out.println("Specialization: " + obm.specialization);
        System.out.println("Salary : "+obm.print_salary()+"\n\n");
        
        obo.print_details();
        System.out.println("Department: " + obo.department);
        System.out.println("Salary : "+obo.print_salary());
    }
}
