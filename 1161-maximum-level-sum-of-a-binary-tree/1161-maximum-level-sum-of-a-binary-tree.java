/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int l = 1, ans = 1, maxSum = Integer.MIN_VALUE;
        while(!q.isEmpty()) {
            int sum = 0;
            int n = q.size();
            for(int i = 0; i < n;i++) {
                TreeNode t = q.poll();
                sum += t.val;
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
            }
            if(sum > maxSum){ 
                maxSum = sum;
                ans = l;
            }
            l++;
        }
        return ans;
    }
}