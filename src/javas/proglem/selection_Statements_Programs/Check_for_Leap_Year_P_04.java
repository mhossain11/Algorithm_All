package javas.proglem.selection_Statements_Programs;

// Check for leap year
public class Check_for_Leap_Year_P_04 {
    public static void main(String []args){
        int year=2016;

        //%4 --Leap Year
        if (year % 4==0){
            // %100 --Not a leap year
            if (year % 100 ==0){
                //%400 --Leap Year
                if (year % 400==0){
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Not a leap year");
                }
            }else {
                System.out.println("Leap Year");
            }

        }else {
            System.out.println("Not a leap year");
        }


        //OR
       /* if ((year % 400 ==0) || (year % 4==0 && year % 100 !=0 )){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }*/

    }
}
