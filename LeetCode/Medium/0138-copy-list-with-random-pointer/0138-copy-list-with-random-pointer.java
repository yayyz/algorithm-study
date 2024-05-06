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
        Node ptr = head;
        // node map where it stores old - new 
        Map<Node, Node> map = new HashMap<Node, Node>(); 
        // null values 
        map.put(null, null);

        while(ptr != null) {
            map.put(ptr, new Node(ptr.val));
            ptr = ptr.next;
        }

        ptr = head;
        while(ptr != null) {
            Node copy = map.get(ptr);
            copy.next = map.get(ptr.next);
            copy.random = map.get(ptr.random);    
            ptr = ptr.next;
        }

        return map.get(head);
    }
}