package homeworkweek7;

import java.util.Scanner;

/* Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Programme7 {
    //static method
    static void m() {
        int sales_id;
        String seller_name;
        double sales_amt, b_Sal, sales_comm = 0;

        Scanner sales = new Scanner(System.in);//scanner class
        System.out.println("Sales id : ");//print statement
        sales_id = sales.nextInt();
        System.out.println("Enter the Sellers Name : ");
        seller_name = sales.next();
        System.out.println("Enter the Sales Amount : ");
        sales_amt = sales.nextFloat();
        System.out.println("Enter the basic Salary : ");
         b_Sal = sales.nextDouble();
//if else statement
        if (sales_amt >= 50000)
        {
            sales_comm = sales_amt * 0.35;
        }
    else if
        (sales_amt >=30000)
        {
    sales_comm = sales_amt * 0.20;
    }
    else if(sales_amt >=10000)
        {
        sales_comm = sales_amt * 0.5;
    }
    else if(sales_amt >=10000)
        {
            sales_comm = sales_amt * 0.2;
    }
        System.out.println("Sales Commision  : "  +sales_comm);//print statement

}
//main method
    public static void main(String[] args) {
        Programme7.m();
    }
}

