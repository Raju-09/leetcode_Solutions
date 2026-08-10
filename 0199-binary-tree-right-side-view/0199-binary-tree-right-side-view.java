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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){
            int levsize=que.size();
            for(int i=0;i<levsize;i++){
                TreeNode node=que.poll();
                if(i==levsize-1){
                    res.add(node.val);
                }
                if(node.left!=null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
        }
        return res;
    }
}