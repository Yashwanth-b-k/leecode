class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> listOfLists = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        
        while (!q.isEmpty()) {
            int noNode = q.size();
            List<Integer> innerList = new ArrayList<>();
            
            for (int i = 0; i < noNode; i++) {
                TreeNode curr = q.poll();
                
                // Add node to the list based on the current direction
                if (leftToRight) {
                    innerList.add(curr.val);
                } else {
                    innerList.add(0, curr.val);  // Add at the beginning for reverse order
                }
                
                // Add children to the queue
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            
            // Toggle the direction for the next level
            leftToRight = !leftToRight;
            listOfLists.add(innerList);
        }
        
        return listOfLists;
    }
}
