package org.arif.DAILY_CHALANGE;

import java.util.LinkedList;
import java.util.Queue;

public class StudentAndSandwich {

    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0, square = 0, getSandwiches = 0;


        for (int student : students) {
            if (student == 0) circle++;
            if (student == 1) square++;
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 1 && square > 0) {
                square--;
            } else if (sandwich == 0 && circle > 0) {
                circle--;
            } else {
                getSandwiches = circle + square;
            }
        }
        return getSandwiches;
    }

    public static int countStudents1(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwich = new LinkedList<>();

        for (int i : students) {
            student.offer(i);
        }

        for (int i : sandwiches) {
            sandwich.offer(i);
        }

        int counter = 0;

        do {
            if (student.peek() == sandwich.peek()) {
                student.poll();
                sandwich.poll();
                counter = 0;
            } else {
                student.offer(student.poll());
                counter++;
            }

        }

        while (!student.isEmpty() && counter < student.size());
        return student.size();
    }

    public static void main(String[] args) {

        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {1, 0, 0, 1};

        int result = countStudents1(students, sandwiches);

        System.out.println(result);

        int[] s = {1, 1, 1, 0, 0, 1};
        int[] sw = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents1(s, sw));
    }

}
