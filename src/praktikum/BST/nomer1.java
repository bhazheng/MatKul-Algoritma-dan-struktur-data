package praktikum.BST;



import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

class Node{
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
    void insert(int data){
        Node newNode = new Node(data);
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
        System.out.print(String.valueOf(Character.toChars(tmp.data)) + ", ");
        inorderUtil(tmp.right);
    }
    private void preorderUtil(Node tmp){
        if (tmp == null) return;
        System.out.print(String.valueOf(Character.toChars(tmp.data)) + ", ");
        preorderUtil(tmp.left);
        preorderUtil(tmp.right);
    }
    private void postorderUtil(Node tmp){
        if (tmp == null) return;
        postorderUtil(tmp.left);
        postorderUtil(tmp.right);
        System.out.print(String.valueOf(Character.toChars(tmp.data)) + ", ");
    }

    void inorder(){
        System.out.print("inorder = ");
        inorderUtil(this.root);
        System.out.println();
    }
    void postorder(){
        System.out.print("postorder = ");
        postorderUtil(this.root);
        System.out.println();
    }
    void preorder(){
        System.out.print("preorder = ");
        preorderUtil(this.root);
        System.out.println();
    }
}

public class nomer1 {
    public static void main(String[] args) {
        BST t = new BST();
        ArrayList<Integer> mm = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int asciA = 'a';
        int asciB = 'z';
        
        for (int i = 0; i < input.length(); i++) {
            String ppp = String.valueOf(input.charAt(i));
            int huruf = input.charAt(i);
            if (mm.contains(huruf)) {
                continue;
            }
            mm.add(huruf);
            if (huruf>=asciA && huruf<= asciB || huruf>=48 && huruf<=57) {
                t.insert(huruf);
            }
        }
        //end your magic here
        t.inorder();
        t.postorder();
        t.preorder();
    }
}
