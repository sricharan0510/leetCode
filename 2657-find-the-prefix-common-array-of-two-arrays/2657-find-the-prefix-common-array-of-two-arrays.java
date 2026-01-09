class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] seen = new boolean[51];
        int arr[] = new int[n];
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(seen[A[i]]) c++;
            else seen[A[i]] = true;
            if(seen[B[i]]) c++;
            else seen[B[i]] = true;
            arr[i] = c;
        }
        return arr;
    }
}