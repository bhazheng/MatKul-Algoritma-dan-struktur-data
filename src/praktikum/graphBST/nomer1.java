package praktikum.graphBST;
import java.util.*;

class Graph {
    boolean adjList[][];
    int vertex;
    Graph(int vertex){
        adjList = new boolean[vertex][vertex];
        this.vertex = vertex;
    }

    void addEdge(int source, int destination){
            adjList[source][destination] = true;
            adjList[destination][source] = true;
        
    }

    void bfs(int source){
        boolean visited[] = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int tmp = q.poll();
            System.out.print(tmp + "->");
            for(int i = 0; i < vertex; i++){
                if(adjList[tmp][i]){
                    if(!visited[i]){
                        q.add(i);
                        visited[i] = true;
                    }
                }
            }
        }
    }
    void dfs(int source){
        boolean visited[] = new boolean[vertex];
        Stack<Integer> q = new Stack<>();
        q.add(source);
        while(!q.isEmpty()){
            int tmp = q.pop();
            if(!visited[tmp]){
                System.out.print(tmp + "->");
                visited[tmp] = true;
                for(int i = vertex-1; i <= 0; i--){
                    if(adjList[tmp][i]){
                        q.add(i);
                    }
                }
            }
            
        }
    }
}
public class nomer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edge = in.nextInt();
        int vertex = in.nextInt();
        Graph g = new Graph(vertex);
        for (int i = 0; i < edge; i++) {
            g.addEdge(in.nextInt(),in.nextInt());
                
            
        }
        int b = in.nextInt();
        g.dfs(b);
        System.out.println();
        g.bfs(b);
    }
}