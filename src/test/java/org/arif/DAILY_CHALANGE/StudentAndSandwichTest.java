package org.arif.DAILY_CHALANGE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAndSandwichTest {

    @Test
    void countStudents() {
        StudentAndSandwich ss = new StudentAndSandwich();
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        int actual = ss.countStudents(students, sandwiches);
        assertEquals(3, actual);
    }
}