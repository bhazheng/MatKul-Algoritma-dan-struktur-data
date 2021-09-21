package praktikum.linkedlist.remove;

import java.util.LinkedList;
import java.util.Scanner;

public class remove {
    static LinkedList<String> ll = new LinkedList<>();
    static void print(){
        System.out.println("List :");
        for (String string : ll) {
            System.out.print(string+ " -> ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int index = inp.nextInt();
        inp.nextLine();
        if (index > 0) {
            for (int i = 0; i < index; i++) {
                ll.add(inp.nextLine());
                print();
            }
            ll.removeFirst();
            if (index > 1) {
                ll.removeLast();
                if(index > 2){
                    ll.remove((index/2)-1);
                }
            }
            
        }print();
        
        
    }
}