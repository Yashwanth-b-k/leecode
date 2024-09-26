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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if (postorder.length == 0 || inorder.length ==0) return null;
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        
        int i1 = findIndex(inorder, root.val);

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, i1), 
                               Arrays.copyOfRange(postorder, 0, i1));
        root.right = buildTree(Arrays.copyOfRange(inorder, i1 + 1, inorder.length), 
                                Arrays.copyOfRange(postorder, i1 , postorder.length - 1));


        return root;
    }
    public static int findIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}