import java.util.Scanner;

public class oretan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        b+=1;
        int i = 0;
        String s="";
        while (i < b) {
            s += scan.next();
            i++;
        }
        
        System.out.println(s);
        scan.close();
    }
}
