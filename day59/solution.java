package day59;
import java.util.*;;
class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        if (n == 1) {
            return 1;
        }
        
        long sum = 0;
                for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
            long l_sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum - arr[i] == 2 * l_sum) {
                return i + 1;
            } else {
                l_sum += arr[i];
            }
        }

        return -1;
    }
}
