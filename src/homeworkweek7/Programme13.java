package homeworkweek7;
/*Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Programme13 {
    //instance method
    void days () {
        Scanner sca = new Scanner(System.in);//scanener class
        System.out.println("Enter number beetween 1 to 7 : ");//print statement
        int day = sca.nextInt();
//switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Week contains 1 to 7 days");

        }
    }

    public static void main(String[] args) {
      Programme13 siv = new Programme13();//object
      siv.days();

    }
    }

