package javas.algorithms;

import java.sql.Array;
import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] list = {1,10,23,40,11,5,50,12,7};
        int nothing=0;
        int search=51;

        for (int i=0; i<list.length;i++){
            if (list[i]== search){
                System.out.println("Data is Found." + "Index:"+i);
                nothing++;
                break;
            }

        }

        if (nothing ==0 ){
            System.out.println("Data not Found.");
        }
    }
}
