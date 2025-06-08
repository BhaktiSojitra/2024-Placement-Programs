import java.util.*;
public class program18{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array:- ");
        int size1 = sc.nextInt(); 

        System.out.print("Enter the size of second array:- ");
        int size2 = sc.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int mergedArray[] = new int[arr1.length + arr2.length];

        System.out.println("Enter the elements of first array:- ");
        for(int i = 0; i < arr1.length; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Enter the elements of second array:- ");
        for(int i = 0; i < arr2.length; i++)
            arr2[i] = sc.nextInt();

        //duplicates replaced with zeros
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j])
                    arr2[j] = 0;
            }
        }

        /*for (int num : arr2) {
            System.out.print(num + " ");
        }*/

        // Copy elements from arr1
        for(int i = 0; i < arr1.length; i++)
            mergedArray[i] = arr1[i];
        
        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++)
            mergedArray[arr1.length + i] = arr2[i];
        
        System.out.print("Merged array:- ");
        for (int num : mergedArray)
            System.out.print(num + " ");

        sc.close();
    }
}