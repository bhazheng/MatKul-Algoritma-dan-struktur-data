package praktikum.linkedlist.addRemove;
import java.util.*;
public class Solutin1 {
    static LinkedList<String> ll = new LinkedList<>();
    static void operation(String x){
        String[] iden = x.split(" ");
        if (iden[0].equals("ngomong")) {
            ll.addLast(iden[1]);
            System.out.println(ll);
        } else if(iden[0].equals("larang")){
            ll.removeIf(n -> (n.contains(iden[1])));
        } else if(iden[0].equals("tambah")){
            try {
                ll.add(Integer.parseInt(iden[1]), iden[2]);
                System.out.println(ll);
            } catch (Exception e) {
                System.out.println("ERROR !");
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        scan.nextLine();
        if (index>0) {
            for (int i = 0; i < index; i++) {
                operation(scan.nextLine());
            }
        } else {
            System.out.println("ERROR !");
        }
        
        System.out.println(ll);
    }
}
