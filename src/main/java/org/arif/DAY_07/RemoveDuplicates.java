package org.arif.DAY_07;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int uniqueValue = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[uniqueValue] = nums[i];
                uniqueValue++;
            }
        }
        return uniqueValue;
    }

    public int removeDuplicates01(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            sets.add(num);
        }
        System.out.println(sets);
        return sets.size();
    }
}
