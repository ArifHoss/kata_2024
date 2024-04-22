package org.arif.DAY_21;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(nums1));
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n; i++, j++) {
            nums1[j] = nums2[i];
        }
        Arrays.sort(nums1);
//        while (m < nums1.length && n >= 0) {
//            nums1[m] = nums2[n-1];
//            m++;
//            n--;
//        }
    }
}
