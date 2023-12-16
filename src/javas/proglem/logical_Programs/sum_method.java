package javas.proglem.logical_Programs;

import java.util.Scanner;

public class sum_method {
    public static void main(String[] args) {
         int fnum,num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        num =input.nextInt();
        System.out.println("Enter second number");
        fnum =input.nextInt();

        System.out.println(Integer.sum(num,fnum));

        plass();
        longs();
        floats();
        doubles();
    }


    static void plass(){
        int a=123;
        int b = 260;
        System.out.println("a+b ="+Integer.sum(a,b));
    }
    static void longs(){
        long a=12345;
        long b=123566789;
        System.out.println("a+b ="+Long.sum(a,b));
    }

    static void floats(){
        float a=123.5f;
        float b=12356;
        System.out.println("a+b ="+Float.sum(a,b));
    }
    static void doubles(){
        double a=12.345;
        double b=-123566.789;
        System.out.println("a+b ="+Double.sum(a,b));
    }
}
