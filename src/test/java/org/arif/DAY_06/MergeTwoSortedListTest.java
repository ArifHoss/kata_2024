package org.arif.DAY_06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTwoSortedListTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedList merger = new MergeTwoSortedList();
        MergeTwoSortedList.ListNode list1 = merger.new ListNode(1, merger.new ListNode(2, merger.new ListNode(4)));

        MergeTwoSortedList.ListNode list2 = merger.new ListNode(1, merger.new ListNode(3, merger.new ListNode(4)));

        MergeTwoSortedList.ListNode expected = merger.new ListNode(1, merger.new ListNode(1, merger.new ListNode(2,
                merger.new ListNode(3, merger.new ListNode(4, merger.new ListNode(4))))));
        System.out.println(list1);
        System.out.println(list2);

        assertTrue(areListsEqual(expected, merger.mergeTwoLists(list1, list2)));


    }
    private boolean areListsEqual(MergeTwoSortedList.ListNode l1, MergeTwoSortedList.ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}