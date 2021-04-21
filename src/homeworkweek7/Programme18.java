package homeworkweek7;

import java.util.Scanner;

// Write a Java program to sum values of an array.
public class Programme18 {
    //instance method
    void pro() {
        Scanner sca = new Scanner(System.in);// scanner class

        int[] c = new int[20];
        int a = 0;
        System.out.println("Enter Number : ");//print statement
    for (int b=0; b<20; b++){
    c[b] = sca.nextInt();
}
for (int num : c){
    a = a+num;
}
        System.out.println("Sum Value of Array is : " +a);//print statement
    }
//main method
    public static void main(String[] args) {
        Programme18 obj = new Programme18();// obj
        obj.pro();
    }
}