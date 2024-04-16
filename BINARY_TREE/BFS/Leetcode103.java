package BINARY_TREE.BFS;
 // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode103 {
    public static void main(String[] args) {
        
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {}
        
        TreeNode(int val) { 
            this.val = val; 
        }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
      public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); 

        if(root == null){
            return result  ; 
        }
        Deque<TreeNode> queue = new LinkedList<>() ;
        queue.offer(root) ; 
        

        boolean reverse = false  ;

        while(!queue.isEmpty()){
            int levelSize = queue.size() ;
            List<Integer> currentLevel   = new ArrayList<>() ; 
            for(int i = 0; i < levelSize ; i++){



// in this part we are checkinf if the reverse is true then we are going to retrieve from first and add in last of the list
                if(!reverse){
                    TreeNode currentNode = queue.pollFirst() ;
                    currentLevel.add(currentNode.val) ;
                    if(currentNode.left != null){
                        queue.offer(currentNode.left) ;

                    }
                    if(currentNode.right != null){
                        queue.offer(currentNode.right) ;
                    }
                }else {
                    TreeNode currentNode = queue.pollLast() ;
                    currentLevel.add(currentNode.val) ;
                    if(currentNode.right != null){
                        queue.offerFirst(currentNode.right) ;
                    }
                     if(currentNode.left != null){
                        queue.offerFirst(currentNode.left);

                    }
                    // in this part  we are checking the removing from first and adding from last into the queue 
                }
            }
            reverse = !reverse ; 
            result.add(currentLevel) ;
        }

 return result ; 
        
        
    }
    
}
