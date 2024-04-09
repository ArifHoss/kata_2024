package org.arif.DAY_10;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        if (target < nums[0]) {
            return 0;
        }

        if (target > nums[right]) {
            return right + 1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

//    public int searchInsertPosition(int[] nums, int target) {
//        for (int index = 1; index < nums.length; index++) {
//            if (nums[index] == target) {
//                return index;
//            } else if (target > nums[index-1] && target < nums[index]){
//                return index;
//            }
//        }
//        return nums.length;
//    }
}
