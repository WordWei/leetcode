/**
 * @author: liwei
 * @create: 2021/1/27 0027
 * @description:
 **/


public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
