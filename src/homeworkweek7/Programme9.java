package homeworkweek7;

import java.util.Scanner;

//Same as above program-8 using switch statement.
public class Programme9 {
    //static method
    static void swi() {

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter City Name ");//print statement
        char city = sca.next().charAt(0);
//switch statement
        switch(city)
        {
            case('a'):
            System.out.println("Ahmedabad");
            break;
            case('b'):
            System.out.println("Baroda");
                break;
            case('c'):
            System.out.println("Croydon");
                break;
            case('d'):
            System.out.println("Derby");
                break;
            case('e'):
            System.out.println("Edinburg");
                break;
            case('f'):
            System.out.println("Foster");
                break;
            default:
            System.out.println("Invalid entry");//print statement
        }
    }
    //main statement
    public static void main(String[] args) {
        Programme9.swi();
    }


}
