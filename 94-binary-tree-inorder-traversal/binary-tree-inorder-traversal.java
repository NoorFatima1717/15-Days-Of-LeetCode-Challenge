import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();       // Node to visit
            result.add(curr.val);     
            curr = curr.right;        // Explore right subtree
        }

        return result;
    }
}
