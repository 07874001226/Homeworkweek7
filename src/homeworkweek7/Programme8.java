package homeworkweek7;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Programme8 {
    //static method
    static void cities() {

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter City Name ");
         char city = sca.next().charAt(0);
//if else statement
        if (city == 'a') {
            System.out.println("Ahmedabad");
        } else if (city == 'b') {
            System.out.println("Baroda");
        } else if (city == 'c') {
            System.out.println("Croydon");
        } else if (city == 'd') {
            System.out.println("Derby");
        } else if (city == 'e') {
            System.out.println("Edinburg");
        } else if (city == 'f') {
            System.out.println("Foster");
        } else{
            System.out.println("Invalid entry");
        }
    }
    //main statement
    public static void main(String[] args) {
        Programme8.cities();
    }




}





