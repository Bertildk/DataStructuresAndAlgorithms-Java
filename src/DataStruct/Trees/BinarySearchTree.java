package DataStruct.Trees;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.insert(6);
        root.insert(11);
        root.insert(4);
        root.insert(15);
        root.insert(9);
        root.insert(12);

        System.out.println(root.data);
        System.out.println(root.LChild.data);
        System.out.println(root.RChild.data);
        System.out.println(root.LChild.RChild.data);
        root = root.remove(9);
        if(root.LChild.RChild == null) System.out.println("Remove method working!");
        else System.out.println("remove method not working!");

        if(!root.contains(9) && root.contains(6)) System.out.println("Contains method working!");
        else System.out.println("Contains method not working!");

        if(root.findMax().data == 15) System.out.println("findMax method working!");
        else System.out.println("findMax method not working!");

        if(root.findMin().data == 4) System.out.println("findMin method working!");
        else System.out.println("findMin method not working!");

        System.out.println("------ Traversing beginning ------");
        System.out.println("In order");
        Node.printTreeInOrderTraversal(root);
        System.out.println();
        System.out.println("Pre order");
        Node.printTreePreOrderTraversal(root);
        System.out.println();
        System.out.println("Post order");
        Node.printTreePostOrderTraversal(root);
        System.out.println();
        System.out.println("------ Traversing Ended ------");

        System.out.println("The internal path length of the tree is: " + root.calculateInternalPathLength(root, 0));

        root.printPrettyTree(root, 0);
        root = root.makeEmpty();
        if(Node.isEmpty(root)) System.out.println("makeEmpty method working!\nisEmpty method working!");
        else System.out.println("makeEmpty or isEmpty not working!");

        int arr[] = {1,2,3,4,5,6,7};
        Node perfectTree = Node.buildPerfectTree(arr, 0, arr.length -1);
        Node.printPrettyTree(perfectTree, 0);

        
    }
}
