package DataStruct.Trees;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.insert(5);
        root.insert(12);
        root.insert(9);
        System.out.println(root.data);
        System.out.println(root.LChild.data);
        System.out.println(root.RChild.data);
        System.out.println(root.LChild.RChild.data);
        root = root.remove(9);
        if(root.LChild.RChild == null) System.out.println("Remove method working!");
        else System.out.println("remove method not working!");

        if(!root.contains(9) && root.contains(5)) System.out.println("Contains method working!");
        else System.out.println("Contains method not working!");

        if(root.findMax().data == 12) System.out.println("findMax method working!");
        else System.out.println("findMax method not working!");

        if(root.findMin().data == 5) System.out.println("findMin method working!");
        else System.out.println("findMin method not working!");

        root = root.makeEmpty();
        if(Node.isEmpty(root)) System.out.println("makeEmpty method working!\nisEmpty method working!");
        else System.out.println("makeEmpty or isEmpty not working!");
        
    }
}
