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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length ==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        
        int i1 = findIndex(inorder, preorder[0]);

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, i1 + 1), 
                               Arrays.copyOfRange(inorder, 0, i1));
        root.right = buildTree(Arrays.copyOfRange(preorder, i1 + 1, preorder.length), 
                                Arrays.copyOfRange(inorder, i1 + 1, inorder.length));


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