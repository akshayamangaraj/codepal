/**
 *
 */
package com.subrat.tree;

/**
 * @author sparid2
 *
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(int data){
        if(root!=null){
            root.insert(data);
        }else{
            this.root = new TreeNode(data);
        }

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
                isLeftChild = true;
                current = current.getLeftChild();
            }else{
                isLeftChild = false;
                current = current.getRightChild();
            }
        }

        if(current == null){
            return;
        }

        if(current.getLeftChild()==null && current.getRightChild()==null){
            root = null;
        }else{
            if(isLeftChild){
                parent.setLeftChild(null);
            }else{
                parent.setRightChild(null);
            }
        }



    }

    public TreeNode find(int data){
        if(root!=null){
            root.find(data);
        }
        return null;

    }



}
