class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> countMap = new HashSet();
        for(int num: nums) {
            if(!countMap.add(num)) {
                return true;
            }
        }
        return false;
    }
}