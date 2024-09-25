class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorder(p).equals(preorder(q));
    }

    public String preorder(TreeNode node) {
        if (node == null) {
            return "null,";
        }
        return node.val + "," + preorder(node.left) + preorder(node.right);
    }
}
