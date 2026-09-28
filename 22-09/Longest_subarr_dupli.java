import java.util.*;
public class Longest_subarr_dupli{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
       int max =0;
       HashSet<Character> set = new HashSet<>();
       int j=0;
       for(int i=0;i<s.length();i++){
        while(set.contains(s.charAt(i))){
            set.remove(s.charAt(j));
            j++;
        }
        set.add(s.charAt(i));
        max = Math.max(max,set.size());
       }
        System.out.print(max);
    }
   
}