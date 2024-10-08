import java.util.Stack;

class Solution {
    public void flatten(TreeNode root) {
        // Use a stack to hold nodes temporarily
        Stack<TreeNode> stack = new Stack<>();
        flatten(root, stack);  // Start the flattening process
    }

    private void flatten(TreeNode root, Stack<TreeNode> stack) {
        if (root == null) {  // Base case: If the node is null, do nothing
            return;
        }

        // Step 1: Check if the node has a left child
        if (root.left != null) {
            // Step 2: If there's a right child, we need to save it for later!
            if(root.right != null) {
                stack.push(root.right);  // Save the right subtree
            }
            
            // Step 3: Move the left subtree to the right
            root.right = root.left;
            root.left = null;  // Set the left pointer to null
        }

        // Step 4: If the right child is missing but we have saved subtrees, pop from the stack
        if (root.right == null && !stack.empty()) {
            root.right = stack.pop();  // Retrieve the saved right subtree
        }

        // Recursive call to flatten the next right subtree
        flatten(root.right, stack);
    }
}