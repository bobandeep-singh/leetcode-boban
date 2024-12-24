class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        int l = 0;
        int r = 0;
        while(r < nums.length){
            // System.out.println(l + " & " + r + " - " + nums[l] + " & " + nums[r]);
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            } 
            r++;
        }

    }

}
