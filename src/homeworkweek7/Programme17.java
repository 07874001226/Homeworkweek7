package homeworkweek7;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Programme17 {
    //static method
    static void array(){
        int[] a = {99, 2, 75,40,55,25,7};
        String[] b = { "London", "Ascot", "Victoria", "Oxford","Croydon"};
        System.out.println("Original value;  "+ Arrays.toString(a));//print statement
        Arrays.sort(a);
        System.out.println("Sorted  value;  "+ Arrays.toString(a));//print statement

        System.out.println("Original value;  "+ Arrays.toString(b));//print statement
        Arrays.sort(b);
        System.out.println("Sorted value;  "+ Arrays.toString(b));//print statement

    }
//main metghod
    public static void main(String[] args) {
        Programme17.array();
    }
}
