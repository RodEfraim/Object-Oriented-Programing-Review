package Business;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public float getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    /** Returns the area of this Shape.Rectangle instance */
    public String getLastName() {
        return lastName;
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percentage) {
        double decimalPercentage = percentage / 100.0;
        System.out.println("decimalPercentage: " + decimalPercentage);
        double raise = this.salary * decimalPercentage;
        System.out.println("raise: " + raise);

        this.salary = (int) raise + this.salary;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + id + " name=" + getName() + " salary=" + salary + "]";
    }

}
