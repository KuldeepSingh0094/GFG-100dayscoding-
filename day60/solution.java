package day60;
import java.util.*;
class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr,int n)
    {
       //add code here.

int max = 0, index = 0;
    for(int i=0; i<n ;i++){
        if(arr[i] > max){
            max = arr[i];
            index = i ;
        }
    }
    return index;
    }
}