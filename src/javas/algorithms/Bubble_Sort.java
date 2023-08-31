package javas.algorithms;

public class Bubble_Sort {
    public static void main(String[] args) {

        int temp;
        int [] srt = {19,30,4,40,1};
        //number of round = array.length -1

        for (int i=0;i<srt.length-1;i++){  //number of round
            for (int j=0;j<srt.length-1;j++){ //Two adjustment element

                if (srt[j]>srt[j+1]){
                    temp=srt[j];
                    srt[j]=srt[j+1];
                    srt[j+1]=temp;

                }
            }
        }
        System.out.print("Bubble Sort ArrayList: ");
        for (int l=0;l<srt.length;l++) {
            System.out.print(srt[l]+" ");
        }


    }
}
