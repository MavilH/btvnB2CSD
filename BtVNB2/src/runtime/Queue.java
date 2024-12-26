
package runtime;

public class Queue {
    Node front;
    Node rear;
    public void enQueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            rear = newNode;
            front = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        
        
    }
    
    public Node deQueue(){
        if(front == null){
            System.out.println("Queue k co phan tu");
            return null;
        }
        Node delNode;
        delNode = front;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return delNode;
    }
}
