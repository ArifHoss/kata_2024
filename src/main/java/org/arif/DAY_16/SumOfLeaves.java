package org.arif.DAY_16;

public class SumOfLeaves {
    /**
     * <a href="https://leetcode.com/problems/sum-of-left-leaves/description/?envType=daily-question&envId=2024-04-14">...</a>
     */
    public static void main(String[] args) {
       
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        int ans = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                ans += root.left.val;
            else
                ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);

        return ans;
    }
}
