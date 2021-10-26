package praktikum.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node12{
    int angka;
    Node12 left, right;
    Node12(int angka){
        this.angka = angka;
    }
    
}
class CBTree3{
    Node12 root;

    boolean isEmpty(){
        return root==null;
    }

    void insert(int angka){
        Node12 newNode=new Node12(angka);
        if (isEmpty()){
            root=newNode;
        }
        else {
            Queue<Node12> q=new LinkedList<Node12>();
            q.add(root);
            while(!q.isEmpty()){
                Node12 tmp = q.poll();
                if (tmp.left==null){
                    tmp.left=newNode;
                    break;
                }
                else {
                    q.add(tmp.left);
                }
                if (tmp.right==null){
                    tmp.right=newNode;
                    break;
                }
                else {
                    q.add(tmp.right);
                }
            }
        }
    }
    void LevelOrder(){
        if (isEmpty()){
            
        }
        else {
            
            Queue<Node12> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                Node12 tmp = q.poll();
                System.out.print(tmp.angka + "->");
                if (tmp.left != null){
                    q.add(tmp.left);
                }
                if (tmp.right != null){
                    q.add(tmp.right);
                }
            }
            System.out.println();
        }
    }
    void x(Node12 root2){
        if(root2==null){
            return;
        }
        x(root2.left);
        x(root2.right);
        System.out.print(root2.angka+"->");
    }
}

public class nomer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        CBTree3 t = new CBTree3();
        for (int i = 0; i < index; i++) {
            t.insert(in.nextInt());
        }
        t.LevelOrder();
        t.x(t.root);
        System.out.println();
    }
}