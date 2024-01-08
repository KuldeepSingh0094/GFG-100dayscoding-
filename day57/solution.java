package day57;
import java.util.HashMap;

class GfG {
    int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        int i = -1;
        map.put(sum, i);
        while (i < n - 1) {
            i++;
            sum = sum + arr[i];
            if (map.containsKey(sum) == false) {
                map.put(sum, i);
            } else {
                int length = i - map.get(sum);
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        GfG gfg = new GfG();
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        int maxSubArrayLength = gfg.maxLen(arr, n);
        System.out.println("The maximum length of subarray with 0 sum is: " + maxSubArrayLength);
    }
}
