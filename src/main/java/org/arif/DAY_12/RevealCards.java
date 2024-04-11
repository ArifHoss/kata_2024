package org.arif.DAY_12;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/reveal-cards-in-increasing-order/description/?envType=daily-question&envId=2024-04-10">...</a>
 */
public class RevealCards {
    int[] deckRevealedIncreasing(int[] deck) {
        System.out.println(Arrays.toString(deck));
        Arrays.sort(deck);

        int[] result = new int[deck.length];

        Deque<Integer> nums = new LinkedList<>();

        for (int i = 0; i < deck.length; i++) {
            nums.add(i);
        }

        for (int i = 0; i < deck.length; i++) {
            Integer polled = nums.poll();
            result[polled] = deck[i];
            if (!nums.isEmpty()) {
                nums.add(nums.poll());
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
