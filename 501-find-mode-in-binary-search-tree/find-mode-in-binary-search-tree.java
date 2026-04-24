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
    Integer prev = null;  // int -> Integer (to allow null)
    int count = 1;
    int max = 0;
    List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        traverse(root);

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {  // modes.size -> modes.size()
            result[i] = modes.get(i);
        }
        return result;
    }

    public void traverse(TreeNode node) {  // moved state to instance vars
        if (node == null) return;

        traverse(node.left);

        // Process current node
        if (prev != null) {
            count = (node.val == prev) ? count + 1 : 1;
        }

        if (count > max) {
            max = count;
            modes.clear();          // found a higher freq, reset list
            modes.add(node.val);
        } else if (count == max) {
            modes.add(node.val);    // tie — add to modes
        }

        prev = node.val;

        traverse(node.right);
    }
}