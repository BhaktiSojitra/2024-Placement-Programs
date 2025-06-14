import java.util.*;
public class program36{
    public static void main(String s[]){
        int a[] = {1,1,1,1,1};
        int b[] = {1,1,1}; 

        // Step 1: Remove duplicates using a set
        Set<Integer> setA = new HashSet<>();
        for (int num : a)
            setA.add(num);

        Set<Integer> setB = new HashSet<>();
        for (int num : b)
            setB.add(num);

        // Step 2: Find intersection using retainAll
        setA.retainAll(setB);
        System.out.println(setA);  // Output in any order
    }
}
