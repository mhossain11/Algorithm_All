package javas.proglem.loop_Programs;

public class Reverse_String_P_12 {
    public static void main(String[] args) {

        String name ="I am a Developer";
        String rev="";

        for (int i=name.length()-1;i>=0;i--){
            rev= rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
