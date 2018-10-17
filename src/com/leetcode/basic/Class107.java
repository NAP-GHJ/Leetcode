package com.leetcode.basic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Class107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();

        if(root == null) return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            for(int i = 0; i < size;i++) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
                level.add(tmp.val);
            }
            result.add(0,new ArrayList<>(level));
            level.clear();
        }
        System.out.println(result);
        return result;
    }

}
