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
    public int maxDepth(TreeNode root) {
     if(root == null) return 0;
      
      //  return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        int dep=0;
        while(!que.isEmpty()){
            int levsize=que.size();
            for(int i=0;i<levsize;i++){
                TreeNode node=que.poll();
                if(node.left!=null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            dep++;

        }
        return dep;


    }
}