class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int m = order.length, n = friends.length, k = 0;
        int[] a = new int[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n;j++) {
                if(order[i] == friends[j]) a[k++] = friends[j];
            }
        }
        return a;
    }
}