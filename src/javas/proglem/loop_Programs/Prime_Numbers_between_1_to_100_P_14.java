package javas.proglem.loop_Programs;

public class Prime_Numbers_between_1_to_100_P_14 {
    public static void main(String[] args) {
        int temp=0;

        for (int i=1;i<=100;i++){
            for (int j=2;j<=i-1;j++){
                if (i%j==0){

                    temp+=1;
                }
            }
            if (temp==0){
                System.out.println("Numbers are prime "+i);
            }else {
                temp=0;
            }
        }


    }
}
