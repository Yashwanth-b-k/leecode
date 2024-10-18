class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>(); // Return an empty list if the tree is null
        
        List<List<Integer>> listOfLists = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int noNode = q.size(); // Number of nodes at the current level
            List<Integer> innerList = new ArrayList<>(); // Create a new list for each level
            
            // Loop through all nodes at the current level
            for (int i = 0; i < noNode; i++) {
                TreeNode curr = q.poll(); // Get the current node
                innerList.add(curr.val);  // Add the current node's value to the inner list
                
                // Add the left and right children to the queue if they exist
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            
            listOfLists.add(innerList); // Add the current level's list to the result
        }
        
        return listOfLists;
    }
}
