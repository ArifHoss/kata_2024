package org.arif.DAY_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedList {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        return list1 == null ? list2 : list1;
    }

    public static void main(String[] args) {


        List<Integer> list1 = List.of(1, 2, 4);
        List<Integer> list2 = List.of(1, 3, 5);


        List<Integer> mergeTwoLists = mergeTwoLists(list1, list2);
        System.out.println(mergeTwoLists);

        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = List.of(3);
        System.out.println();
        if (list3.isEmpty() || list3 == null) {
            System.out.println(list4);
        } else {
            System.out.println(list3);
        }
        System.out.println(mergeTwoLists(list3, list4));

    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        if (!list1.isEmpty() && !list2.isEmpty()) {
            return mergedList.stream().sorted().collect(Collectors.toList());
        }
        return (list1.isEmpty() || list1 == null) ? list2 : list1;
    }


}

