package com.leetcode.basic;

import java.util.ArrayDeque;
import java.util.Queue;

public class Class116 {

    class TreeLinkNode{
        int val;
        TreeLinkNode left,right,next;
        TreeLinkNode(int x){
            val = x;
        }
    }

    public TreeLinkNode treeBuild(){
        int []array = new int []{1,2,3};
        int maxIndex = array.length - 1;

        TreeLinkNode[] graph = new TreeLinkNode[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] != -1)
                graph[i] = new TreeLinkNode(array[i]);
            else graph[i] = null;
            if(i%2 == 1) graph[(i-1)/2].left = graph[i];
            else graph[(i-1)/2].right = graph[i];
        }

        return graph[0];
    }

    public void connect(TreeLinkNode root) {

        if(root == null) return;
        Queue<TreeLinkNode> queue = new ArrayDeque<>();
        queue.offer(root);
        TreeLinkNode tmp1 = null,tmp2 = null;

        while (!queue.isEmpty()){
            tmp1 = null;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                tmp2 = queue.poll();

                if(tmp2.left != null)
                    queue.offer(tmp2.left);
                if(tmp2.right != null)
                    queue.offer(tmp2.right);

               if(tmp1 != null) {
                   tmp1.next = tmp2;
               }
               tmp1 = tmp2;

            }

        }

    }

    public static void main(String [] args){
        TreeLinkNode treeLinkNode = new Class116().treeBuild();
        new Class116().connect(treeLinkNode);
    }
}

