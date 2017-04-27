/**
 *
 */
package com.x.binarysearchtree;

/**
 * @author sparid2
 *
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data) {
        if(root == null){
            root = new TreeNode(data);
        }else{
            root.insert(data);
        }
    }

    public void delete(Integer data) {

    }

    public TreeNode find(Integer data) {

        if(root!=null){
            return root.find(data);
        }
        return null;

    }

}
