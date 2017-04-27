/**
 *
 */
package com.subrat.tree;

/**
 * @author sparid2
 *
 */
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int data){
        if(data<=this.data){
            if(this.leftChild == null){
                this.leftChild = new TreeNode(data);
            }else{
                this.leftChild.insert(data);
            }
        }else{
            if(this.rightChild == null){
                this.rightChild = new TreeNode(data);
            }else{
                this.rightChild.insert(data);
            }

        }
    }

    public TreeNode find(int data){

        if(data<=this.data && leftChild != null){
            return this.leftChild.find(data);
        }
        if(data>this.data && rightChild!=null){
            return this.rightChild.find(data);
        }

        return null;

    }



    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }



}
