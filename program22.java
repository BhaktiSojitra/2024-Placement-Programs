import java.util.Scanner;
public class program22{

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        // Check from 2 to square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
