class Solution {
    
    // brute force solution
    public int[] twoSum(int[] nums, int target) {
        int[] outputArray = new int[2];
        
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(i == j) continue;
                
                if(nums[i] + nums[j] == target){
                    outputArray[0] = i;
                    outputArray[1] = j;
                }
            }
        }
        
        return outputArray;
        
    }
}