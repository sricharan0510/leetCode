class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        if(n == 1) return cost[0];
        else if(n == 2) return cost[0] + cost[1];
        Arrays.sort(cost);
        int c = 0, sum = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(c != 2) {
                sum += cost[i]; c++;
            }
            else c = 0;
        }
        return sum;
    }
}