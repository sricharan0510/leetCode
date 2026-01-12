class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int k : map.keySet()) {
            int c = map.get(k);
            for(int i = 0; i < c; i++) {
                if(ans.size() <= i) ans.add(new ArrayList<>());
                ans.get(i).add(k);
            }
        }
        return ans;
    }
}