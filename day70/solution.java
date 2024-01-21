package day70;


class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int count=0;
        int maxcount=0;
        int row=0;
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                row=i;
            }
            count=0;
        }
        if(maxcount==0){
            return -1;
        }else{
            return row;
        }
    }
}
