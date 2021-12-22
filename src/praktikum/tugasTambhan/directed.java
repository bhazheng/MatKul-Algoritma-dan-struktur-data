package praktikum.tugasTambhan;

import java.util.*;
/* Nama : Akbar Lucky Basuki
   Nim : 205150400111043

   Directed graph menggunakan array menjadi matrix
   */

class Graph {
    boolean adjMat[][]; // membuat matrix untuk menyimpan edge
    int vertex;

    // membuat constructor untuk class Graph
    Graph(int vertex){
        // menentukan ukuran array dari jumlah vertex yang di inginkan
        adjMat = new boolean[vertex][vertex];
        this.vertex = vertex; //memasukkan nilai vertex
    }

    void addEdge(int source, int destination){
        // mengecek apakah sudah terisi atau tidak
        if (!adjMat[source][destination]) {
            adjMat[source][destination] = true;
        }
        

    }
    // menampilkan transversal secara bfs
    void bfs(int source){
        boolean visited[] = new boolean[vertex]; //membuat array bolean untuk menandai vertex mana saja yang sudah dikunjungi
        Queue<Integer> q = new LinkedList<>(); //menaruh nilai vertex sementara
        q.add(source); // menaruh nilai vertex awal
        visited[source] = true; // vertex awal di set menjadi true karena sudah dikunjungi

        while(!q.isEmpty()){ //menggunakan loop while, jika Queue tidak kosong maka akan dijalankan
            int tmp = q.poll(); //data temporary diambil dari Queue
            System.out.print(tmp + "->"); //print data
            for(int i = 0; i < vertex; i++){
                if(adjMat[tmp][i]){ //dijalankan jika nilai nya ture
                    if(!visited[i]){ //jika belum dikunjungi maka nilai vertex akan dimasukkan ke Queue
                        q.add(i);
                        visited[i] = true; // lalu nilai nya di set menjadi true
                    }
                }
            }
        }
    }
    // menampilkan tranversal dfs
    void dfs(int source){
        boolean visited[] = new boolean[vertex];//membuat array bolean untuk menandai vertex mana saja yang sudah dikunjungi
        Stack<Integer> q = new Stack<>(); //menaruh nilai vertex sementara menggunakan stack
        q.add(source); // menaruh nilai vertex awal
        while(!q.isEmpty()){ //menggunakan loop while, jika stack tidak kosong maka akan dijalankan
            int tmp = q.pop(); //mengambil data terbaru lalu ditaruh di temporary
            if(!visited[tmp]){ //jika belum dikunjungi maka akan dijalankan
                System.out.print(tmp + "->"); //print data
                visited[tmp] = true; //set telah dikunjungi
                for(int i = vertex-1; i >= 0; i--){
                    if(adjMat[tmp][i]){ //jika vertex memiliki hubungan maka akan ditambahkan ke stack
                        q.add(i);
                    }
                }
            }
            
        }
    }
}
public class directed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah edge = ");
        int edge = in.nextInt();
        System.out.print("Jumlah vertex = ");
        int vertex = in.nextInt();
        Graph g = new Graph(vertex); //memasukkan jumlah vertex
        for (int i = 0; i < edge; i++) { //memasukkan edge
            g.addEdge(in.nextInt(),in.nextInt());

        }
        System.out.print("masukkan vertex awal = ");
        int vertexAwal = in.nextInt();
        System.out.print("DFS = ");
        g.dfs(vertexAwal);
        System.out.print("\nBFS = ");
        g.bfs(vertexAwal);
    }
}
