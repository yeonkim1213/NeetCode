//Stack (DFS): Prioritizes depth, processing deeper nodes first.
//Queue (BFS): Prioritizes breadth, processing all nodes at the current level before moving to the next.

package Trees.InvertBinaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}