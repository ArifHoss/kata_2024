package org.arif;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
//        System.out.println("deck before sort = "+Arrays.toString(deck));
        Arrays.sort(deck);
//        System.out.println("deck after sort = "+Arrays.toString(deck));
        int n = deck.length;
        Deque<Integer> ques = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ques.add(i);
        }
//        System.out.println("ques = "+ques);
        int[] ans = new int[n];
//        Integer polled = ques.poll();
//        System.out.println("polled "+polled);
//        System.out.println("ques after polled = "+ques);
        for (int i = 0; i < n; i++) {
            Integer polled = ques.poll();
            ans[polled] = deck[i];
            if (!ques.isEmpty()) {
                ques.add(ques.poll());
            }
        }

        System.out.println("answer = "+Arrays.toString(ans));
    }
}
