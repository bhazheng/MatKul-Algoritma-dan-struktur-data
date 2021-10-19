package praktikum.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Pengunjung implements Comparable<Pengunjung>{
    
    int pesanan;
    String nama;
    Pengunjung(String nama,int pesanan){
        this.pesanan = pesanan;
        this.nama = nama;
    }
    @Override
    public int compareTo(Pengunjung o) {
        if (this.pesanan > o.pesanan) {
            return -1;
        } else if(this.pesanan < o.pesanan){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        // do your magic here !
        return this.nama+" dengan pesanan "+this.pesanan;
    }
}

public class Solution1 {
    

    public static void main(String[] args) {
        Queue<Pengunjung> qq = new PriorityQueue<>();
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();scan.nextLine();
        for (int j = 0; j < i; j++) {
            qq.add(new Pengunjung(scan.next(),scan.nextInt()));
            
        }
        for (int j = 0; j < i; j++) {
            System.out.println(qq.poll());
        }
        
    }
}