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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // both are null → same
        if (p == null && q == null) return true;

        // one is null → not same
        if (p == null || q == null) return false;

        // values must be same + left and right subtrees must be same
        return (p.val == q.val) 
               && isSameTree(p.left, q.left) 
               && isSameTree(p.right, q.right);
    }
}
