import java.io.*;
import java.util.*;

public class oretan {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int asd = 3;
        
        int mulai = 0;
        int jumlah = 0;
        for (int i = 0; i < asd; i++) {
            
            if (i==0) {
                jumlah=1;
            } else {
                mulai = (int) Math.pow(2, i);
                jumlah+=mulai;
            }
            
        }
        System.out.println(mulai);
        System.out.println();
        System.out.println(jumlah);
    }
}