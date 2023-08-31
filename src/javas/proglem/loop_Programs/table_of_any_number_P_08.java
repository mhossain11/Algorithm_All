package javas.proglem.loop_Programs;

import java.util.Scanner;

public class table_of_any_number_P_08 {
    public static void main(String[] args) {

        int num,result;
        Scanner input = new Scanner(System.in);

        System.out.print("enter number of table:");
        num = input.nextInt();

        for (int i=1;i<=10;i++){
            result=num * i;
            System.out.println(num+"X"+i+"="+result);
        }


    }
}
