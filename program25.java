import java.util.*;
public class program25{
    public static void main(String s[]){
        int a[] = {1, 12, 15, 26, 38};
        int b[] = {2, 13, 17};
        int mergedArray[] = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++)
            mergedArray[i] = a[i];
        
        for (int i = 0; i < b.length; i++)
            mergedArray[a.length + i] = b[i];

        Arrays.sort(mergedArray);
        //Bubble Sort Algorithm
        /*for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - i - 1; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }*/

        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println("");

        int n = mergedArray.length;
        if(n % 2 == 0){
            int median1 = (n / 2) - 1;
            int median2 = n / 2;
            int result = (mergedArray[median1] + mergedArray[median2]) / 2;
            System.out.print("Median:- " + result); 
        }
        else{
            System.out.print("Median:- " + mergedArray[(n / 2)]);   
        }
    }
}