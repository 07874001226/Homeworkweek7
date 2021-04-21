package homeworkweek7;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Programme12 {
    //instance method
    void xyz() {

        Scanner sca = new Scanner(System.in);// scanner class
        System.out.println("Enter Any Character : ");//print statement
        char c = sca.next().charAt(0);
//if else statement
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is Alphabet");
        } else if (c >= '0' && c <= '9')
            System.out.println(c + " is Number");
        else {
            System.out.println(c + " is a Special Character");
        }

    }
        public static void main(String[]args){
            Programme12 obj = new Programme12();//object
            obj.xyz();
        }
    }

