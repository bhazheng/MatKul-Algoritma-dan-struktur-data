package praktikum.UAP;



//Nama : Akbar Lucky Basuki
//NIM  : 205150400111043
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class nomer2 {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {
          //HINT: gunakanlah Stack untuk menyelesaikan studi kasus ini
        Scanner input = new Scanner(System.in);
        
        int a = 0;
        String s = input.next();
        boolean balance = true;//Boolean untuk mengecek apakah jumlah kurungnya seimbang atau tidak
        if(s.length()%2!=0) balance = false;
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b == '{' || b == '(' || b == '[') {
                stack.push(b);
            } 
            char test;
            if(!stack.isEmpty()){
                switch (b) {
                
                case ')':
                    test = stack.peek();
                    if (stack.contains('(')){
                        a++;
                        stack.remove(stack.indexOf('('));
                    } else {
                        
                        balance = false;
                    }
                    break;

                case '}':
                    test = stack.peek();
                    if (stack.contains('{')){
                        a++;
                        stack.remove(stack.indexOf('{'));
                    } else {
                        
                        balance = false;
                    }
                    break;

                case ']':
                    test = stack.peek();
                    if (stack.contains('[')){
                        a++;
                        stack.remove(stack.indexOf('['));
                    } else {
                        
                        balance = false;
                    }
                    break;
                }
            
                
            }
                
            
            /*Lakukan pengecekan terhadap satu per satu karakter dari string.
            Jika karakternya merupakan kurung buka, tambah ke stack.
            Jika karakternya kurung tutup, lakukan pengecekan dengan karakter paling atas di stack.
            
            Jika karakternya sejenis dengan karakter paling atas, keluarkan karakter tersebut dari stack.
            Jika karakternya tidak sejenis, maka sudah pasti tidak seimbang.
            */
        }
          //Pastikan balance tetap true dan semua isi stack telah habis untuk mencetak Seimbang
        if(!stack.isEmpty()) balance = false;
        if (balance == true) {
            System.out.println("Seimbang "+a);
        } else{
            System.out.println("Tidak Seimbang "+a);
        }
        
          
    }
}
