import java.util.*;
public class CountChar{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next().charAt(0);
        int count =0;
        for(char i:s.toCharArray()){
            if(i==ch){
                count ++;
            }
        }
        System.out.println(count);
    }
}