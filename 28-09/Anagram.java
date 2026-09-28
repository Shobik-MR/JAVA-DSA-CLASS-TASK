import java.util.*;
public class Anagram{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.nextLine();
     String s2 = sc.nextLine();
     boolean  anagram = true;
     if(s1.length()!=s2.length()){
        anagram = false;
     
     }   
     int [] count = new int[26];
     for(int i=0;i<s1.length();i++){
        count[s1.charAt(i)-'a']++;
        count[s2.charAt(i)-'a']--;
     }
     for(int c : count){
        if(c!=0){
            anagram = false;
        }
     }
     System.out.print(anagram);
    }
}