import java.util.*;
public class program7{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:- ");
        int n = sc.nextInt();

        List<Integer> output = new ArrayList<>();
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++){
            //System.out.print(a+" ");
            output.add(a);
            int c = a + b;
            a = b;
            b = c;
        }

        for (int i = output.size() - 1; i >= 0; i--) {
            System.out.print(output.get(i) + " ");
        }

        sc.close();
    }
}