import java.util.*;

public class program1{
    public static void main(String s[]){
        int  a[] = {2, 3, 6, 7, 9};
        int b[] = {1, 4, 8, 10};
        int finalArray[] = new int[a.length + b.length];
        int k;

        // Copy elements from a
        for (int i = 0; i < a.length; i++) {
            finalArray[i] = a[i];
        }

        // Copy elements from b
        for (int i = 0; i < b.length; i++) {
            finalArray[a.length + i] = b[i];
        }

        // Print final array
        System.out.print("Final array: ");
        for (int num : finalArray) {
            System.out.print(num + " ");
        }
        System.out.println("");

        //Arrays.sort(finalArray);
        //Bubble Sort Algorithm
        for (int i = 0; i < finalArray.length - 1; i++) {
            for (int j = 0; j < finalArray.length - i - 1; j++) {
                if (finalArray[j] > finalArray[j + 1]) {
                    int temp = finalArray[j];
                    finalArray[j] = finalArray[j + 1];
                    finalArray[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted final array: ");
        for (int num : finalArray) {
            System.out.print(num + " ");
        }
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k value:- ");
        k = sc.nextInt();

        if(k <= finalArray.length){
            System.out.println("The " + k + "th element is " + finalArray[k - 1]);
        }
        else{
            System.out.println("your k value is out of array length");
        }

        sc.close();
    }
}