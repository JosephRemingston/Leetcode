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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(list , root);
        int answer = kthSmallest(list , k);
        return answer;
    }

    public static void inOrder(List<Integer> list , TreeNode root){
        if(root == null){
            return;
        }
        inOrder(list , root.left);
        list.add(root.val);
        inOrder(list , root.right);
    }
    public int kthSmallest(List<Integer> arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Integer num : arr){
            pq.add(num);
        }

        for(int i = 1; i < k; i++){
            pq.poll();
        }

        return pq.peek();
    }
}