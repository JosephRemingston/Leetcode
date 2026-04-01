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
    public int sumNumbers(TreeNode root) {
        int ans = 0;
        return sumOfNodes(root , ans);
    }

    public static int sumOfNodes(TreeNode root , int ans){
        if(root == null){
            return 0;
        }
        else{
            ans = ans * 10 + root.val;
        }

        if(root.left == null && root.right == null){
            return ans;
        }
        return sumOfNodes(root.left , ans) + sumOfNodes(root.right , ans);
    }
}