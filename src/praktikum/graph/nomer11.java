package praktikum.graph;
import java.util.*;

class Graph {
    boolean adjMat[][];
    int edge;
    Graph(int edge){
        adjMat = new boolean[edge][edge];
        this.edge = edge;
    }

    void addEdge(int source, int destination){
        adjMat[source][destination] = true;
        
        
    }
    void print(){
        
        for (int i = 0; i < edge; i++) {
            boolean x = false;
            String xx = i + " connected with :";
            for (int j = 0; j < edge; j++) {
                if (adjMat[i][j] == true) {
                    x = true;
                    xx +=  " "+ j ;
                }
                
            }if(x)System.out.println(xx);
        }
    }
}
public class nomer11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        Graph g = new Graph(10);
        for (int i = 0; i < index; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a<=10 && b<=10) {
                g.addEdge(a,b);
            }
            
        }
        g.print();
    }
}
