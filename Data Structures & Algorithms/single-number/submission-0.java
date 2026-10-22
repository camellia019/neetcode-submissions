class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        // 6, 6, 7, 7, 8

        int i = 0;
        while(i < nums.length-1){
            if (nums[i] == nums[i+1]){
                i += 2;
            }
            else{
                return nums[i];
            }
        }
        return nums[i];
    }
}
