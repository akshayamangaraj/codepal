/**
 *
 */
package com.subrat.programs;

/**
 * @author sparid2
 *
 */
public class FindTheClosestValue {

    private static TreeNode root;
    private static Double min = (double) Integer.MAX_VALUE;
    private static Integer min1 = Integer.MAX_VALUE;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Double[] array = {1.2,2.3,3.4,4.5,5.6,6.7};
        root = buildBST(array,root);
        System.out.println("preorder traversal of the tree");
        inOrderTraversal(root);
        Double doubleValue = 3.5;
        Double value = findClosestValue(root, doubleValue,min );

    }

    private static Double findClosestValue(TreeNode root, Double doubleValue, Double min) {

        if(root == null){
            return null;
        }

        if(root.getData()==doubleValue){
            return root.getData();
        }


        If(Math.abs(root.getData()-doubleValue < min)){
            min = Math.abs(root.getData()- doubleValue);
        }

        if(doubleValue < root.getData() && root.getLeftChild()!=null){
            findClosestValue(root.getLeftChild(), doubleValue, min);
        }else if(root.getRightChild()!=null){
            findClosestValue(root.getRightChild(), doubleValue, min);

        }


        return null;
    }

    private static void inOrderTraversal(TreeNode root) {

        if(root == null){
            return;
        }

        if(root.getLeftChild()!=null){
            inOrderTraversal(root.getLeftChild());
        }
        System.out.println(root.getData());
        if(root.getRightChild()!=null){
            inOrderTraversal(root.getRightChild());
        }


    }

    private static TreeNode buildBST(Double[] array, TreeNode root) {
        if(array==null){
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            root = insertNode(root,array[i]);
        }
        return null;
    }

    private static TreeNode insertNode(TreeNode root, Double value) {
        if(root == null){
            root = new TreeNode(value);
        }
        if(value < root.getData()){
            root.leftChild = insertNode(root.getLeftChild(),value);
        }else{
            root.rightChild = insertNode(root.getRightChild(), value);
        }

        return null;
    }

}
