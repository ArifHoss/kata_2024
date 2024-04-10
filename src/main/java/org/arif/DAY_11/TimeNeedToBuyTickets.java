package org.arif.DAY_11;

public class TimeNeedToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int counter = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                counter += Math.min(tickets[i], tickets[k]);
            } else {
                counter += Math.min((tickets[i]), tickets[k] - 1);
            }
        }
        return counter;
    }


    public int timeRequiredToBuy1(int[] tickets, int k) {
        int index = 0, timeCounter = 0;

        while (tickets[k] > 0) {
            if (index >= tickets.length) index = 0;
            if (tickets[index] > 0) {
                tickets[index]--;
                timeCounter++;
            }
            index++;
        }
        return timeCounter;
    }
}

/**
 * Link: https://leetcode.com/problems/time-needed-to-buy-tickets/description/?envType=daily-question&envId=2024-04-09
 */