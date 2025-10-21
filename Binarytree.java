class Node{
    int item;
    Node left,right;
    Node(int key){
        item=key;
        left=right=null;
    }
}
public class Binarytree{
    Node root;
    Binarytree(){
        root=null;
    }
    void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item+ "->");
    }
    void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
          System.out.print(node.item+"->");
        inorder(node.right);

    }
    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.item+"->");
        preorder(node.left);
        preorder(node.right);
    }
    int countleafnodes(Node node){
        if(node==null)
            return 0;
        else if(node.left==null && node.right==null){
            return 1;
        }
        else{
            return countleafnodes(node.left)+countleafnodes(node.right);
        }

    }


    public static void main(String args[]){
        Binarytree tree=new Binarytree();
        tree.root=new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(5);
        tree.root.left.right=new Node(6);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\npre order traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);

        System.out.println("\nNumber of leaf nodes:");
        int leaf=tree.countleafnodes(tree.root);
        System.out.println(leaf);

    }

}