package praktikum.linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

class Kereta{
//HARUS MENGIMPLEMENTASIKAN LinkedList !
    
    static LinkedList<String> ll2LinkedLists[]; 
    
    public Kereta(int banyakgerbong) {
        ll2LinkedLists = new LinkedList[banyakgerbong];
    }
    

    void insertPenumpang(int nomerGerbong,String nama){
    //tulis kode anda
        for (int i = 0; i < ll2LinkedLists.length; i++) {
            ll2LinkedLists[i] = new LinkedList<>();
        }
        ll2LinkedLists[nomerGerbong].add(nama);
    }
    void printDaftarPenumpang(){
    //tulis kode anda
        for (int i = 0; i < ll2LinkedLists.length; i++) {
            if (!ll2LinkedLists[i].isEmpty()) {
                System.out.println("Gerbong ke "+(i+1)+" berisi " + ll2LinkedLists[i].size()+ " orang dengan nama: ");
                for (int j = 0; j < ll2LinkedLists[i].size(); j++) {
                    System.out.print(" "+(j+1)+". "+ll2LinkedLists[i].get(j));
            }System.out.println();
            }
            
        }
    }
    
}

public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int banyak_gerbong=read.nextInt();
        read.nextLine();
        Kereta krl = new Kereta(banyak_gerbong);
        String input;
        try{
            while ((input=read.nextLine())!=null) {
                String[] splittedInput=input.split(" ");
                krl.insertPenumpang(Integer.parseInt(splittedInput[0])-1, splittedInput[1]);
            }
        }
        catch(Exception e){}
        krl.printDaftarPenumpang();
        read.close();
    }
}