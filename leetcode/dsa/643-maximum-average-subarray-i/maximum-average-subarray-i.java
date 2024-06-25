class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winSum = 0;
        for(int i=0; i<k; i++){
            winSum += nums[i];
        }
        int maxSum = winSum;

        int start = 0;
        int end = k-1;

        for(int i=0; i < nums.length; i++){
            if(nums.length-i-1 < k){
                break;
            }
            winSum = winSum + nums[end+1] - nums[start];
            start++;
            end++;

            maxSum = Math.max(maxSum, winSum);
        }
        return (double)maxSum/k;
    }
}