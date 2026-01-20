class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = -1;
            for(int j = 1; j <= nums.get(i); j++) {
                if((j | (j + 1)) == nums.get(i)) {
                    arr[i] = j; break;
                } 
            }
        }
        return arr;
    }
}