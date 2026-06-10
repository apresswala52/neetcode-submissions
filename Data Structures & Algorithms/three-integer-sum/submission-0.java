class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        //sort the array
        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++) {

            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            int right = nums.length - 1;
            int left = i + 1;

            while (left < right) {
                int sum = nums[i] + nums[right] + nums[left];

                if(sum < 0) {
                    left++;
                }
                else if(sum > 0) {
                    right--;
                }
                else {
                    //add triplets to result list
                    result.add(List.of(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
