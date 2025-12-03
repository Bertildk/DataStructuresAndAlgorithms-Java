package JavaTest;

import javax.swing.event.ListSelectionEvent;

public class mergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);


        ListNode l3 = mergeTwoListsRecursion(l1, l2);
        while(l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public static ListNode mergeTwoListsRecursion(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        head.next = mergeTwoListsRecursionHelper(l1, l2);
        return head.next;
    }
    public static ListNode mergeTwoListsRecursionHelper(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoListsRecursionHelper(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoListsRecursionHelper(l1,l2.next);
            return l2;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0); //Has to set this to 0, so that current can link the lists. 
        ListNode current = head;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;

        }
        while(list1 != null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }
        while(list2 != null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }
        
        return head;
    }
}
