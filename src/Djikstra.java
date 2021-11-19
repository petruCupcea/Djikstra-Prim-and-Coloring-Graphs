public class Djikstra {
  int V ;

  Djikstra(int tempVertex) {
    this.V = tempVertex;
  }

  int minDistance(int[] dist, Boolean[] boolSet)
  {
    // Initializam valoarea minimala si indexul lui
    int min = Integer.MAX_VALUE, min_index = -1;

    //i este varful in cazul dat
    for (int i = 0; i < V; i++)
      if ( !boolSet[i]  && dist[i] <= min) {
        min = dist[i];
        min_index = i;
      }
    return min_index;
  }


  // functia de afisare
  void printSolution(int[] dist)
  {
    System.out.println("Varful \t\t Distanta de la varful sursa");
    for (int i = 0; i < V; i++)
      System.out.println(i + " \t\t      " + dist[i]);
  }


  void dijkstra(int[][] graph, int src)
  {
    int[] dist = new int[V];

    Boolean[] boolSet = new Boolean[V];

    //Initializam dist[] ca infinit(max_int) si boolSet[] ca false
    for (int i = 0; i < V; i++) {
      dist[i] = Integer.MAX_VALUE;
      boolSet[i] = false;
    }

    //Distanta de la sursa va fi tot timpul 0
    dist[src] = 0;

    //Gasim ce-a mai scurta distanta pentru fiecare varf
    for (int j = 0; j < V - 1; j++) {
      // u este varful cu cea mai mica greutate din functia minDistance
      int u = minDistance(dist, boolSet);

      //Marcam varful dat ca true
      boolSet[u] = true;

      //update la dist
      for (int v = 0; v < V; v++)

        // facem update la dist doar daca indeplineste urmatoarele conditii
        // 1 in boolSet este setat ca false
        // 2 in graph este diferit de 0
        // 3 dist[u] este diferit de infinit
        // 4 dist[u] + graph[u][v] < dist[v] (pentru prima iteratie dist[v] este infinit)
        if (!boolSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
          dist[v] = dist[u] + graph[u][v];
    }

    printSolution(dist);
  }
}
