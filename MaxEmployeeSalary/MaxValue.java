import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Ram",100000));
        emp.add(new Employee(102,"Shyam",50000));
        emp.add(new Employee(103,"Hari",75000));

        Employee max = Collections.max(emp);
        System.out.println("Maximum Salary:"+max.getSalary()+" for employee ID: "+max.getId()+" with Employee.java name "+max.getName());
    }
}

