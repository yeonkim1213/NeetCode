// Time: O(n)
// Space: O(n)

package Trees.InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // Queue ensures that nodes are processed in the order they are discovered - FIFO 
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                queue.offer(node.left);
            }
            
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}