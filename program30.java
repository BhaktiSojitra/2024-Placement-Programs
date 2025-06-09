public class program30{
    public static void main(String s[]){
        int arr[] = {10, 8, 6};
        int max = arr[0];
        int second_largest_element = -1;

        // Find the largest element
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Find the second largest distinct element
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != max && arr[i] > second_largest_element) {
                second_largest_element = arr[i];
            }
        }

        System.out.print(second_largest_element);
    }
}