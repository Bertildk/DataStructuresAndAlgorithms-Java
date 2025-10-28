package DataStruct.Queue;
import java.util.*;
public class CircularQueue{ // A circular queue, is just a queue with a max capacity, it could remove the last element when attempting to add a new one or not. 
    Queue<Integer> CircularQueue;
    int length;
   
    public CircularQueue(int length){
        this.length = length;
        this.CircularQueue = new LinkedList<Integer>();
    }
    public int getLength(){
        return length;
    }
    public Queue getQueue(){
        return CircularQueue;
    }
    public void queue(int x){
        if(CircularQueue.size() < length){
            CircularQueue.add(x);
        }
    }
    
   
     
    public static void main(String[] args) {
    CircularQueue cq = new CircularQueue(10);
    for (int i = 0; i < 10; i++) {
        cq.queue(i);
    }
        while(!cq.getQueue().isEmpty()){
            cq.getQueue().poll();
        }
        System.out.println(cq.getQueue().isEmpty());
    }

}