class Graph{
    int v;
    int graph[][];
    Graph(){}
    Graph(int v){
        this.v = v;
        this.graph = new int[v][v];
    }
    void addEdge(int i, int j, int w){
        graph[i][j] = w;
        graph[j][i] = w;
    }
    void removeEdge(int i, int j){
        graph[i][j] = 0;
        graph[j][i] = 0;
    }
    void dispaly(){
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println("");
        }
    }
    void printNeighbour(int i){
        System.out.print(i + " -> ");
        for(int j=0; j<v; j++){
            if(graph[i][j] != 0 ){
                System.out.print(j + " ");
            }
        }
        System.out.println("");
    }
    void addVertex(){
        int[][] arr = new int[v+1][v+1];
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                arr[i][j] = graph[i][j];
            }
        }
        v+=1;
        this.graph = arr;
    }
    void removeVertex(){
        int[][] arr= new int[v-1][v-1];
        for(int i=0; i<v-1; i++){
            for(int j=0; j<v-1; j++){
                arr[i][j] = graph[i][j];
            }
        }
        v--;
        this.graph = arr;
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(4);
        g1.addEdge(1, 2, 10);
        g1.addEdge(3, 2, 20);
        g1.addEdge(0, 2, 30);
        g1.dispaly();
        g1.printNeighbour(1);
        g1.addVertex();
        g1.addEdge(2, 4, 50);
        g1.dispaly();
        g1.removeVertex();
        g1.dispaly();
    }
}