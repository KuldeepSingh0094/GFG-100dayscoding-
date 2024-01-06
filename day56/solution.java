package day56;
class Solution {
    // Function to swap two numbers in an array
    static void swap(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    
    // Function to find the smallest positive number missing from the array
    static int missingNumber(int arr[], int size) {
        int i = 0;
        while (i < size) {
            if (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        
        for (i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        
        return size + 1;
    }
}
