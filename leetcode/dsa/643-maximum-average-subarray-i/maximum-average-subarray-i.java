class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int winSum = 0;
        for(int i=0; i<k; i++){
            winSum += nums[i];
        }
        maxAvg = (double)winSum/k;

        int start = 0;
        int end = k-1;

        for(int i=0; i < nums.length; i++){
            if(nums.length-i-1 < k){
                break;
            }
            winSum -= nums[start];
            winSum += nums[end+1];
            start++;
            end++;

            maxAvg = Math.max(maxAvg, (double)winSum/k);
        }

        return maxAvg;
    }
}