package BINARY_TREE.Implementation;

import java.util.Scanner;

public class BT {
    
    public BT(){

    }

    public static class Node{
        int value ; 
        Node left ;
        Node right ; 

        public Node(int value){
            this.value = value ;

        }
    }
    private Node root ;

    // insert element 
    public void insert(Scanner sc){
      System.out.println("Enter the value of the root node :");
      int value = sc.nextInt();
      root = new Node(value);
      insert(sc , root);
    }

    private void insert(Scanner sc , Node node){
        System.out.println("do you want to enter the left child of " + node.value + " :");
        boolean left  = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left child of " + node.value + " :");
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc , node.left);
        }

        System.out.println("do you want to enter the right child of " + node.value + " :");
        boolean right  = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right Child of " + node.value + " :");
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc , node.right);
        }
    }
}
