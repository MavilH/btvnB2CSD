
package runtime;


public class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
         this.data = data;
    }

    public int getNode() {
        return data;
    }

    public void setNode(int node) {
        this.data = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
