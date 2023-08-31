package javas.proglem.logical_Programs;

//Swap the two numbers without using the third variable
public class Swap_two_numbers_without_third_Variable_P_07 {
    public static void main(String[] args) {
        int a= 10, b=20;

        a= a+b; //10+20=a=30
        b=a-b;//30-20=b=10
        a=a-b; //30-10=a=20

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
