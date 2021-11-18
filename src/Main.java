public class Main {

  public static void main(String[] args) {


    //Colorarea grafurilor executie
    ColoringGraph objColor = new ColoringGraph(5);

    objColor.addEdge(0, 1);
    objColor.addEdge(0, 2);
    objColor.addEdge(1, 2);
    objColor.addEdge(1, 3);
    objColor.addEdge(2, 3);
    objColor.addEdge(3, 4);
    System.out.println("Colorarea Grafului 1");
    objColor.greedyColoring();

    System.out.println();

    ColoringGraph objColor1 = new ColoringGraph(5);
    objColor1.addEdge(0, 1);
    objColor1.addEdge(0, 2);
    objColor1.addEdge(1, 2);
    objColor1.addEdge(1, 4);
    objColor1.addEdge(2, 4);
    objColor1.addEdge(4, 3);
    System.out.println("Colorarea Grafului 2 ");
    objColor1.greedyColoring();

    System.out.println();

    //Graful Nr7
    ColoringGraph objColor2 = new ColoringGraph(11);
    objColor2.addEdge(0, 1);
    objColor2.addEdge(1, 2);
    objColor2.addEdge(1, 3);
    objColor2.addEdge(2, 3);
    objColor2.addEdge(2, 5);
    objColor2.addEdge(2, 9);
    objColor2.addEdge(2, 10);
    objColor2.addEdge(3, 4);
    objColor2.addEdge(4, 5);
    objColor2.addEdge(4, 7);
    objColor2.addEdge(5, 6);
    objColor2.addEdge(6, 7);
    objColor2.addEdge(6, 9);
    objColor2.addEdge(7, 8);
    objColor2.addEdge(8, 9);
    objColor2.addEdge(9, 10);
    System.out.println("Colorarea Grafului Nr. 7 ");
    objColor2.greedyColoring();

    System.out.println();

    //Algoritmul lui Prim
    /* Let us create the following graph
        2 3
        (0)--(1)--(2)
        | / \ |
        6| 8/ \5 |7
        | /     \ |
        (3)-------(4)
            9         */
    PrimMST objPrim = new PrimMST();
    int graphPrim[][] = new int[][] {
        { 0, 2, 0, 6, 0 },
        { 2, 0, 3, 8, 5 },
        { 0, 3, 0, 0, 7 },
        { 6, 8, 0, 0, 9 },
        { 0, 5, 7, 9, 0 }
    };

    // Print the solution
    objPrim.primMST(graphPrim);

    System.out.println();

//    /* Let us create the example graph discussed above */
    int graphDijkstra1[][] = new int[][] {
        { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
        { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
    };
    Djikstra objDjikstra1 = new Djikstra(9);
    objDjikstra1.dijkstra(graphDijkstra1, 0);

    int graphDijkstra2[][] = new int[][] {
        { 0, 10, 0, 0, 0, 0, 0, 0, 0 , 0, 0},
        { 10, 0, 15, 8, 0, 0, 0, 0, 0 , 0, 0},
        { 0, 15, 0, 11, 0, 5, 0, 0, 0 , 7, 6},
        { 0, 8, 11, 0, 16, 0, 0, 0, 0 , 0, 0},
        { 0, 0, 0, 16, 0, 0, 0, 15, 0 , 0, 0},
        { 0, 0, 5, 0, 0, 0, 1, 0, 0 , 0, 0},
        { 0, 0, 0, 0, 0, 1, 0, 2, 0 , 3, 0},
        { 0, 0, 0, 0, 15, 0, 2, 0, 1 , 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 1, 0 , 6, 0},
        { 0, 0, 7, 0, 0, 0, 3, 0, 6 , 0, 12},
        { 0, 0, 6, 0, 0, 0, 0, 0, 0 , 12, 0}
    };
    Djikstra objDjikstra2 = new Djikstra(11);
    objDjikstra2.dijkstra(graphDijkstra2, 0);
  }
}
