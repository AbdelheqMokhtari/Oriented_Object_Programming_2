package tp02.solution;

import java.util.Scanner;

/**
 *
 * @author Mokhtari abdelheq
 */
public class TP02Solution {
    
    
    // Function of the Exercise 01.
    public static void printName(String name){
        System.out.println("Welecom " + name + "!");
    }
    
    // Function of the Exercise 02.
    public static int intSum(int x,int y){
        return x+y;
    }
    
    // Function of the Exercise 03.
    public static boolean isMajor(short age){
        if(age<0){
            System.out.println("Invalid Age!");
            return false;
        }
        else if (age<18){
            return false;
        }
        else{
            return true;
        }
    }
    
    // Function of the Exercise 04.
    public static boolean isPair(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    
    // Function of the Exercise 05.
    public static double maxValue(double x, double y, double z){
        double max = x;
        if(y > max){
            max = y;
        }
        if (z > max){
            max = z;
        }
        return max;
    }
    
    // Function of the Exercise 06.
    public static void multiplicationTable(int n){
        for(int i=0;i<10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
    
    // Function of the Exercise 07.
    public static long factorial(byte n){
        long fact=1;
        while(n>1){
            fact *= n;
            n--;
        }
        return fact;
    }
    
     // Function of the Exercise 08.
    public static int positiveNumber(){
        int number;
        Scanner reader = new Scanner(System.in);
        do{
           System.out.println("Enter a positive numnber: ");
           number = reader.nextInt();
        }while(number < 0 );
        
        return number;
    }
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
         // Ex06 Solution 
    /*    int multiplication;
        multiplication = scanner.nextInt();
        multiplicationTable(multiplication);
        // Ex01 Solution 
        String myName;
      
        System.out.println("WHAT IS YOUR NAME ?");
        myName = scanner.nextLine();
        printName(myName);
        
        // Ex02 Solution 
        int firstNumber,secondNumber,result;
        System.out.print("Enter the first number :");
        firstNumber = scanner.nextInt();
        System.out.print("Enter the second number :");
        secondNumber = scanner.nextInt();
        result = intSum(firstNumber,secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        
        // Ex03 Solution 
        short age;
        boolean major;
        do{ 
            System.out.println("What is your age ?");
            age = scanner.nextShort();
        }while(age < 0);
        major = isMajor(age);
        if(major){
            System.out.println("you are " + age + " years old and you are of legal age.");
        }else{
            System.out.println("you are " + age + " and you are not of legal age.");
        }
        
        // Ex04 Solution
        boolean pair;
        System.out.println("Enter any number of your choice ");
        int number = scanner.nextInt();
        pair = isPair(number);
        if(pair){
            System.out.println("the number " + number + "is pair !!");
        }
        else{
            System.out.println("the number " + number + "is odd !!");
        }
        
        // Ex05 Solution
        double xDouble,yDouble,zDouble,resultsDouble;
        System.out.println("enter the first Double :");
        xDouble = scanner.nextDouble();
        System.out.println("enter the Second Double :");
        yDouble = scanner.nextDouble();
        System.out.println("enter the third Double :");
        zDouble = scanner.nextDouble();
        resultsDouble = maxValue(xDouble,yDouble,zDouble);
        System.out.println("the max value between " + xDouble + ", " + yDouble +
                ",and " + zDouble + "is :" + resultsDouble);
        
        
       
        // Ex07 Solution 
        byte numberFact;
        System.out.println("Enter the value of N :");
        numberFact = scanner.nextByte();
        System.out.println("the Factorial of : "+ numberFact + "is :" +
                factorial(numberFact)); */
        System.out.println(Math.max(6,9));
        // Ex 08 Solution 
        
        
        
        
    }
    
}
