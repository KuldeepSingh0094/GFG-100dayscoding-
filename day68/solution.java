package day68;
import java.util.*;
class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        
        ArrayList<Integer>al=new ArrayList<Integer>();
        boolean y=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                y=true;
            }
        }
        
        if(y==false){
            al.add(-1);
            al.add(-1);
            return al;
        }
        
         
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                al.add(i);
                break;
            }
            
        }
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                al.add(i);
                break;
            }
        }
        
        return al;
    }
}