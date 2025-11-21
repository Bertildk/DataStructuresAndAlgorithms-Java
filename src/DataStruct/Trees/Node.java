package DataStruct.Trees;

public class Node {
    int data;
    Node RChild;
    Node LChild;
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
        return false;
    }
    Node findMin(){
        if(this.LChild != null){
            return this.LChild.findMin();
        }else{
            return this;
        }
    }
    int findMax(){
        return -1;
    }
    boolean isEmpty(){
        return false;
    }
    void makeEmpty(){

    }
    void printTree(Node Node){
        while (Node != null) {
            System.out.println(Node.LChild);
            Node = Node.LChild;
        }
    }
    
}
