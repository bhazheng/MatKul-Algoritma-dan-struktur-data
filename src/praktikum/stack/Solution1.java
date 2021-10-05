package praktikum.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {
    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] splt = inp.split(" ");
        String n = "";
        String m = "";
        for (String string : splt) {
            stack.push(string);
        }
        System.out.println(stack.size());
        for (int i = stack.size(); i >= 0; i--) {
            if (i == 0) {
                n = stack.peek();
            } else if(i == stack.size()) {
                m = stack.peek();
            } else {
                stack.pop();
            }
        }
        System.out.println(n);
        System.out.println(m);
        
        
    }
}
