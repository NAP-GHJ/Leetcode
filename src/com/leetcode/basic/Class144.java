package com.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

public class Class144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        preorderTraversal(root,result);

        return result;
    }

    public void preorderTraversal(TreeNode root, List<Integer> result){
        if(root == null) return;
        result.add(root.val);
        preorderTraversal(root.left,result);
        preorderTraversal(root.right,result);
    }
}
