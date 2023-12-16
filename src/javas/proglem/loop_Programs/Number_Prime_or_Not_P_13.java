package javas.proglem.loop_Programs;

public class Number_Prime_or_Not_P_13 {
    public static void main(String[] args) {
        int num =7; int temp=0;

        for (int i=2;i<=num-1;i++){
            if (num%i==0){
                temp+=1;
            }

        }

        if (temp>0){
            System.out.println("This is not Prime number");
        }else {
            System.out.println("This is Prime number");
        }

    }
}
