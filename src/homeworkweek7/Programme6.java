package homeworkweek7;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Programme6 {
    //instance method
    void num (){
        int no;
        Scanner sca = new Scanner(System.in);// scanner class
        System.out.println("Enter Number = ");// print statement
        no = sca.nextInt();

        if (no%2==0){
            System.out.println(no + " is even number" );}
                    else{
                        System.out.println(no + " is odd number");}
            }
//main method
    public static void main(String[] args) {
        Programme6 obj = new Programme6();//object
        obj.num();
    }
        }



