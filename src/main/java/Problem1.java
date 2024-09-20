// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l2 == null){
            return l1;
        }
        else if (l1 == null){
            ListNode node = new ListNode(l2.val);
            ListNode copyNode = node;
            while (l2.next != null){
                l2 = l2.next;
                node.next = new ListNode(l2.val);
                node = node.next;
            }
            return copyNode;
        }
        else{
            ListNode node = new ListNode(l2.val);
            ListNode copyNode = node;
            while (l2.next != null){
                l2 = l2.next;
                node.next = new ListNode(l2.val);
                node = node.next;
            }

            ListNode origNode = l1;
            while (l1.next != null){
                l1 = l1.next;
            }

            l1.next = copyNode;

            return origNode;
        }
    }
}