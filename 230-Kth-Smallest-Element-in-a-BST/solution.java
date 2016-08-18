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
    
    public class TT {
        int kleft;
        int kright;
        TreeNode node;
        TT left;
        TT right;
        TT(int kleftv, int krightv, TreeNode nv, TT tleft, TT tright) { kleft = kleftv; kright = krightv; node = nv; left = tleft; right = tright; }
    }
    public int kthSmallest(TreeNode root, int k) {
        TT tt = construct(root);
        return solve(tt, k).val;
    }
    
    public TreeNode solve(TT tt, int k) {
        System.out.println(tt.kleft + " " + tt.kright + " " + k);
        if (tt.kleft + 1 == k) {
            return tt.node;
        }
        if (tt.kleft < k) {
            return solve(tt.right, k - (tt.kleft + 1));
        } else {
            return solve(tt.left, k);
        }
    }
    
    public TT construct(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TT tleft = construct(root.left);
        TT tright = construct(root.right);
        int count;
        if (tleft == null)
            count = 0;
        else
            count = tleft.kleft + tleft.kright + 1 ;
        int count2;    
        if (tright == null)
            count2 = 0;
        else 
            count2 = tright.kleft + tright.kright + 1 ;  
        TT tcenter = new TT(count, count2,  root, tleft, tright);
        return tcenter;
    }
    

}