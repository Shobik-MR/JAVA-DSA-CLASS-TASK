import java.util.*;
public class task1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Deque<Integer> q = new ArrayDeque<Integer>(k);
        for(int i=0;i<n;i++){
          if(i<k-1){
            q.offer(arr[i]);
          }
          else{
            q.offer(arr[i]);
            System.out.print(q);
            q.poll();
          }
          System.out.println();
        }
        
    }
}