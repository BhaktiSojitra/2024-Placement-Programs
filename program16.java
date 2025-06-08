import java.util.*;
public class program16{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, -2, 1, 0, 5};
        int target;
        boolean flag = false;

        System.out.print("Enter target:- ");
        target = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target)
                    flag = true;   
            }
        }

        if(flag)
            System.out.println(flag);
        else
            System.out.println(flag);

        sc.close();
    }
}