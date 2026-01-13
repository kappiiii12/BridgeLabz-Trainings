class ListNode {
    String value;
    ListNode next;
    ListNode(String value) { this.value = value; }
}

public class NthFromEnd {
    public static String findNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // 1. Move 'fast' pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) return null; // Case: N is larger than list length
            fast = fast.next;
        }

        // 2. Move both until 'fast' reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Slow is now at the Nth element from the end
        return slow != null ? slow.value : null;
    }

    public static void main(String[] args) {
        // Creating: A -> B -> C -> D -> E
        ListNode head = new ListNode("A");
        head.next = new ListNode("B");
        head.next.next = new ListNode("C");
        head.next.next.next = new ListNode("D");
        head.next.next.next.next = new ListNode("E");

        System.out.println(findNthFromEnd(head, 2)); // Output: D
    }
}