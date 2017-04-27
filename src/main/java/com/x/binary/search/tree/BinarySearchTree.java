/**
 *
 */
package com.x.binary.search.tree;

/**
 * @author sparid2
 *
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data){
        if(root == null){
            root = new TreeNode(data);
        }
        else{
            root.insert(data);
        }
    }

    public void delete(Integer data){

    }

    public TreeNode find(Integer data){

        if(data == this.root.getData()){
            return this.root;
        }

        if(this.root == null){
            return null;
        }else{
            this.root.find(data);
        }
        return null;

    }

    public Integer noOfLeafNodes(){
        if(root == null){
            return 0;
        }
        else{
            root.noOfLeafNodes();
        }
        return null;
    }

    public Integer height(){
        if(root !=null){
            root.height();
        }
        return null;
    }



    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
