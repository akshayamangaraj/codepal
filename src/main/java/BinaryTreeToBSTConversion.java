/**
 *
 */

/**
 * @author sparid2
 * http://www.geeksforgeeks.org/binary-tree-to-binary-search-tree-conversion/
 * 
 *
 */
public class BinaryTreeToBSTConversion {



    void populateInorderArray(Node  r, int arr, int pos)
    {
        if(r == NULL)
            return;

        populateInorderArray(r->lptr, arr, pos);
        arr[pos] = r->data;
        (pos)++;
        populateInorderArray(r->rptr, arr, pos);
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public TreeNode sortedArrayToBST(int[] num) {
            if (num.length == 0)
                return null;

            return sortedArrayToBST(num, 0, num.length - 1);
        }

        public TreeNode sortedArrayToBST(int[] num, int start, int end) {
            if (start > end)
                return null;

            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = sortedArrayToBST(num, start, mid - 1);
            root.right = sortedArrayToBST(num, mid + 1, end);

            return root;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
