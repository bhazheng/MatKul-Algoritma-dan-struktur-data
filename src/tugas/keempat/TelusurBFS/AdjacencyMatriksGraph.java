package tugas.keempat.TelusurBFS;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatriksGraph {
    private int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Queue<Integer> theQueue;

    public AdjacencyMatriksGraph(int maxVerts) // constructor
    {
        this.MAX_VERTS = maxVerts;
        vertexList = new Vertex[MAX_VERTS];
// adjacency matrix
        this.adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {// set adjacency
            for (int k = 0; k < MAX_VERTS; k++) {// matrix to 0
                adjMat[j][k] = 0;
            }
        }
        theQueue = new LinkedList();
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++)
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
                return j;
        return -1;
    }

    public void displayGraph() {
        System.out.print("  ");
        for (int i = 0; i < MAX_VERTS; i++) {
            System.out.print(vertexList[i] != null ? vertexList[i].label + " " : "- ");
        }
        System.out.println();
        for (int i = 0; i < MAX_VERTS; i++) {
            System.out.print(vertexList[i] != null ? vertexList[i].label + " " : "- ");
            for (int j = 0; j < MAX_VERTS; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void bfs() { 
        vertexList[0].wasVisited = true; 
        displayVertex(0); 
        theQueue.add(0); 
        int v2;
        while (theQueue.size() != 0) {
            int v1 = theQueue.remove();

            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) { 
                vertexList[v2].wasVisited = true; 
                displayVertex(v2); 
                theQueue.add(v2); 
            } 
        } 

        for (int j = 0; j < nVerts; j++) 
            vertexList[j].wasVisited = false;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }
}