package com.leetcode.basic;

public class TreeUtils {
    public TreeNode treeBuild(){
        int []array = new int []{0,1,3};
        int maxIndex = array.length - 1;
        TreeNode root;
        for(int i = 0; i < array.length; i++){
            root = new TreeNode(array[i]);

        }
        return null;
    }

    public void treePrint(TreeNode root){
        if(root == null) return;
        System.out.print(root.val);
        System.out.print("----");
        treePrint(root.left);
        System.out.print("|");
        System.out.print("|");
        System.out.print("----");
        treePrint(root.right);
    }
}
