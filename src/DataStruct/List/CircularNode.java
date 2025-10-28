package DataStruct.List;
public class CircularNode{ // Circular LinkedList The last nodes pointer goes to the first node. 
   
    int data; 
    CircularNode next;
   
    public CircularNode(int data){
        this.data = data;
        this.next = null;
    }
}