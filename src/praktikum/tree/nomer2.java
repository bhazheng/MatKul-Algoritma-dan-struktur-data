package praktikum.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1{
    int angka;
    Node1 left, right;
    Node1(int angka){
        this.angka = angka;
    }
    
}
class CBTree{
    Node1 root;

    boolean isEmpty(){
        return root==null;
    }

    void insert(int angka){
        Node1 newNode=new Node1(angka);
        if (isEmpty()){
            root=newNode;
        }
        else {
            Queue<Node1> q=new LinkedList<Node1>();
            q.add(root);
            while(!q.isEmpty()){
                Node1 tmp = q.poll();
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
            
            Queue<Node1> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                Node1 tmp = q.poll();
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
    void x(Node1 xn){
        if(xn==null){
            return;
        }
        
        x(xn.left);
        System.out.print(xn.angka+"->");
        x(xn.right);
        
        
    }
    void printAtLevel(Node1 node,int level){
        if (node == null) return;
        if (level == 1)
            System.out.print(node.angka + "->");
        else if (level > 1){
            printAtLevel(node.left, level - 1);
            printAtLevel(node.right, level - 1);
        }
    }
    void xm(Node1 xn){
        if(xn==null){
            return;
        }
        System.out.print(xn.angka+"->");
        xm(xn.left);
        xm(xn.right);
    }
}

public class nomer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        CBTree t = new CBTree();
        for (int i = 0; i < index; i++) {
            t.insert(in.nextInt());
        }
        t.LevelOrder();
        t.printAtLevel(t.root,in.nextInt());
        System.out.println();
        t.x(t.root);
        System.out.println();
        t.xm(t.root);
        System.out.println();
    }
}