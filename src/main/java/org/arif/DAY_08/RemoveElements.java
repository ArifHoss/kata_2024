package org.arif.DAY_08;

import java.util.Arrays;

public class RemoveElements {
    public int removeElements(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;



    }
}
