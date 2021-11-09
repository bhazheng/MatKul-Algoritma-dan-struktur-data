package praktikum.BST2;





import java.util.Scanner;

class Node {
    Node left, right;
    int data;
    Node(int data){
        this.data = data;
    }
}
class BST{
    Node root;
    boolean isEmpty(){
        return root == null;
    }
    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insert(current.left, data);
        } else if (data > current.data) {
            current.right = insert(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    int kedalaman(Node node) {
        if (node == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = kedalaman(node.left);
            int rDepth = kedalaman(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    

    void urut(Node tmp){
        if (tmp == null) return;
        urut(tmp.left);
        System.out.print(tmp.data + ", ");
        urut(tmp.right);
    }
    void inorder(){
        urut(this.root);
        System.out.println();
    }
    
    
}
public class nomer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BST t = new BST();
        String str = in.nextLine();
        String[] split = str.split(" ");
        
        for (int index = 0; index < split.length; index++) {
            t.insert(Integer.parseInt(split[index]));
        }
        t.inorder();
        System.out.println(t.kedalaman(t.root.left));
        System.out.println(t.kedalaman(t.root.right));
        
    }
}