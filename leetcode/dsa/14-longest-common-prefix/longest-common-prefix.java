class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(null == strs || strs.length == 0){
            return "";
        }

        String prefix = strs[0]; // make the first element of array as prefix
        // we will keep on reducing the refix length after comparing with rest of the elements in array
        for(int i=1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1); // remove last char
            }
        }

        return prefix;
        
    }
}