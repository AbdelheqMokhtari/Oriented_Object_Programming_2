public class Programmer extends Employee implements EmployeeInformation{
    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculateSalary() {
        return super.baseSalary + (this.hourlyRate * this.overtimeHours) + this.calculateExperienceBonus();
    }

    @Override
    public void performWork() {
        System.out.println("is programming !!!!! ");
    }

    @Override
    public double calculateExperienceBonus() {
        return 200*super.yearOfExperience;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Name : " + super.name);
        System.out.println("Base salary : " + super.baseSalary);
        System.out.println("Overtime hours : " + this.overtimeHours);
        System.out.println("Hourly rate : " + this.hourlyRate);
        System.out.println("Total salary " + this.calculateSalary());
    }
}
