package javas.proglem.loop_Programs;

public class Factorial_Number_P_09 {
    public static void main(String[] args) {

        int fact=1;
        int num=5;

        for (int i=num;i>=1;i--){
         fact= fact* i; //if fact =0 then result will be 0 because fact =0 x i=0
        }
        System.out.println("Factorial of the Number:"+fact);
    }
}
