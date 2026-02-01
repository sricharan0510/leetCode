class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length, sec = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            if(nums[i] < sec) {
                third = sec;
                sec = nums[i];
            } else if (nums[i] < third) {
                third = nums[i];
            }
        }
        return nums[0] + sec + third;
    }
}