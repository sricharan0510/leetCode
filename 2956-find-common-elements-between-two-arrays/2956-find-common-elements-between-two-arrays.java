class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i : nums1) map1.put(i, map1.getOrDefault(i, 0) + 1);
        for(int i : nums2) map2.put(i, map2.getOrDefault(i, 0) + 1);
        int c1 = 0, c2 = 0;
        for(int i : map1.keySet()) {
            if(map2.containsKey(i)) c1 += map1.get(i);
        }
        for(int i : map2.keySet()) {
             if(map1.containsKey(i)) c2 += map2.get(i);
        }
        return new int[]{c1, c2};
    }
}