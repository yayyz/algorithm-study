class Solution {
    // time complexity: O(n^2); need to iterate over n customers with m banks
    // space complexity: O(1); no new creation of an array 
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if (max <= sum) {
                max = sum;
            }        
        }
        return max;
    }
}