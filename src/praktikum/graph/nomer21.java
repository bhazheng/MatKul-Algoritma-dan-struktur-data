package praktikum.graph;

import java.util.*;


class Graph{
    LinkedList<Integer> adjList[];
    int vertex;

    Graph(int vertex){
        this.vertex = vertex;
        adjList=new LinkedList[vertex];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i]=new LinkedList<Integer>();
        }
    }

    void printConn(){
        
        for (int i = 0; i < adjList.length; i++) {
            if (adjList[i].size() != 0) {
                System.out.println(i + " Connected to ");
                for (int j = 0; j < adjList[i].size(); j++) {
                    System.out.print(" - " + adjList[i].get(j) + "\n");
                }
            }
            
        }
    }
    void addVertex(int source,int destination){
        if(!adjList[source].contains(destination)) {
            adjList[source].add(destination);
        }
        if(!adjList[destination].contains(source)) {
            adjList[destination].add(source);
        }
        
    }

}

public class nomer21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        Graph g = new Graph(index);
        for (int i = 0; i < index; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            g.addVertex(a,b);
            
        }
        g.printConn();
    }
}