package praktikum.stack;

import java.util.*;

public class Solution {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] angka = inp.split(" ");
        try {
            for (int index = 0; index < angka.length; index++) {
                int a = 0;
                int b = 0;
                if (angka[index].equals("/")){
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a/b);
                } else if (angka[index].equals("*")){
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a*b);
                } else if(angka[index].equals("+")) {
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a+b);
                } else if(angka[index].equals("-")){
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a-b);
                } else if(angka[index].equals("^")){
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a^b);
                }else {
                    stack.push(Integer.parseInt(angka[index]));
                }
            }
            System.out.println(stack.peek());
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        

    }
}
