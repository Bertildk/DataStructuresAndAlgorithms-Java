package DataStruct.List;

public class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;
    public DoublyNode(int data){
        this.data = data;
        this.next = null;
    }
    public int getData(){
        return data;
    }
}
