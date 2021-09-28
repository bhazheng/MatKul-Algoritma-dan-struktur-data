package tugas.ketiga;

import java.util.Scanner;
import java.util.Stack;

class asdd_205150400111043 {
    static Stack<Character> stack = new Stack<>();
    static int tingkatan(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static void Operator(String x) {
        String postfix = "";
        for (int i = 0; i<x.length(); ++i) {
            char c = x.charAt(i);
            if (c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
                while (!stack.isEmpty() && tingkatan(c) <= tingkatan(stack.peek())){
                    postfix += stack.pop();
                }stack.push(c);

            }else if (c == '('){
                stack.push(c);
            }else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix += stack.pop();
                stack.pop();
            } else {
                postfix += c;
            }
        }

        while (!stack.isEmpty()){
            postfix += stack.pop();
        }
        System.out.printf("%-20s = %s","Hasil Postfix",postfix);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-20s = ","Masukkan Infix");
        String infix = in.next();
        Operator(infix);
    }
}