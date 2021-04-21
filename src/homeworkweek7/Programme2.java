package homeworkweek7;
/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */

import java.util.Scanner;

public class Programme2 {
    //instance method
    void year(){
        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter Year");//print statement
        int a = sca.nextInt();//scanner object
        if((a % 4 == 0) && (a % 100 != 0) ||(a%400==0)) {
            System.out.println(a + " is a Leap Year");//print statement
        }else {
            System.out.println(a + " is a not Leap Year");//print statement
        }
    }
//main method
    public static void main(String[] args) {
        Programme2 shi = new Programme2();//object
        shi.year();

    }

  }
