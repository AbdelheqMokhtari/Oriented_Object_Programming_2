public abstract class Employee {
    protected String name;
    protected double baseSalary;
    int yearOfExperience;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }


    public abstract void displayInfo();
}
