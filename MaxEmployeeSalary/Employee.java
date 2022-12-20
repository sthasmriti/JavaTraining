
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private long salary;

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.getSalary()>o.getSalary()){
            return 1;
        }else if(this.getSalary()<o.getSalary()){
            return -1;
        }
        return 0;
    }
}