/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap();
        Node curr = new Node(-1);
        Node newHead = curr;
        while (head != null){
            if (map.containsKey(head)){
                curr.next = map.get(head);
            } else {
                Node temp = new Node(head.val);
                map.put(head, temp);
                curr.next = temp;
            }

            curr = curr.next;

            if (head.random != null){
                if (map.containsKey(head.random)){
                    curr.random = map.get(head.random);
                } else {
                    Node temp = new Node(head.random.val);
                    map.put(head.random, temp);
                    curr.random = temp;
                }
            }
            head = head.next;
        }

        return newHead.next;
    }
}