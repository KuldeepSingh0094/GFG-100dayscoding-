package day69;
import java.util.*;
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
   static ArrayList<Integer> spirallyTraverse(int mat[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> li = new ArrayList<Integer>();
        
        int top = 0;
        int left = 0;
        int bottom = r-1;
        int right = c-1;
        while(top<=bottom &&left<=right){
            for(int i=left; i<= right; i++)
            li.add(mat[top][i]);    
            top++;    
            
            for(int i = top ; i<=bottom;i++)
            li.add(mat[i][right]);
            right--;
            
            if(top<=bottom)
            {
                for(int i =right;i>=left;i--)
                li.add(mat[bottom][i]);
                bottom--;
            }
            
            if(left<=right)
            {
                for(int i = bottom;i>=top;i--)
                li.add(mat[i][left]);
                left++;
            }
            
        }
        return li;
    }
   }