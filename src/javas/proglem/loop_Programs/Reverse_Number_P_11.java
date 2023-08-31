package javas.proglem.loop_Programs;

public class Reverse_Number_P_11 {
    public static void main(String[] args) {

        int num = 543210;
        int rem,total=0;

        while (num!=0){
            rem = num%10;
            total =total*10+rem;
            num =num/10;
        }
        System.out.println(total);

    }
}


