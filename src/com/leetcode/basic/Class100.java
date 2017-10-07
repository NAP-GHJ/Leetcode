package com.leetcode.basic;

public class Class100 {

    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p == null && q == null) return true;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
