package praktikum.BST;



import java.util.ArrayList;
import java.util.Scanner;

class Node{
    Node left, right;
    int data;
    String nama;
    Node(String nama, int data){
        this.data = data;
        this.nama = nama;
    }
}
class BST{
    Node root;

    boolean isEmpty(){
        return root == null;
    }
    void insert(String nama,int data){
        Node newNode = new Node(nama, data);
        if (isEmpty() == true) {
            root = newNode;
        }else {
            Node tmp = root;
            while (true) {
                if (data < tmp.data){
                    if (tmp.left == null){
                        tmp.left = newNode;
                        break;
                    }

                    tmp = tmp.left;
                    continue;
                }

                else if (data > tmp.data){
                    if (tmp.right == null){
                        tmp.right = newNode;
                        break;
                    }

                    tmp = tmp.right;
                    continue;
                }
            }
        }
    }
    private void inorderUtil(Node tmp){
        if (tmp == null) return;
        inorderUtil(tmp.left);
        System.out.print(tmp.nama +" bergaji "+tmp.data +" dollar\n");
        inorderUtil(tmp.right);
    }
    private void preorderUtil(Node tmp){
        if (tmp == null) return;
        System.out.print(tmp.nama +" bergaji "+tmp.data +" dollar\n");
        preorderUtil(tmp.left);
        preorderUtil(tmp.right);
    }
    private void postorderUtil(Node tmp){
        if (tmp == null) return;
        postorderUtil(tmp.left);
        postorderUtil(tmp.right);
        System.out.print(tmp.nama +" bergaji "+tmp.data +" dollar\n");
    }

    void inorder(){
        System.out.print("inorder = ");
        System.out.println();
        inorderUtil(this.root);
        System.out.println();
    }
    void postorder(){
        System.out.print("postorder = ");
        System.out.println();
        postorderUtil(this.root);
        System.out.println();
    }
    void preorder(){
        System.out.print("preorder = ");
        System.out.println();
        preorderUtil(this.root);
        System.out.println();
    }
}

public class nomer2 {
    public static void main(String[] args) {
        BST t = new BST();
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        String[] nama = new String[index];
        int[] nama1 = new int[index];
        for (int i = 0; i < index; i++) {
            t.insert(in.next(),in.nextInt());
        }
        
        
        //end your magic here
        t.inorder();
        t.postorder();
        t.preorder();
    }
}
