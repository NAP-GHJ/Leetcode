package com.leetcode.basic;

public class Class112 {

    public boolean hasPathSum(TreeNode root, int sum){
        return hasPathSum(root,sum,0);
    }

    public boolean hasPathSum(TreeNode root, int sum, int value){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            return value+root.val == sum;
        }
        return hasPathSum(root.left,sum,value+root.val) || hasPathSum(root.right,sum,value+root.val);

    }

}
