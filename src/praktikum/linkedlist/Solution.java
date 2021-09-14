package praktikum.linkedlist;


import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    static LinkedList<String> ll = new LinkedList<>();
    static void cetak(){
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " -> ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
    //Tulis Kode anda
        Scanner inp = new Scanner(System.in);
        String masuk = " ";
        try {
            while ((masuk = inp.nextLine()) != null) {
            
                String[] iden = masuk.split(" ");
                if (iden[0].equals("masukAwal")) {
                    ll.addFirst(iden[1]);
                } else if (iden[0].equals("masukAkhir")){
                    ll.addLast(iden[1]);
                } else if(iden[0].equals("masuk")) {
                    if (Integer.parseInt(iden[1]) <= ll.size()) {
                        ll.add(Integer.parseInt(iden[1]), iden[2]);
                    } else {
                        System.out.println("ERROR ! hanya terdapat "+ll.size()+" Gerbong !");
                    }
                } else if(iden[0].equals("print")){
                    cetak();
                }
                
            }
        } catch (Exception e) {}
        inp.close();
        
    }
}