package DataStruct.Trees;

public class Node {
    int data;
    public Node RChild;
    public Node LChild;
    public Node(int data){
        this.data = data;
        this.RChild = null;
        this.LChild = null;
    }

    Node remove(int val){
        //Locating the correct Node
        if(val > this.data && this.RChild != null){
            this.RChild =  this.RChild.remove(val);
        }else if(val < this.data && this.LChild != null){
            this.LChild =  this.LChild.remove(val);
        }else{ //Found the node, now check cases for children of node getting deleted.  
            //case 1, Node has no children.
            if(this.RChild == null && this.LChild ==null){
                return null;
            }
            //case 2 Node has 1 child
            if(LChild ==null){
                return this.RChild;
            }
            if(RChild == null){
                return this.LChild;
            }
            //Case 3 Node has 2 children
            Node successor = this.RChild.findMin(); //Find the smallest value of the right subtree
            this.data = successor.data; // Stores that value into the current note we are deleting
            this.RChild = this.RChild.remove(successor.data); // Call to remove the duplicate value we have stored
            //the duplicate value is removed becuase it is located, immidietly, becuase of the call to the RChild. 
            //It has no children and is set to null

        }
            return this;      
    }
    Node insert(int val){
        if(val > this.data){
            if(this.RChild == null){
                this.RChild = new Node(val);
            }   
            else
            {
                this.RChild.insert(val);
            }
        }
        else if (val < this.data){
            if(this.LChild == null) {
                this.LChild = new Node(val);
            }
            else
            {
                this.LChild.insert(val);
            }
        }
    
        return this;
    }
    boolean contains(int val){
        //checking if a node has the data value of param
        if(this.data == val) return true;
        if(val > this.data && this.RChild != null){
            return RChild.contains(val);
        }else if(val < this.data && this.LChild != null){
            return LChild.contains(val);
        }
        
        return false;
    }
    Node findMin(){
        if(this.LChild != null){
            return this.LChild.findMin();
        }
        return this;
        
    }
    Node findMax(){
        if(this.RChild != null){
            return this.RChild.findMax();
        }
        return this;
        
    }

    public static boolean isEmpty(Node root){
        if(root == null){
            return true;
        }
        return false;
    }

    Node makeEmpty(){
        if(this.LChild != null){//Remove from Left Side first
            this.LChild = this.LChild.makeEmpty();
        }
        if(this.RChild != null){ //Remove from right side
            this.RChild = this.RChild.makeEmpty();
        }
    
        //if both children are null, remove node
        return null;
    }
    static void printTreeInOrderTraversal(Node node){
        if(node == null) return;
        printTreeInOrderTraversal(node.LChild);
        System.out.print(node.data + " ");
        printTreeInOrderTraversal(node.RChild);
    }
    static void printTreePreOrderTraversal(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        printTreePreOrderTraversal(node.LChild);
        printTreePreOrderTraversal(node.RChild);
    }
    static void printTreePostOrderTraversal(Node node){
       if(node == null) return;
       printTreePostOrderTraversal(node.LChild);
       printTreePostOrderTraversal(node.RChild);
       System.out.print(node.data +" ");
    }
    int calculateInternalPathLength(Node node, int depth){ // Sum of depth of all internal nodes
        if(node == null) return 0;
        if(node.LChild == null && node.RChild == null) return 0;
        return depth + calculateInternalPathLength(node.LChild, depth + 1) + calculateInternalPathLength(node.RChild, depth + 1);
    }

    private static final String INDENT = "    ";
    static void printPrettyTree(Node node, int depth){
        if(node == null) return;
        printPrettyTree(node.RChild, depth+1);
        System.out.println(INDENT.repeat(depth) + node.data);
        printPrettyTree(node.LChild, depth+1);
    }
    static Node buildPerfectTree(int[] arr, int start, int end){ //Assumes array is sorted, for it to become a Perfect BST, otherwise it would just be perfect. 
        if(start > end) return null;

        int midIndex = start + (end - start) / 2;
        Node node = new Node(arr[midIndex]);

        node.LChild = buildPerfectTree(arr, start, midIndex-1);
        node.RChild = buildPerfectTree(arr, midIndex+1, end);
        
        return node;
    }
    

}
