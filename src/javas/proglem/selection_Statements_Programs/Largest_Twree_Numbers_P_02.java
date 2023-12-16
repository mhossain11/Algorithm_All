package javas.proglem.selection_Statements_Programs;

//	Find the largest of three numbers
public class Largest_Twree_Numbers_P_02 {
    public static void main(String[] args) {

        int a =30,b=20,c=40;

        if (a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b>c){
            System.out.println("b is greater");
        }  else{
            System.out.println("c is greater");
        }

    //OR
      /*  if (a>b){
            if (a>c){
                System.out.println("a is greater");
            }else {
                System.out.println("c is greater");
            }
        } else if (b>c) {
            System.out.println("b is greater");

        }else {
            System.out.println("c is greater");
        }*/
    }
}
