package homeworkweek7;

import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

/*Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */
public class Programme1 {
//Static Method
static void oddeven(){
    int no;
    Scanner sca = new Scanner(System.in);// Scanner class
    System.out.println("Enter Number = ");// print statement
    no = sca.nextInt();//scanner object


    String evenodd;
    evenodd = (no%2==0)? "even" : "odd";
    System.out.println(no+"is "+evenodd);//print statement
}

    public static void main(String[] args) {//Main method
        Programme1.oddeven();
    }
}
