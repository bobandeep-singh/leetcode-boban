class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        int zeroIndex = 0;
        int currentIndex = 0;
        while(currentIndex < nums.length){
            if(nums[currentIndex] != 0){
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[currentIndex];
                nums[currentIndex] = temp;
                zeroIndex++;
            } 
            currentIndex++;
        }

    }

}
