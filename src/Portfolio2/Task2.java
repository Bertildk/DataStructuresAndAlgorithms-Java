package Portfolio2;
import DataStruct.Trees.*;
public class Task2 {
    public static void main(String[] args) {
        Node node = new Node(7);
        node.LChild = new Node(4);
        node.LChild.LChild = new Node(3);
        node.LChild.LChild.LChild = new Node(2);
        node.LChild.LChild.LChild.LChild = new Node(1);
        node.RChild = new Node(28);
        node.RChild.RChild = new Node(55);

        node.RChild.RChild.RChild = new Node(60);
        node.RChild.RChild.RChild.RChild = new Node(69);
        node.RChild.RChild.RChild.LChild = new Node(58);
        node.RChild.RChild.RChild.LChild.LChild = new Node(57);

        node.RChild.RChild.LChild = new Node(51);
        node.RChild.RChild.LChild.LChild = new Node(48);
        node.RChild.RChild.LChild.LChild.LChild = new Node(40);
        node.RChild.RChild.LChild.LChild.LChild.LChild = new Node(35);

        System.out.println(getOnlyChild(node.RChild.RChild.LChild.LChild.LChild));
        System.out.println(branchCounter(node));
    }
    public static int branchCounter(Node node){
        //Branch is when, Node has a child, and that child is a leaf. 
        //The node has no siblings
        //The nodes child has no siblings

        //Iterate over the tree, Check for each node above conditions
        if(node == null) return 0;
        
        if(checkIfbranch(node)) return 1 + branchCounter(node.LChild) + branchCounter(node.RChild);
        else return 0 + branchCounter(node.LChild) + branchCounter(node.RChild);
        
    }
    static boolean checkIfbranch(Node node){
        Node firstChild = getOnlyChild(node);
        if(firstChild != null){
            Node SecondChild = getOnlyChild(firstChild);
            if(SecondChild != null){
                Node thirdChild = getOnlyChild(SecondChild);
                if(thirdChild == null) return false;
                if(thirdChild.LChild ==null && thirdChild.RChild == null){
                    return true;

                }
            }
        }
        return false;
    }
    static Node getOnlyChild(Node node){
        if(node.LChild == null && node.RChild ==null) return null;
        if(node.LChild != null && node.RChild !=null) return null;
        Node nodeReturn = (node.LChild == null) ? node.RChild : node.LChild;
        return nodeReturn;
    }
}
