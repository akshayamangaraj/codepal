/**
 *
 */

/**
 * @author sparid2
 *
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(int data){
        if(this.root == null){
            this.root = new TreeNode(data);
        }else{
            this.root.insert(data);
        }
    }

    public TreeNode find(Integer data){
        if(root != null){
            root.find(data);
        }

        return null;

    }

    public void delete(int data){

    }

}
