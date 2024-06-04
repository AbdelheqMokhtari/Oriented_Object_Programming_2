

    package test.inheritance;

    class Vehicle {
    protected String brand = "Ford";   
    Vehicle(String brand){
    this.brand=brand;
    }  
    // Vehicle attribute
    public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
    }
    }

    class Car extends Vehicle {
    protected String modelName = "Mustang";    // Car attribute
    Car(String modelName,String brand){
    super(brand);
    this.modelName=modelName;
    }}

    public class Inheritance {

    public static void main(String[] args) {
     Shape s= new Shape("red",true);
     System.out.println(s);

    //computer class
    // Create instances of Laptop and SmartPhone
    Laptop laptop = new Laptop("Dell", 15.6);
    SmartPhone phone = new SmartPhone("Apple", "iOS");
    // Demonstrate methods of Laptop and SmartPhone
    laptop.boot(); // Output: Starting the computer...
    laptop.sleepMode(); // Output: Sleep mode for the laptop...
    phone.boot(); // Output: Starting the computer...
    phone.call(); // Output: Making a call from the smartphone..

    //class person

    Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
    System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + 
    employee1.getEmployeeId() + ")");
    Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
    System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + 
    employee2.getEmployeeId() + ")");




    Circle c= new Circle(3.00,"orannge",true);
    //  System.out.println(c);
    BankAccount b=new BankAccount(1000);
    System.out.print(b.getAccountNumber());
    System.out.println("Create a Bank Account object with initial balance of $500:");
    //Create a BankAccount object  with initial balance of $500
    BankAccount BA1234 = new BankAccount(500);
    // Deposit $1000 into account BA1234
    System.out.println("Deposit $1000 into account "+BA1234.getAccountNumber());
    BA1234.deposit(1000); 
    System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());
    // Withdraw $600 from account BA1234
    System.out.println("Withdraw $600 from account"+BA1234.getAccountNumber());
    BA1234.withdraw(600);
    System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());
    // Create a SavingsAccount object ) with initial balance of $450
    System.out.println("\nCreate a SavingsAccount object with initial balance of $450:");
    SavingsAccount SA1234 = new SavingsAccount(450);
    // Withdraw $300 from SA1234
    SA1234.withdraw(300);
    System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());
    // Create a SavingsAccount object  with initial balance of $300
    System.out.println("\nCreate a SavingsAccount object  with initial balance of $300:");
    SavingsAccount SA1000 = new SavingsAccount(300);
    // Withdraw $250 from SA1000 (balance falls below $100)
    System.out.println("Try to withdraw $250 from "+ SA1234.getAccountNumber());
    SA1000.withdraw(250);
    System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());  	




    // Exercise 1 - Pixel and ColoredPixel usage
    Pixel pixel = new Pixel(10, 20);
    System.out.println("Pixel coordinates: (" + pixel.getX() + ", " + pixel.getY() + ")");

    int[] color = {255, 100, 50}; // Example RGB values
    ColoredPixel coloredPixel = new ColoredPixel(5,5,color);
    System.out.println("ColoredPixel coordinates: (" + coloredPixel.getX() + ", " + coloredPixel.getY() + ")");
    System.out.println("ColoredPixel color: R" + coloredPixel.getColor()[0] + " G" + coloredPixel.getColor()[1] + " B" + coloredPixel.getColor()[2]);





    // Exercise 2 - Segment and Rectangle usage
    int[] color1 = {255, 0, 0}; // Red
    int[] color2 = {0, 255, 0}; // Green
    int[] color3 = {0, 0, 255}; // 
    int[] color4 = {255, 255, 0}; // 
    ColoredPixel coloredPixel1 = new ColoredPixel(5,5,color1);
    ColoredPixel coloredPixel2 = new ColoredPixel(10,10,color2);
    Segment segment = new Segment(coloredPixel1,coloredPixel2);


    System.out.println("Segment coordinates:");
    System.out.println("Pixel 1: (" + segment.getPixel1().getX() + ", " + segment.getPixel1().getY() + ")");
    System.out.println("Pixel 2: (" + segment.getPixel2().getX() + ", " + segment.getPixel2().getY() + ")");

    // Rectangle using inheritance
   /* Rectangle rectangleInheritance = new Rectangle(coloredPixel1, coloredPixel2);
    System.out.println("\nRectangle using inheritance:");
    System.out.println("Pixel 1: (" + rectangleInheritance.getPixel1().getX() + ", " + rectangleInheritance.getPixel1().getY() + ")");
    System.out.println("Pixel 2: (" + rectangleInheritance.getPixel2().getX() + ", " + rectangleInheritance.getPixel2().getY() + ")");

    // Rectangle using composition
    Segment segment1 = new Segment(coloredPixel1, new  ColoredPixel(0, 10, color4));
    Segment segment2 = new Segment(new  ColoredPixel(10, 0, color3), coloredPixel2);
    Rectangle1 rectangleComposition = new Rectangle1(segment1, segment2);
    System.out.println("\nRectangle using composition:");
    System.out.println("Segment 1 Pixel 1: (" + rectangleComposition.getSegment1().getPixel1().getX() + ", " + rectangleComposition.getSegment1().getPixel1().getY() + ")");
    System.out.println("Segment 1 Pixel 2: (" + rectangleComposition.getSegment1().getPixel2().getX() + ", " + rectangleComposition.getSegment1().getPixel2().getY() + ")");
    System.out.println("Segment 2 Pixel 1: (" + rectangleComposition.getSegment2().getPixel1().getX() + ", " + rectangleComposition.getSegment2().getPixel1().getY() + ")");
    System.out.println("Segment 2 Pixel 2: (" + rectangleComposition.getSegment2().getPixel2().getX() + ", " + rectangleComposition.getSegment2().getPixel2().getY() + ")");
*/
    } 
    }
