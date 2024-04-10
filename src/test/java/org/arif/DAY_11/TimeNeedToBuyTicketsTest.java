package org.arif.DAY_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeNeedToBuyTicketsTest {

    @Test
    void timeRequiredToBuy() {
        TimeNeedToBuyTickets time = new TimeNeedToBuyTickets();

        int[] tickets = {2, 3, 2};
        int actual = time.timeRequiredToBuy(tickets, 2);
        assertEquals(6, actual);

    }
}