/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.solution;

import java.util.Scanner;

/**
 *
 * @author Mba info
 */
public class TP01Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
        Ex01 : using System.out.println Display Your full name
        */
        
        System.out.println("Mokhtari Abdelheq");
        
        /*
        Ex02 : 
        print the result of the following expression
        The addition of the two numbers 12 and 3.
        The subtraction of the number 5 from 20.
        The division of 15 by 3.
        The modulo of 15 by 3.
        */
        
        System.out.println(12+3);
        System.out.println(20-5);
        System.out.println(15/3);
        System.out.println(15%3);
       
        /*
        Ex03:
        Declare different variables to store your full name, your age,
        your phone number, a credit card number 56105910810825, an expiration
        date (e.g., "26/05"), and a variable indicating whether you are a
        student or not. after that display those variables.
        */
        
        String name = "Mokhtari Abdelheq";
        byte age = 23;
        String phoneNumber = "+2137754899512";
        long cardNumber = 56105910810825l;
        String expirationDate = "26/05";
        boolean student = false;
        
        
        
        /*
        Ex04:
        Display the sum of 5 + 10, using two variables: x and y.
        */
        byte x = 5, y=10;
        System.out.println(x+y);
        
        /*
        Ex05:
        reads the length and width of a rectangle from
        the user and calculates and displays the area of the rectangle.
        */
        
        Scanner scanner = new Scanner(System.in);
        float width, length;
        
        System.out.println("Enter the width: ");
        width = scanner.nextFloat();
        
        System.out.println("Enter the length: ");
        length = scanner.nextFloat();
        
        
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        
        
        /*
        Ex06:
        Declare an array of integers named numbers with a size of 5.
        Populate the array with some integer values.
        Display each element of the numbers array individually.
        Calculate and display the sum of all elements in the numbers array.
        */
        
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 5;
        
        // Display and calculate without loops
        System.out.println("the element 1: " + numbers[0]);
        System.out.println("the element 2: " + numbers[1]);
        System.out.println("the element 3: " + numbers[2]);
        System.out.println("the element 4: " + numbers[3]);
        System.out.println("the element 5: " + numbers[4]);
        System.out.println("sum of all elements in the numbers array: " + 
                numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
        // Display and calculate with loops 
        short sum=0;
        for(int i=0;i<5;i++){
            System.out.println("the element " + i + ": " + numbers[i]);
            sum+=numbers[i];
        }
        System.out.println("sum of all elements in the numbers array: " + sum);
        
        
        /*
        Challange 01:
        calculate if the year is a leap year and return true to the variable leapYear
        if it is a leap year, otherwise return false.
        
        To determine whether a year is a leap year, follow these steps: 
        1. If the year is evenly divisible by 4, go to step 2. Otherwise,
        go to step 5.
        2. If the year is evenly divisible by 100, go to step 3. Otherwise,
        go to step 4.
        3. If the year is evenly divisible by 400, go to step 4. Otherwise,
        go to step 5.
        4. The year is a leap year (it has 366 days). The method 
        needs to return true.
        5. The year is not a leap year (it has 365 days). The method isLeapYear
        needs to return false.
        
        The following years are not leap years:
        1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
        This is because they are evenly divisible by 100 but not by 400.


        The following years are leap years:
        1600, 2000, 2400
        This is because they are evenly divisible by both 100 and 400.
        
        */
        
        
        
        /*
        Ex07:
        Write a Java program that prompts the user to enter a grade (A, B, C, D, or F),
        and then uses a switch statement to provide a description for the grade
        A --> Excellent.
        B --> Good.
        C --> Satisfactor.
        D --> Needs Improvments 
        F --> Fail 
    
        */
        
        
        
        /* 
        challange 2
         find the first and the last digit of the Variable number,using a loop 
         and calculate the sum of the first and the last digit of that number.
         if the number is negative the results must be -1
        */
        
        
        
        /*
        Ex08:
        Write a Java program that calculates the sum of all numbers from 1 to N,
        where N is a positive integer provided by the user. You can use a for 
        loop to perform this calculation.
        */
        
        
        
        /*
        Ex09:
        Write a Java program that calculates the factorial of a positive integer
        entered by the user using a while loop. The program should prompt the
        user for the number and then compute its factorial.
        */
    }
    
}
