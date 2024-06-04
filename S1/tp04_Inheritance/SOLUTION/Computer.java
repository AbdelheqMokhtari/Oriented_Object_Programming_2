
package test.inheritance;

class Computer {
 protected String brand;
 public Computer(String brand) {
 this.brand = brand;
 }
 public void boot() {
 System.out.println("Starting the computer...");
 }
 public void shutdown() {
 System.out.println("Shutting down the computer...");
 }
}
// Child class Laptop inheriting from Computer
class Laptop extends Computer {
 private double screenSize;
 public Laptop(String brand, double screenSize) {
 super(brand);
 this.screenSize = screenSize;
 }
 public void sleepMode() {
 System.out.println("Sleep mode for the laptop...");
 }
}
// Child class SmartPhone inheriting from Computer
class SmartPhone extends Computer {
 private String operatingSystem;
 public SmartPhone(String brand, String operatingSystem) {
 super(brand);
 this.operatingSystem = operatingSystem;
 }
 public void call() {
 System.out.println("Making a call from the smartphone...");
 }
}
