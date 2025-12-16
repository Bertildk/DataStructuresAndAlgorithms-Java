package Portfolio2;
import DataStruct.Trees.*;

public class Task3 {
    public static void main(String[] args) {
        Node node = new Node(11);
        node.LChild = new Node(2);
        node.LChild.LChild = new Node(1);
        node.LChild.RChild = new Node(9);
        node.LChild.RChild.LChild = new Node(3);
        
        node.RChild = new Node(13);
        node.RChild.RChild = new Node(57);
        node.RChild.RChild.LChild = new Node(25);
        node.RChild.RChild.LChild.LChild = new Node(17);
        
        node.RChild.RChild.RChild = new Node(90);

        Node.printTreeInOrderTraversal(node);
        System.out.println();
        // IN ORDER = 1 2 3 9 11 13 17 25 57 90 
        // Level order = 11 2 13 1 9 57 3 25 90 17
        System.out.println("Internal Path length: " + Node.calculateInternalPathLength(node, 0));

        /* Hvordan kan man omarrangere noderne i det højre subtræ, så hele træet bliver et AVL-træ
        

        Flyt 17 med 13
        Placer 13 til venstre for 17. 
        
        */

        /*Kunne træet have været et AVL-træ før den seneste operation (insert eller delete, men ikke rotation)? 
        Eksempler på seneste operation kunne være indsættelse af node 3 eller sletning af node 12 (venstre barn af node 13). Begrund dit svar.
        
        Ikke sikker.

        */

    }

}
