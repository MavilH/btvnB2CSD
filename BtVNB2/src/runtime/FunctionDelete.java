
package runtime;

public class FunctionDelete {
     Node head;
     public Node removeFirst(){
           Node delete = null;
           if(head == null){
               System.out.println("LinkList k co phan tu");
           }else{
               delete = head;
               head = head.next;
           }
           return delete;
       }
       public Node removeLast(){
           if(head == null){
               System.out.println("LinkList k co phan tu");
               return null;
           }else if(head.next == null){
               Node delNode =  head;
               head = null;
               return delNode;
           }
           Node prev = null;
           Node tmp = head;
           while(tmp.next != null || head.next == null){
               prev = tmp;
               tmp = tmp.next;
           }
           prev.next = null;
           return tmp;
       }
       public Node removeNode(int index){
           if(index < 0){
               System.out.println("index phai >= 0");
               return null;
           }
           Node tmp = head;
           Node prev = null;
           int checkIndex = 0;
           if(head == null){
               System.out.println("LinkList k co phan tu");
               return null;
           }
           if(index == 0){
               return removeFirst();
           }
           while(tmp.next != null && checkIndex < index){
               prev = tmp;
               tmp = tmp.next;
               checkIndex++;
           }
           if(checkIndex != index){
               System.out.println("Index vuot qua r");
               return null;
           }

           prev.next = tmp.next;
           return tmp;
       }
}
