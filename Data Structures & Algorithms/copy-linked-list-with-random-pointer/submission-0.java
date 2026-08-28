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
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        Node answer=map.get(head);
        while(head!=null){
            Node n=map.get(head);
            if(head.next!=null){
              n.next=map.get(head.next);
            }else{
                n.next=null;
            }
            if(head.random!=null){
              n.random=map.get(head.random);
            }else{
                n.random=null;
            }
            head=head.next;
        
        }
        return answer;
    }
}
