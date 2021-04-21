package homeworkweek7;

import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|

 */


public class Programme3 {
//Static Method
    static void prog() {

        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Marks sheet");// print statement
        System.out.println("Enter the name of Student : ");
        String name = sc.next();
        System.out.println("Enter the Roll Number : ");
        String roll = sc.next();
        System.out.println("Enter the Marks of Maths : ");
        int maths = sc.nextInt();
        System.out.println("Enter the Marks of Science : ");
        int science = sc.nextInt();
        System.out.println("Enter the Marks of English : ");
        int english = sc.nextInt();


        float percent;
        int total = maths + science + english;
        percent = total / 3;
        String grade =  "";
        String result = "";
//if else statement

         if (maths > 100 && science > 100 && english > 100) {
            System.out.println("Invalid input");}


        if (percent >= 80) {
            grade = "A+";
            result = "Pass";
        } else if (percent >= 60) {
            grade = "A";
            result = "Pass";

        } else if (percent >= 50) {
            grade = "B";
            result = "Pass";
        } else if (percent >= 35) {
            grade = "C";
            result = "Pass";

        } else {
            result = "Fail";
        }
////print statement
        System.out.println("|-------------------------------------|");
        System.out.println("|                                     |");
        System.out.println("|            Mark Sheet               |");
        System.out.println("|                                     |");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Name:    " + name +            " |");
        System.out.println("|    Roll No: " + roll             + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Subject:    Marks                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Math:    " + maths +    "|" +   "|");
        System.out.println("|    English: " + english +          "|");
        System.out.println("|    Science: " + science +          "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Total:   " + total +            "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|    Percentage: " + percent +       "|");
        System.out.println("| Result:     " + result +           "|");
        System.out.println("| Grade:      " + grade +            "|");
        System.out.println("|-------------------------------------|");
    }
//main method
        public static void main (String[]args){


            Programme3.prog();
        }
    }

