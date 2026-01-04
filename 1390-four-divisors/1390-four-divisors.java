class Solution {
    public int sumFourDivisors(int[] nums) {
        int s = 0;
        for(int i : nums) s += noOfDivisors(i);
        return s;
    }
    public static int noOfDivisors(int n) {
        int c = 0, s = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                c += 1; a.add(i); if(c > 4) return 0;
            }
        }
        if(a.size() == 4) {
            for(int i : a) s += i;
            return s;
        }
        return 0;
    }
}