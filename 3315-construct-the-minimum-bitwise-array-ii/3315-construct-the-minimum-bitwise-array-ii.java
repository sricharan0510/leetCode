class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int k = nums.get(i);
            if (k % 2 == 0)
                arr[i] = -1;
            else
                arr[i] = k - ((k + 1) & (-k - 1)) / 2;
        }
        return arr;
    }
}