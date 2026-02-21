class Solution {
    public boolean isPrime(int n) {
        return switch(n) {
            case 2, 3, 5, 7, 11, 13, 17, 19 -> true;
            default -> false;
        };
    }
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i = left; i <= right; i++) {
            if(isPrime(Integer.bitCount(i))) c++;
        }
        return c;
    }
}