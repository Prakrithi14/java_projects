class Node{
    Node left,right;
    int data;
    Node(int item){
        left=right=null;
        data=item;
    }

}
public class BST {

     static  Node search(Node root,int key){

        if(root==null||key==root.data){
            return root;
        }
        else if(key<root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
        }
    public static void main(String args[]){
        Node root=new Node(50);
        root.left=new Node(20);
        root.right=new Node(80);
        root.left.left=new Node(10);
        root.left.right=new Node(30);
        root.right.left=new Node(60);
        root.right.right=new Node(90);
        root.left.left.left=new Node(5);
        int key=50;
        if(search(root,key)!=null){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
       
    }
    
}
