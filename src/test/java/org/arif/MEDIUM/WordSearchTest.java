package org.arif.MEDIUM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void exist() {
        WordSearch search = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String word = "ABCCED";
        assertTrue(search.exist(board, word));
    }

    @Test
    void exist1() {
        WordSearch search = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String word = "SEE";
        assertTrue(search.exist(board, word));
    }
    @Test
    void exist2() {
        WordSearch search = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String word = "ABCB";
        assertFalse(search.exist(board, word));
    }
}