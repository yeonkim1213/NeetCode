// Time: O(n)
// Space: O(n)

package Trees.InvertBinaryTree;

public class DepthFirstSearch {
    // Recursion
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        TreeNode node = new TreeNode(root.val);

        node.right = invertTree(root.left);
        node.left = invertTree(root.right);
        
        return node;
    }
}
