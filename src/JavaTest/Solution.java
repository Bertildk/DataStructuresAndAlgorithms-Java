package JavaTest;

public class Solution {   
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1, l2));
        ListNode l3 = addTwoNumbers(l1, l2);
        ListNode tmp = l3;
        while (tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }

    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int mynum = 0;
        ListNode tmp = l1;
        ListNode tmp2 = l2;
        int multiplier = 1;
        int sum = 0;
        while(tmp != null || tmp2 != null){
            sum += (tmp.val + tmp2.val)*multiplier;
            tmp2 = tmp2.next;
            tmp = tmp.next;
            multiplier *= 10;
        }
        ListNode result = new ListNode();
        result = createList(sum);
        
        return result;
    }
    static ListNode createList(int val){
        if (val ==0 ){
            return null;
        }
        ListNode result = new ListNode(val%10);
        result.next = createList(val/10);
        return result;
    }
   
}