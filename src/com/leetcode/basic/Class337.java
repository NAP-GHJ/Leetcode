package com.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

public class Class337 {

    public int rob(TreeNode root){
        Map<TreeNode,Integer> map = new HashMap<TreeNode,Integer>();
        return rob(root,map);
    }

    public int rob(TreeNode root, Map<TreeNode,Integer> map){
        if(root == null) return 0;

        if(map.containsKey(root)){
            return map.get(root);
        }

        // Include the root node
        int val = root.val;
        if(root.left != null){
            val += rob(root.left.left,map) + rob(root.left.right,map);
        }
        if(root.right != null){
            val += rob(root.right.left,map) + rob(root.right.right,map);
        }

        int val2 = rob(root.left,map) + rob(root.right,map);

        map.put(root,Math.max(val,val2));
        return Math.max(val,val2);
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
}
