import java.util.*;
public class Nonrepeating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> f = new HashMap<> ();
        for(int x : arr){
            f.put(x,f.getOrDefault(x,0)+1);
        }
        for(int i:arr){
            if(f.get(i)==1){
                System.out.print(i+" ");
            }
        }
        //time complexity =O(n)
        //space complexity = O(n)
    }
}