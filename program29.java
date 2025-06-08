public class program29{
    public static void main(String s[]){
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        System.out.println("Non-duplicate (unique) elements between the two arrays:");

        // Step 1: Print elements from array1 not in array2
        for (int i = 0; i < arr1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr1[i] + " ");
            }
        }

        // Step 2: Print elements from array2 not in array1
        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}