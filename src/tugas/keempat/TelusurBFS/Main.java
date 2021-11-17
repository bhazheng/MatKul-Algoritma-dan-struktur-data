package tugas.keempat.TelusurBFS;

public class Main {
    public static void main(String[] args) {
        AdjacencyMatriksGraph graph = new AdjacencyMatriksGraph(5);
        graph.addVertex('1');//0
        graph.addVertex('2');//1
        graph.addVertex('3');//2
        graph.addVertex('4');//3
        graph.addVertex('5');//4

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 4);
        graph.addEdge(2, 4);

        graph.displayGraph();

        System.out.print("BFS : ");
        graph.bfs();
    }
}

