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
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> op = new ArrayList<>();
        
        q.add(root);
        
        while (!q.isEmpty()) {
            int noNode = q.size();  // Number of nodes at the current level
            double sum = 0;  // Sum of node values at the current level
            
            for (int i = 0; i < noNode; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;
                
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            
            // Calculate and add the average for the current level
            op.add(sum / noNode);
        }
        
        return op;
    }
}
