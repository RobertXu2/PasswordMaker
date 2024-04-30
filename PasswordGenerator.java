package password_generator;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean happy = false;

        while (!happy) {

        System.out.print("Enter a number: ");
            while (!input.hasNextInt()) { //checks if the next token input stream is an interger, if not it returns a flase
                System.out.println("Please ender a valid number </3");
                input.next();
                System.out.print("Enter a number: ");
            }

        int digits = input.nextInt();

        String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String special_cases = "!@#$%^&*()";
        String numbers = "0123456789";

        String password = "";

        for (int index = 0; index < digits; index++ ) {
            Random rand = new Random();
            int choice = rand.nextInt(4); 
        
            switch (choice) {
                case 0:
                    password += lower_case.charAt(rand.nextInt(lower_case.length()));
                    break;
                case 1:
                    password += upper_case.charAt(rand.nextInt(upper_case.length()));
                    break;
                case 2:
                    password += special_cases.charAt(rand.nextInt(special_cases.length()));
                    break;
                case 3:
                    password += numbers.charAt(rand.nextInt(numbers.length()));
                    break;
                default:
                    password += ' '; // charAT is a method in Java used to retrieve a character at a specified index position
                    break;
            }

        }

        System.out.println(password);

        System.out.println("Are you happy with your password? Answer: yes/no");
        String response = input.next();

        if (response.equals("yes")) {
            happy = true; 
            System.out.println("This is your new password!!!"); }
        else if (response.equals("no")) {
            
        } else {
            System.out.println("Answer with yes or no please.");
        }
        }
    }
        


    }

