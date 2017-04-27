/**
 *
 */
package com.subrat.programs;

/**
 * @author sparid2
 *
 */
public class TreeNode {

    private Double data;
     TreeNode leftChild;
     TreeNode rightChild;

    public TreeNode(Double data){
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }




}
