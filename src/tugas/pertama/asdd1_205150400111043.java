package tugas.pertama;
import java.util.*;
public class asdd1_205150400111043 {
    public static void main(String[] args) {
        LinkedList<Integer> aa = new LinkedList<Integer>();
        Scanner bb = new Scanner(System.in);
        System.out.println("Menjumlahkan seluruh data dalam linkedlist");
        System.out.print("Masukkan jumlah node yang diinginkan = ");
        int banyak = bb.nextInt();
        int jumlah = 0;
        for (int i = 0; i < banyak; i++) {
            System.out.print("Masukkan angka = ");
            aa.add(bb.nextInt());
            jumlah+=aa.get(i);
        }
        System.out.println("Hasil penjumlahan = "+jumlah);
        bb.close();
    }
}
