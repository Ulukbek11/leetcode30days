

public static void main(String[] args) {

    }
public class SearchInABinarySearchTree700 {

  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }



    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;

        while (curr != null) {
            System.out.print(curr.val);
            if (curr.val == val) {
                return curr;
            }

            if (curr.val < val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
    return null;
    }   

}
