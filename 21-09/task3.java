import java.util.*;
public class task3{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k =sc.nextInt();
     int [] arr = new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }   
     int max =0;
     int sum =0;
     for(int i=0,j=0;i<n;i++){
        sum+=arr[i];
        if(i>=k-1){
            max = Math.max(max,sum);
            sum-=arr[j];
            j++;
        }
     }
     System.out.print(max);
    }
}