import java.util.*;
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max =0;
        int a =0;
        ArrayList<Integer> q = new ArrayList<Integer>(k);
        for(int j=0,i=0;i<arr.length;i++){
            
            if(i<k){
              q.add(arr[i]); 
               a += arr[i];
            }
            else{
                
                max = Math.max(max,a);
                q.remove(Integer.valueOf(arr[j]));
                 a -= arr[j];
                
                q.add(arr[i]);
                a += arr[i];
                j++;
                
            }
            max = Math.max(max,a);
        }
        return max;
    }
}