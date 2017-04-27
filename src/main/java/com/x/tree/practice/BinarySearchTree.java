/**
 *
 */
package com.x.tree.practice;

/**
 * @author sparid2
 *
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(int data){

    }

    public void delete(int data){

        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if(current == null){
            return;
        }

        while(current!=null && current.getData()!=data){
            parent = current;
            if(data<current.getData()){
                current = current.getLeftChild();
                isLeftChild = true;
            }else{
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if(current == null){
            return;
        }
        if(current.getLeftChild()==null && current.getRightChild()==null){
            if(current==root){
                root =null;
            }else{
                if(isLeftChild){
                parent.setLeftChild(null);
                }else{
                parent.setRightChild(null);
                }
                }

        }

    }

    public TreeNode find(int data){
        return null;

    }

}
