/**
 *
 */
package com.x.binarysearchtree;

/**
 * @author sparid2
 *
 */
public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public Integer getData() {
        return data;
    }
    public TreeNode getLeftChild() {
        return leftChild;
    }
    public TreeNode getRightChild() {
        return rightChild;
    }


    public TreeNode find(Integer data){

        if(this.data == data){
            return this;
        }

        if(data < this.data && this.leftChild !=null){
            leftChild.find(data);
        }

        if(this.rightChild !=null){
            rightChild.find(data);
        }

        return null;

    }

    public void insert(Integer data){
        if(data >= this.data){
            if(this.rightChild == null){
                this.rightChild = new TreeNode(data);
            }else{
                this.rightChild.insert(data);
            }
        }else{

            if(this.leftChild == null){
                this.leftChild = new TreeNode(data);
            }else{
                this.leftChild.insert(data);
            }

        }
    }



}
