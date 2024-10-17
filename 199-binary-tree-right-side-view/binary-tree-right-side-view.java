class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> temp = new LinkedList<>();
        temp.add(root);

        while (!temp.isEmpty()) {
            int l = temp.size();
            int val = 0;

            for (int i = 0; i < l; i++) {
                TreeNode node = temp.poll();
                val = node.val;

                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }

            ans.add(val);
        }

        return ans;
    }
}