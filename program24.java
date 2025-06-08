public class program24{
    public static void main(String str[]){
        String string = "Geeks", s = "";

        for(int i = string.length() - 1; i >= 0; i--){
            char c = string.charAt(i);
            //System.out.println("c:-" + c);
            s = s + c;
            //System.out.println("s:- " + s);
        }
        //System.out.println(s);

        System.out.print(string.equals(s));
    }
}