
package runtime;

public class Stack {
    Node top;
    
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public Node pop(){
        if(top == null){
            System.out.println("Head k co phan tu");
            return null;
        }
        Node delNode = top;
        top = top.next;
        return delNode;
    }
    
    
    
}
