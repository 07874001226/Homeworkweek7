package homeworkweek7;

import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|

 */
public class Programme5 {
    //static method
    static void m(){
        String name;
        int id;

        float b_Sal,ta,hra,pf,da,g_sal;
        Scanner employee = new Scanner(System.in);
        System.out.println("Employeed id : ");
        id = employee.nextInt();
        System.out.println("Enter name : ");
        name = employee.next();
        System.out.println("Enter salary : ");
        b_Sal = employee.nextFloat();

        hra = (b_Sal*10)/100;
        da = (b_Sal*8)/100;
       ta = (b_Sal*9)/100;
        pf= (b_Sal*20)/100;
        g_sal= b_Sal+hra+ta+da-pf;
//print statement
        System.out.println("-------------------------------");
        System.out.println("| Salary Slip                |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id : "    +id+ " |");
        System.out.println("| Employee Name:    " +name+ " |");
        System.out.println();
        System.out.println("| Basic Salary :    "+b_Sal+ " |");
        System.out.println("|  HRA 10% :        "+hra+"  |");
        System.out.println("|  TA 8% :           "+ta+"  |");
        System.out.println("|  DA 9% :           "+da+"  |");
        System.out.println("|  PF  - 20& :        "+pf+"  |");
        System.out.println("|-----------------------------|");
        System.out.println("| Gross Salary :  "+g_sal+"   |");
        System.out.println("|=========================|");
    }
//main method
    public static void main(String[] args) {
        Programme5.m();
    }
}
