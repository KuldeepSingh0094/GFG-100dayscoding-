package day53;
class Solution {

    public int perfectSum(int arr[], int n, int sum) {

        int MOD = (int) 1e9 + 7;

        int[] dp = new int[sum + 1];

        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] = (dp[j] + dp[j - arr[i]]) % MOD;
            }
        }

        return dp[sum];
    }

    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5}; // Sample array
        int targetSum = 5; // Target sum
        int n = arr.length; // Size of the array

        int waysToGetTargetSum = solution.perfectSum(arr, n, targetSum);
        System.out.println("Number of ways to achieve the sum " + targetSum + " is: " + waysToGetTargetSum);
    }
}
