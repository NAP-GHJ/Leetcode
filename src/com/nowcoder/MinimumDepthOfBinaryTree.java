package com.nowcoder;

// Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MinimumDepthOfBinaryTree {
    public int run(TreeNode root) {
        // 解法思路一
        if(root == null) return 0;
        int left = run(root.left),right = run(root.right);
        if(left == 0 || right == 0)
            return left + right + 1;
        return Math.min(left,right)+1;

        // 解法思路二
        //return travel(root,0);
    }

    public int travel(TreeNode root, int level){
        if(root == null) return level;
        if(root.left == null && root.right == null) return level+1;
        if(root.left == null) return travel(root.right,level+1);
        if(root.right == null) return travel(root.left,level+1);
        return Math.min(travel(root.left,level+1),travel(root.right,level+1));
    }

    public static void main(String [] args){
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        System.out.println(new MinimumDepthOfBinaryTree().run(node1));
    }
}
