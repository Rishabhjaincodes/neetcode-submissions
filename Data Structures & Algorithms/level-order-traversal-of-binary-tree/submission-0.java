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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root == null) return res;
        q.offer(root);
        q.offer(null);
        List<Integer> l=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            if(n==null){
                if(!q.isEmpty()){
                    q.offer(null);
                    res.add(l);
                    l=new ArrayList<>();
                }
            }
            else{
              l.add(n.val);
              if(n.left!=null){
                q.offer(n.left);
              }
              if(n.right!=null){
                q.offer(n.right);
              }
            }
        }
        res.add(l);
        return res;
    }
}
