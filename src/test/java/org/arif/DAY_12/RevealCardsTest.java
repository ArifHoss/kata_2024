package org.arif.DAY_12;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RevealCardsTest {

    @Test
    void deckRevealedIncreasing() {
        RevealCards cards = new RevealCards();
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        String actual = Arrays.toString(cards.deckRevealedIncreasing(deck));
        String expected = Arrays.toString(new int[]{2, 13, 3, 11, 5, 17, 7});
        assertEquals(expected,actual);

    }
}