import java.util.*;
public class Frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x,freq.getOrDefault(x,0)+1);

        }
        System.out.println(freq);
        //time complexity =O(n)
        //space complexity = O(n)

            }
}