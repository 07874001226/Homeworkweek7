package homeworkweek7;
//Write a Java program to test if an array contains a specific value

import java.util.Arrays;
import java.util.Scanner;

public class Programme20 {
        //static method
        static void test() {
                Integer[] Array_numbers = {1, 2, 3, 4, 6, 5, 7, 8};
                while (true) {
                        Scanner scanner = new Scanner(System.in);//scanner class
                        System.out.println("Enter a Specific number:");//print statement
                        Integer number_input = scanner.nextInt();
//if else statement
                        if (Arrays.asList(Array_numbers).contains(number_input)) {
                                System.out.println("is a Specific Value");//print statement
                        } else {
                                System.out.println("Not in the array!");//print statement
                                break;
                        }
                }
        }
//main method
        public static void main(String[] args) {

                Programme20.test();
        }

}

