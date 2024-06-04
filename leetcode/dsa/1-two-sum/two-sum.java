class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                output[0] = i;
                output[1] = map.get(difference);
            } else {
                map.put(nums[i], i);
            }
        }
        return output;
    }
}