import java.util.*;
public class program6{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        double P, R;
        int N;

        System.out.print("Enter principal amount (P): ");
        P = sc.nextDouble();

        System.out.print("Enter annual interest rate (R): ");
        R = sc.nextDouble();

        System.out.print("Enter loan tenure in months (N): ");
        N = sc.nextInt();

        // Convert annual interest rate to monthly decimal rate
        R = R / (12 * 100);

        // Apply EMI formula
        double numerator = P * R * Math.pow(1 + R, N);
        double denominator = Math.pow(1 + R, N) - 1;
        double EMI = numerator / denominator;

        System.out.printf("The EMI per month is: %.2f", EMI);

        sc.close();
    }
}