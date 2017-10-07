package com.leetcode.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class129 {

    public int sumNumbers(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        int total = sumNumbers(path,root);
        System.out.println(total);
        return total;
    }

    public int sumNumbers(List<Integer> path,TreeNode root){

        if(root == null) return 0;

        if(root.left == null && root.right == null) {   // root to left
            int tmp = 0;
            path.add(root.val);

            Iterator it = path.listIterator();
            while (it.hasNext()){
                tmp = tmp*10 + (int)it.next();
            }

            System.out.println(path+" "+tmp);
            path.remove(path.size()-1);

            return tmp;
        }


        int sum = 0;
        path.add(root.val);
        sum += sumNumbers(path,root.left);
        sum += sumNumbers(path,root.right);
        path.remove(path.size()-1);
        return sum;
    }

    public static void main(String [] args){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        new Class129().sumNumbers(root);
    }
}
