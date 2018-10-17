package com.leetcode.basic;

public class TreeUtils {
    public static TreeNode treeBuild(){
        int []array = new int []{0,1,3,4,5,6};
        int maxIndex = array.length - 1;

        TreeNode[] graph = new TreeNode[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] != -1)
                graph[i] = new TreeNode(array[i]);
            else graph[i] = null;
            if(i%2 == 1) graph[(i-1)/2].left = graph[i];
            else graph[(i-1)/2].right = graph[i];
        }

        return graph[0];
    }

    public static void treePrint(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        treePrint(root.left);
        treePrint(root.right);
    }

    public static void main(String [] args){
        TreeNode root = TreeUtils.treeBuild();
        new Class107().levelOrderBottom(root);
    }
}
