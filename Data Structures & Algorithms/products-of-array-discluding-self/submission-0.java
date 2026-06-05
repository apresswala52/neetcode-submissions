class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) product = product * nums[i];
            else zeroCount++;
        }

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                if(zeroCount > 0) result[i] = 0;
                else result[i] = product / nums[i];
            }
            else {
                if(zeroCount > 1) result[i] = 0;
                else result[i] = product;
            }
        }

        return result;
    }
}
