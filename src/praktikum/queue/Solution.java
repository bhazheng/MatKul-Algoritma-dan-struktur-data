package praktikum.queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> qq = new LinkedList<>();
        Queue<String> qq1 = new LinkedList<>();
        int angka = 0;
        for (int i = 0; i < 13; i++) {
            qq.add(scan.next());
        }
        angka = scan.nextInt();
        for (int i = 0; i <angka; i++) {
            qq1.add(qq.poll());
        }
        System.out.println(qq1);
        System.out.println(qq);
    }
}