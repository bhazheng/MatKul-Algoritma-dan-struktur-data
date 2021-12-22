import java.util.*;
public class oretan {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String word[] = in .nextLine().split("");
    Stack < String > stack = new Stack < > ();
    int size = word.length;
    int point = 0;
    for (String i: word) {
      switch (i) {
      case "(": {
        stack.push("(");
      };
      break;
      case "{": {
        stack.push("{");
      };
      break;
      case "[": {
        stack.push("[");
      };
      break;
      case "}": {
        if (stack.contains("{")) {
          stack.remove("{");
          point++;
        }
        else {
            stack.push("}");
        };
      }
      break;
      case "]": {
        if (stack.contains("[")) {
          stack.remove("[");
          point++;
        }
        else {
            stack.push("]");
        };
      }
      break;
      case ")": {
        if (stack.contains("(")) {
          stack.remove("(");
          point++;
        }
        else {
            stack.push(")");
        }
        ;
      }
      break;
      }
    }
    if (size % 2 == 1) {
      System.out.println("Tidak Seimbang " + stack.size());
    } else if (point == size / 2) System.out.println("Seimbang " + point);
    else {
      System.out.println("Tidak Seimbang " + stack.size());
    }
  }
}