class Solution {
    public int minOperations(int n) {
        int t = n, s = 0, i = 1;
        while(t > 0) {
            s += i; i += 2; t--;
        }
        int cnt = 0, k = 1;
        while(k < s/n) {
            cnt += Math.abs(s/n - k);
            k += 2;
        }
        return cnt;
    }
}