import java.util.*;

class Graph2{
    int v;
    int graph[][];

    Graph2(){

    }
    Graph2(int v){
        this.v=v;
        this.graph=new int[v][v];
    }

    void addEdge(int v1, int v2, int weight){//take weight for weighted graph


        graph[v1][v2] = weight;
        // graph[v2][v1] = weight;       //remove line for directed graph
    }
    void deleteEdge(int v1, int v2){
        graph[v1][v2] = 0;
        graph[v2][v1] = 0;
    }

    void display(){
        for(int i=0 ; i<v ; i++){
            for(int j=0 ; j<v ;j++){
                System.out.print(graph[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    void displayNeigh(int v1){

        System.out.print("Neighbours of "+v1+" : ");
        for(int i=0;i<v;i++){
            if(graph[v1][i]!=0){
                System.out.print(i+" ");
            }
        }
    }
    void addVertex(){
        int[][] arr= new int[v+1][v+1];
        for(int i=0 ; i<v ; i++){
            for(int j=0 ; j<v ;j++){
                arr[i][j] = graph[i][j];
            }

        }
        graph=arr;
        v++;
    }

    void bfs(int start){
        boolean vis[]=new boolean[v];
        // Arrays.fill(vis,false);
        Queue<Integer>  q = new LinkedList<Integer>();

        q.add(start);
        while(!q.isEmpty()){
            int n = q.remove();
            if(!vis[n]){
                vis[n]=true;
                System.out.print(n + " ");
                for(int i=0;i<v;i++){
                    if(graph[n][i]==1){
                        q.add(i);
                    }
                }
            }
        }
    }

    void dfs(int start,boolean arr[]){
        System.out.print(start+" ");
        arr[start]=true;
        for(int i=0;i<v;i++){
            if(graph[start][i]==1 && !arr[i]){
                dfs(i,arr);
            }
        }

    }

    void transpose(){
        int[][] arr= new int[v][v];
        for(int i=0 ; i<v ; i++){
            for(int j=0 ; j<v ;j++){
                arr[j][i] = graph[i][j];
            }

        }
        graph=arr;

    }



    /* relaxation cond: dis[u]+graph[u][i]<distance the distance =dis[u]+graph[u][i]

     */
    int[] dijkstra(int source){
        int[] dis = new int[v];
        boolean vis[]=new boolean[v];
        Arrays.fill(dis,Integer.MAX_VALUE);

        dis[source] = 0;
        int n=v-1;
        while(n-->0){
            int j = minDis(dis,vis);
            vis[j] = true;

            for(int i=0 ; i<v ; i++){
                if(!vis[i] && graph[j][i] != 0 && dis[j]!= Integer.MAX_VALUE && dis[j]+graph[j][i]<dis[i]){
                    dis[i] = dis[j] + graph[j][i];
                }
            }
        }
        return dis;

    }

    int[] bellman(int source){
        int[] dis = new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);

        dis[source] = 0;
        int n=v-1;
        while(n-->0){
            for(int i=0 ; i<v ; i++){
                for(int j = 0 ; j<v ; j++){
                    if(graph[j][i] != 0 && dis[j]!= Integer.MAX_VALUE && dis[j]+graph[j][i]<dis[i]){
                        dis[i] = dis[j] + graph[j][i];
                    }
                }
            }
        }
        for(int i=0 ; i<v ; i++){
            for(int j = 0 ; j<v ; j++){
                if(graph[j][i] != 0 && dis[j]!= Integer.MAX_VALUE && dis[j]+graph[j][i]<dis[i]){
                    return null;
                }
            }
        }
        return dis;

    }
    int minDis(int dis[],boolean vis[]){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0;i<v;i++){
            if(!vis[i] && dis[i]<=min){
                min = dis[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    // int minAdj(int[] dis,boolean[] vis){
    //     int min = Integer.MAX_VALUE;
    //     for(int i=0;i<v;i++){
    //         if(!vis[i] && dis[i]!=0 && dis[i]<=min){
    //             min = i;
    //         }
    //     }
    //     return min;
    // }
    // List<Integer> spanningTree(List<Integer> nodes,int source){
    //     boolean vis[]=new boolean[v];
    //     Arrays.fill(vis,false);
    //     vis[source] = true;
    //     nodes=nodes.add(spanningTree(minAdj(graphn[source])));
    //     return nodes;
    // }


    public static void main(String [] args) {
        Graph2 g = new Graph2(7);
        g.addEdge(0, 1, 6);
        g.addEdge(0, 2, 5);
        g.addEdge(0, 3, 5);
        g.addEdge(1, 4, -1);
        g.addEdge(2, 1, -2);
        g.addEdge(2, 4, 1);
        g.addEdge(3, 2, -2);
        g.addEdge(3, 5, -1);
        g.addEdge(4, 6, 3);
        g.addEdge(5, 6, 3);
        // g.addEdge(1,0);
        // g.addEdge(1,2);
        g.display();
        System.out.println("");

        int[] minDis = g.bellman(0);
        System.out.println(Arrays.toString(minDis));

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list=spanningTree(list,0);
        // System.out.println(list);
        // g.bfs(0);

        // System.out.println("");
        // boolean vis[]=new boolean[g.v];
        // g.dfs(0,vis);
        // System.out.println("");
        // g.transpose();
        // g.display();
        // g.deleteEdge(1,2);
        // g.display();
        // g.addEdge()
        // g.addVertex();
        // g.display();
        g.display();
        g.deleteEdge(1, 2);
        g.addVertex();
        g.deleteEdge();

    }
}