package praktikum.linkedlist.addRemove;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    static LinkedList<Integer> ll = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        for (int i = 0; i < index; i++) {
            ll.add(scan.nextInt());
        }
        scan.nextLine();
        String jenisCelengan = scan.nextLine();
        if (jenisCelengan.equals("ganjil")) {
            ll.removeIf(n -> (n%2 != 0));
        } else if(jenisCelengan.equals("genap")){
            ll.removeIf(n -> (n%2==0));
        }
        System.out.println(jenisCelengan);
          //tulis kode anda selesai
        System.out.println(ll);
    }
}