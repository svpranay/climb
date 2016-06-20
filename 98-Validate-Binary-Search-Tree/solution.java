/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isvalid(root.left, Integer.MIN_VALUE, false, root.val, true) && isvalid(root.right, root.val, true, Integer.MAX_VALUE, false);
    }
    
    public boolean isvalid(TreeNode root, int min, boolean mincheck, int max, boolean maxcheck) {
        if (root == null) return true;
        if (root.val >= max && maxcheck) return false;
        if (mincheck && root.val <= min) return false;
        return isvalid(root.left, min, mincheck, root.val, true) &&  isvalid(root.right, root.val, true, max, maxcheck);
    }
    
    
    
}