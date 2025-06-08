public class program10{
    public static void main(String s[]){
        int count = 0;
        String str = "abccdefgaa";
        char c = 'a';

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == c){
                count++;
            }
        }

        System.out.print(count);
    }
}