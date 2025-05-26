class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> aSet = new HashSet<>();
        for(int i: nums){
            if(aSet.contains(i)) return true;
            else aSet.add(i);
        }
        return false;
    }

/*
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(null != map.get(i)) return true;
            else map.put(i, 1);
        }
        return false;
    }
*/
}