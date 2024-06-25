class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++){

            if(nums.length - i < k){
                break;
            }

            double kAvg = Integer.MIN_VALUE;
            int kSum = 0;
            for(int j=0; j < k; j++){
                kSum +=  nums[i+j];
            }
            kAvg = (double) kSum / k;
            maxAvg = Math.max(maxAvg, kAvg);
        }
        return maxAvg;
    }
}