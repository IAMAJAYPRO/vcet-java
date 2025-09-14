// Custom Exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String msg) { super(msg); }
}

// Base Class
abstract class Employee {
    String name;
    double salary;
    Employee(String name, double salary) throws InvalidSalaryException {
        if (salary < 0) throw new InvalidSalaryException("Salary cannot be negative");
        this.name = name; this.salary = salary;
    }
    abstract void displayDetails();
}

// Inheritance + Method Overriding
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String n, double s) throws InvalidSalaryException { super(n, s); }
    @Override void displayDetails() { System.out.println("Full-time: " + name + ", " + salary); }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String n, double s) throws InvalidSalaryException { super(n, s); }
    @Override void displayDetails() { System.out.println("Part-time: " + name + ", " + salary); }
}

// Interface Example
interface Bonus {
    void giveBonus();
}
class Manager extends FullTimeEmployee implements Bonus {
    Manager(String n, double s) throws InvalidSalaryException { super(n, s); }
    @Override public void giveBonus() { System.out.println(name + " gets a bonus!"); }
}

public class Except {
    public static void main(String[] args) {
        try {
            Employee e1 = new FullTimeEmployee("Ajay", 50000);
            Employee e2 = new PartTimeEmployee("Bob", 20000);
            Manager m = new Manager("Bibhav", 70000);

            e1.displayDetails();
            e2.displayDetails();
            m.displayDetails();
            m.giveBonus();

        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Null employee details");
        } finally {
            System.out.println("Employee system execution completed.");
        }
    }
}
