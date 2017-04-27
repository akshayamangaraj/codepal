/**
 *
 */
package com.x.binary.search.tree;

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

    @Override
    public String toString() {
        return "TreeNode [data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
    }

    public TreeNode find(Integer data){

        if(data < this.data && leftChild !=null){
            return this.leftChild.find(data);
        }else{
            if(this.rightChild!=null){
            return this.rightChild.find(data);
            }
        }
        return null;

    }

    public void insert(Integer data){
        if(data >=this.data){
            if(this.rightChild == null){
                this.rightChild = new TreeNode(data);
            }
            this.rightChild.insert(data);
        }else{
            if(this.leftChild == null){
                this.leftChild = new TreeNode(data);
            }
            this.leftChild.insert(data);
        }
    }

    public boolean isLeaf(){
        return this.leftChild == null && this.rightChild == null;
    }

    public Integer noOfLeafNodes(){

        int left = 0;
        int right = 0;

        if(isLeaf()){
            return 1;
        }
        else{
            if(this.leftChild!=null){
                left = leftChild.noOfLeafNodes();
            }
            if(this.rightChild!=null){
                right = rightChild.noOfLeafNodes();
            }

        }
        return left+right;
    }

    public Integer height(){

        int left = 0;
        int right = 0;

        if(isLeaf()){
            return 1;
        }
        else{
            if(this.leftChild!=null){
            left = this.leftChild.height();
            }
            if(this.rightChild!=null){
                right = this.rightChild.height();
            }

        }

        if(left > right){
            return left+1;
        }else{
            return right+1;
        }
    }

    public void traverseInOrder(){
        if(this.leftChild!=null){
            this.leftChild.traverseInOrder();
        }
        System.out.println(this);

        if(this.rightChild!=null){
            this.rightChild.traverseInOrder();
        }
    }

    public Integer largest(){
        if(this.rightChild!=null){
            return this.rightChild.largest();
        }else{
            return this.data;
        }

    }

    public Integer smallest(){
        if(this.leftChild == null){
            return this.data;
        }else{
            this.leftChild.smallest();
        }
        return null;
    }

    public TreeNode addSorted(int[] data, int start, int end){

        int mid = (start+end)/2;
        TreeNode newNode = new TreeNode(mid);
        if(end>=start){
            newNode.leftChild = leftChild.addSorted(data, start, mid-1);
            newNode.rightChild = rightChild.addSorted(data, mid+1, end);
            return newNode;
        }

        return null;

    }

}
