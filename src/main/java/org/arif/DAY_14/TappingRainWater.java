package org.arif.DAY_14;

import java.util.Arrays;

public class TappingRainWater {
    /**
     * TappingRainWater
     * <a href="https://leetcode.com/problems/trapping-rain-water/description/?envType=daily-question&envId=2024-04-12">...</a>
     */
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        left[0] = height[0];
        int[] right = new int[n];
        right[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }
        System.out.println("HEIGHT = "+Arrays.toString(height));
        System.out.println("LEFT = "+Arrays.toString(left));
        System.out.println("RIGHT = "+Arrays.toString(right));
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter += Math.min(left[i], right[i]) - height[i];
        }
        return counter;
    }
}
