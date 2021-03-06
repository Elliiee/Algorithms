public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next = swapPairs(secondNode.next); // this step has to run first
        secondNode.next = firstNode;

        return secondNode;
    }
}
