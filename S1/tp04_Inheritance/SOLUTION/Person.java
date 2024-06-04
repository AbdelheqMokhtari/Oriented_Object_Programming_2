
package test.inheritance;


public class Person {
 private String firstName;
 private String lastName;
 public Person(String firstName, String lastName) {
 this.firstName = firstName;
 this.lastName = lastName;
 }
 public String getFirstName() {
 return firstName;
         }
 public String getLastName() {
 return lastName;
 }
}
// Employee.java
// Child class Employee
class Employee extends Person {
 private int employeeId;
 private String jobTitle;
 public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
 super(firstName, lastName);
 this.employeeId = employeeId;
 this.jobTitle = jobTitle;
 }
 public int getEmployeeId() {
 return employeeId;
 }
 @Override
 public String getLastName() {
 return super.getLastName() + ", " + jobTitle;
 }
}