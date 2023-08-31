package javas.proglem.selection_Statements_Programs;

import java.util.Scanner;

public class calculator_using_switchcase_P_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 ,num2,result=0;
        System.out.println("enter 1st number:");
         num1 = input.nextInt();
        System.out.println("enter 2nd number:");
         num2 = input.nextInt();
        System.out.println("enter Symbol(+,-,*,/):");
        String sym = input.next();

        switch (sym){
            case "+": result =num1 + num2;
                System.out.println(result);
                 break;
            case "-": result =num1 - num2;
                System.out.println(result);
                break;
            case "*": result =num1 * num2;
                System.out.println(result);
                break;
            case "/": result =num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Symbol");
                break;
        }

    }
}
