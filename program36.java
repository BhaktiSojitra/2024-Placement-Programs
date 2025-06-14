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

        // Step 3: Print result
        System.out.println(setA);  // Output in any order

        /*Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        // Start from the second element for 1st array
        int index1 = 1;   
        for(int i = 1; i < a.length; i++){
            if (a[i] != a[i - 1]) 
                a[index1++] = a[i];
        }
        for(int i = 0; i < index1; i++) 
            temp1.add(a[i]);

        // Start from the second element for 2nd array
        int index2 = 1;   
        for(int i = 1; i < b.length; i++){
            if (b[i] != b[i - 1])
                b[index2++] = b[i];
        }
        for(int i = 0; i < index2; i++)
            temp2.add(b[i]);

        System.out.println("temp1:- " + temp1);
        System.out.println("temp2:- " + temp2);

        for(int i = 0; i < temp1.size(); i++){
            for(int j = 0; j < temp2.size(); j++){
                if(temp1.get(i) == temp2.get(j))
                    System.out.print(temp1.get(i) + " ");
            }
        }*/
    }
}