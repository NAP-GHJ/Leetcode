package com.leetcode.basic;

import java.util.*;

public class Class102 {
    public List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<TreeNode> tmp = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode ele = queue.poll();
            level.add(ele.val);
            if(ele.left != null) {
                tmp.add(ele.left);
            }
            if(ele.right != null) {
                tmp.add(ele.right);
            }

            if(queue.isEmpty()){
                queue = tmp;
                tmp = new ArrayDeque<>();

                result.add(level);
                level = new ArrayList<>();

            }

        }
        return result;
    }
}
