package DataStruct.Queue;
import java.util.*;
public class CircularList{
    int length;
    int[] List;
   
    public CircularList(int length){
        this.length = length;
        this.List = new int[length];
    }
    public int getLength(){
        return length;
    }
    public int[] getList(){
        return List;
    }
    public int getValue(int index){
        index %= getLength();
        return List[index];
    }
    public void setValue(int value, int index){
        
        index %= getLength();
        List[index] = value;
    }
    public void expandQueue(int expandAmount){
        int[] q = new int[expandAmount+length];
        for (int i = 0; i < List.length; i++) {
            q[i] = List[i];
        }
        this.List = q;  
        this.length = expandAmount+length;   
    }
    public static void main(String[] args) {
        CircularList myCircularList = new CircularList(10);
        System.out.println("Length of the Circular List is: " + myCircularList.getLength());

        for (int i = 0; i < myCircularList.getLength(); i++) {
            myCircularList.setValue(i*i, i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Value: " + myCircularList.getValue(i)+ " at index: " + i);
        }
        System.out.println("*******************************");
        myCircularList.expandQueue(1);
        for (int i = 0; i < 100; i++) {
            System.out.println("Value: " + myCircularList.getValue(i)+ " at index: " + i);
        }
        
    }

}