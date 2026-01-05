class Solution {
    public int[] closestDivisors(int num) {
        int a = num + 1, b = num + 2;
        int[] divA = findDivisors(a), divB = findDivisors(b);
        int dA = Math.abs(divA[0] - divA[1]);
        int dB = Math.abs(divB[0] - divB[1]);
        return dA <= dB ? divA : divB;
    }
    public static int[] findDivisors(int n) {
        int md = Integer.MAX_VALUE;
        int[] pair = new int[2];
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                int d = Math.abs(i - n/i);
                if(d < md) {
                    d = md;
                    pair[0] = i; pair[1] = n/i;
                }
            }
        }
        return pair;
    }
}