import java.util.*;
public class program5{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:- ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements:- ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min=arr[0];

        // Find the largest element
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Find the smallest element
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int second_largest_element = 0;
        int second_smallest_element = max;

        // Find the second largest element
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != max && arr[i] > second_largest_element) {
                second_largest_element = arr[i];
            }
        }

        // Find the second smallest element
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != min && arr[i] < second_smallest_element) {
                second_smallest_element = arr[i];
            }
        }
        
        System.out.println("max:- "+ max + " min:- " + min);
        System.out.println("second largest element:- " + second_largest_element);
        System.out.println("second smallest element:- " + second_smallest_element);
        System.out.print("Difference:- " + (second_largest_element - second_smallest_element));

        sc.close();
    }
}
