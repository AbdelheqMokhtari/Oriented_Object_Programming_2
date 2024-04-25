public class Manager extends Employee implements EmployeeInformation{
    double bonus;


    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return (super.baseSalary + this.bonus) + this.calculateExperienceBonus();
    }

    @Override
    public void performWork() {
        System.out.println("the manager is managing !!!");
    }

    @Override
    public double calculateExperienceBonus() {
        return 200* super.yearOfExperience;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name : " + super.name);
        System.out.println("Base salary : " + super.baseSalary);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Total salary " + this.calculateSalary());
    }


}
