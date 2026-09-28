import java.util.*;
public class Cumulative{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        int [] max = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n;j++){
                sum = arr[j]+sum;
             max[i] = sum;
            }
           
        System.out.print(max[i]+" ");
        }
    }
}