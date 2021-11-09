package praktikum.BST2;

import java.util.ArrayList;
import java.util.Scanner;

class Node1 {
    Node1 left, right;
    int data;
    Node1(int data){
        this.data = data;
    }
}
class BST1{
    Node1 root;
    boolean isEmpty(){
        return root == null;
    }
    public void insert(int data) {
        root = insert(root, data);
    }

    private Node1 insert(Node1 current, int data) {
        if (current == null) {
            return new Node1(data);
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
    
    int mystery(int newData){
        int sum = 0;
        Node1 tmp = root;
        while(true){

            if (tmp.data == newData){
                sum += newData;
                if(tmp.left != null) {
                    sum += tmp.left.data;
                } 
                if(tmp.right != null) {
                    sum += tmp.right.data;
                }
                break;
            }

            if (tmp.data < newData){
                if(tmp.right == null){
                    break;
                }
                tmp = tmp.right;
                continue;
            }

            if (tmp.data > newData){
                if(tmp.left == null){
                    break;
                }
                tmp = tmp.left;
                continue;
            }
        }
        return sum;
    }
    
        
}
    

public class nomer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BST1 t = new BST1();
        String a = in.nextLine();
        String[] split = a.split(" ");

        for (int i = 0; i < split.length; i++) {
            t.insert(Integer.parseInt(split[i]));
        }
        System.out.println(t.mystery(in.nextInt()));
        
        
    }
}