import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Question 1
        int n = 15;
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Question 2
        try {
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Question 3

        try {
            readNumbersFromFile("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Question 4
        try {
            List< Integer > numbers = readNumbersFromUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 1
    public static void checkEvenNumber(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Number must be even.");
        }
    }

    // Question 2
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        scanner.close();
    }

    // Question 3
    public static void readNumbersFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                throw new IllegalArgumentException("Positive number found.");
            }
        }
        scanner.close();
    }

    // Question 4
    public static List< Integer > readNumbersFromUser() {
        List < Integer > numbers = new ArrayList< >();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");
        int count = scanner.nextInt();

        System.out.println("Input the integers:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        scanner.close();
        return numbers;
    }

    public static void checkDuplicates(List < Integer > numbers) throws DuplicateNumberException {
        Set< Integer > uniqueNumbers = new HashSet< >();

        for (int num: numbers) {
            if (uniqueNumbers.contains(num)) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}

