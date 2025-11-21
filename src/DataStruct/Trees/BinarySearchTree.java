package DataStruct.Trees;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.insert(5);
        node.insert(12);
        node.insert(9);
        System.out.println(node.data);
        System.out.println(node.LChild.data);
        System.out.println(node.RChild.data);
        System.out.println(node.LChild.RChild.data);
        node = node.remove(9);
        if(node.LChild.RChild == null){
            System.out.println("Remove method working!");
        }
    }
}
