package day64;
import java.util.*;


class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
         ArrayList<Integer> ob=new ArrayList<>();
        int low=0;
        int high;
        int temp=0;
        if(n==1&&s==0){
            ob.add(1);
            ob.add(1);
            return ob;
        }
        for(high=0;high<n;high++){
            temp+=arr[high];
            while(temp>s&&s!=0){
                temp=temp-arr[low];
                low++;
            }
            if(temp==s){
                ob.add(low+1);
                ob.add(high+1);
                break;
            }
        }
        if(ob.size()==0){
            ob.add(-1);
        }
        return ob;
    }
}