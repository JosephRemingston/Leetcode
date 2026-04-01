/**
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 */


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) {
            return answer;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        int level = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i =0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);

                if(node.left != null) {
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
        
            if(level % 2 == 1){
                Collections.reverse(list);
            }


            level++;
            answer.add(list);
        }
        return answer;
    }
}