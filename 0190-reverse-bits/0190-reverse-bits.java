class Solution {
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n))
                    .replace(' ', '0');
        s = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(s, 2);
    }
}