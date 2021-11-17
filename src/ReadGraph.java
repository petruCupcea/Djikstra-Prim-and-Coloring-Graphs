import java.util.LinkedList;

public class ReadGraph {
  protected int V;   // No. of vertices
  protected LinkedList<Integer> adj[]; //Adjacency List

//  ReadGraph() {
//    V = 0;
//    adj = new LinkedList[0];
//    for (int i=0; i<0; ++i)
//      adj[i] = new LinkedList();
//  }

  ReadGraph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i=0; i<v; ++i)
      adj[i] = new LinkedList();
  }

  void addEdge(int v,int w)
  {
    adj[v].add(w);
    adj[w].add(v); //Graph is undirected
  }

}
