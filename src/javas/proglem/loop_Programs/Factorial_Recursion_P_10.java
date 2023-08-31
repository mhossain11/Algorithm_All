package javas.proglem.loop_Programs;

public class Factorial_Recursion_P_10 {
//Find the Factorial of the Number using Recursion
    int fact = 1;
    public static void main(String[] args) {

        int num = 5;

        Factorial_Recursion_P_10 fr = new Factorial_Recursion_P_10();
       int result= fr.calfact(num);

        System.out.println("Factorial of the Number :"+result);

    }

    int calfact(int i){ //5X4X3X2X1
        if (i>=1){
         fact*=i;//5X4X3X2X1=120
         calfact(i-1); //recursion - call self
        }
        return fact;
    }

}
