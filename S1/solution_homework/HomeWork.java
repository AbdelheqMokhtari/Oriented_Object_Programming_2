/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.homework;
import java.util.Scanner;

/**
 *
 * @author Expert Info
 */
public class HomeWork {
 
    
    public static boolean is_Letter(char ch) {
       //ch = Character.toUpperCase(ch);
       
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
public static boolean is_digit(char ch) {
         return (ch>= '0' && ch <= '9') ;
        } 
    
public static boolean is_Valid_Password(String password) {

        if (password.length() < 8) return false;

      
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

           if (!is_digit(ch) && !is_Letter(ch)) return false;
            
        }
        return true;
}    
public static int count_Vowels(String str) { 
int count = 0; 
int length= str.length();
 for (int i = 0; i < length; i++) {
    char ch = Character.toLowerCase((str.charAt(i)));
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) 
count++; 
 //end if
 } //end loop
 return count; 
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scanner.nextLine();
        System.out.println("Number of vowel in "+str +" is "+ count_Vowels(str) );
                System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = scanner.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
}
