public abstract class Graph {
    protected int[][] adjacencyMatrix; 
    protected int numVertices; 

 
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices]; 
    }

    public void addEdge(int source, int destination) {
        if (source < 0 || source >= numVertices || destination < 0 || destination >= numVertices) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        adjacencyMatrix[source][destination] = 1; 
        adjacencyMatrix[destination][source] = 1; 
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class UndirectedGraph extends Graph {
    public UndirectedGraph(int numVertices) {
        super(numVertices);
    }
    public static void main(String[] args) {
        Graph graph = new UndirectedGraph(5); 
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
