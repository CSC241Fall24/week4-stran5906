
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
           
        ListNode newNode = new ListNode(val);

        if (head != null && position > 1){
            ListNode origNode = head;
            ListNode temp = head;
            int i = 1;
            while (i < position && head != null){
                temp = head;
                head = head.next;
                i++;
            }
           
            temp.next = newNode;
            newNode.next = head;

            return origNode;
        }
        else{
            newNode.next = head;
            return newNode;
        }
    }
}
