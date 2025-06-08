import java.util.*;
public class program26{
    public static void main(String s[]){
        int lowerCase = 0, upperCase = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string:- ");
        String str = sc.nextLine();
        
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if((c >= 'a'&& c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(c >= 'a'&& c <= 'z')
                    lowerCase++;
                else
                    upperCase++;
            }
        }

        System.out.println("Lower Case characters:- " + lowerCase);
        System.out.print("Upper case characters:- " + upperCase);

        sc.close();
    }
}