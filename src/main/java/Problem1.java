// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode origNode = l1;
        ListNode node = new ListNode(l2.val);
        ListNode copyNode = node;

        while (l2.next != null){
            l2 = l2.next;
            node.next = new ListNode(l2.val);
            node = node.next;
        }

        while (l1.next != null){
            l1 = l1.next;
        }

        l1.next = copyNode;

        return origNode;
    }
}