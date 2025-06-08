public class program23{
    public static void main(String str[]){
        int number = 12321, s = 0, temp, r;
        temp = number;

        while(number > 0){
            r = number%10;
            s = (s*10)+r;
            number = number/10;
        }

        if(temp==s)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}