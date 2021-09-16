package tugas.kedua;
import java.util.*;

/*copyright Akbar Lucky Basuki 205150400111043 */

public class asdd_205150400111043 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String data;
        System.out.println("program untuk menambahkan data ke dalam linked list, data merupakan inputan dari keyboard.\n"+
                            "Untuk stop tekan enter kosong saat input");
        while ((data = scan.nextLine()) != "") {
            if (!ll.contains(data)) {
                ll.add(data);
                System.out.print("Isi linkedlist = "+ll+"\n");
            } else {
                System.out.println("data yang anda masukkan sudah ada dalam linkedlist.");
            }
        }
        System.out.println("Isi Linkedlist final");
        System.out.println(ll);
        
    }
}