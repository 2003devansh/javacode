package BINARY_TREE.BFS;
// https://leetcode.com/problems/symmetric-tree/description/

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode101 {
    public static void main(String[] args) {
        
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true ;
        }
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.add(root.left) ;
        queue.add(root.right) ;
        
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll() ;
            TreeNode right = queue.poll() ; 
            if(left == null && right == null){
                continue ;
            }
            if(left == null || right == null){
                return false ;
            }
            queue.add(left.left);
            queue.add(right.right) ;
            queue.add(left.right) ;
            queue.add(right.left);
            
        }
     
        return true ;
        
    }
    
}
