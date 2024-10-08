

class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0); // Start DFS with initial number as 0
    }

    // Modify dfs to take the current number as an argument
    private int dfs(TreeNode root, int currentNumber) {
        if (root == null) {
            return 0; // Return 0 for null nodes
        }

        // Update the current number by appending the root's value
        currentNumber = currentNumber * 10 + root.val;

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return currentNumber; // Return the current number if leaf
        }

        // Recurse on left and right children and sum their results
        return dfs(root.left, currentNumber) + dfs(root.right, currentNumber);
    }
}
