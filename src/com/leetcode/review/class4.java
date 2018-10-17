package com.leetcode.review;

public class class4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int len1 = nums1.length, len2 = nums2.length;
        result = findKth(0,0,nums1,nums2,(len1+len2)/2) + findKth(0,0,nums1,nums2,(len1+len2+1)/2);
        return result/2;
    }

    public int findKth(int s1, int s2, int [] nums1, int [] nums2, int k){
        return 0;
    }
}
