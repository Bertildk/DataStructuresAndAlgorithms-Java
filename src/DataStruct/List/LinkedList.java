package DataStruct.List;
public class LinkedList {
    public LinkedList(){
       
    }
    public static void main(String[] args) {
        //Singly Linked List
       Node head = new Node(5);
       head.next = new Node(10);
       head.next.next = new Node(15);
       

        //Doubly Linked List
        DoublyNode head2 = new DoublyNode(5);
        head2.next = new DoublyNode(10);
        head2.next.prev = head2;
        head2.next.next = new DoublyNode(15);
        head2.next.next.prev = head2.next;
        
        DoublyNode temp = head2;
        while (temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();

        //Circular Linked List - Singly
        //Circular LinkedLists, the last node points to the first node instead of null. 
        CircularNode head3 = new CircularNode(5);
        head3.next = new CircularNode(10);
        head3.next.next = new CircularNode(15);
        head3.next.next.next = head3;
        CircularNode temp2 = head3;
        int i = 0;
        while(temp2 != null){
            System.out.print(temp2.data);
            if(temp2.next != null){
                System.out.print(" <-> ");
            }
            temp2 = temp2.next;
            i++;
            if(i > 100){
                System.out.println();
                System.out.println("Breaking never ending While loop, shoving circular Linked list implementation");
                break;
            }
        }



    }
}
