public class Main {

  public static void main(String[] args) {


    //Colorarea grafurilor executie
    ColoringGraph objColor = new ColoringGraph(17);

    objColor.addEdge(0,1);
    objColor.addEdge(0,2);
    objColor.addEdge(0,3);
    objColor.addEdge(0,6);
    objColor.addEdge(1,2);
    objColor.addEdge(1,3);
    objColor.addEdge(1,13);
    objColor.addEdge(1,14);
    objColor.addEdge(1,15);
    objColor.addEdge(2,3);
    objColor.addEdge(2,4);
    objColor.addEdge(2,6);
    objColor.addEdge(3,6);
    objColor.addEdge(4,5);
    objColor.addEdge(4,9);
    objColor.addEdge(4,13);
    objColor.addEdge(5,6);
    objColor.addEdge(5,7);
    objColor.addEdge(5,8);
    objColor.addEdge(6,7);
    objColor.addEdge(6,8);
    objColor.addEdge(7,8);
    objColor.addEdge(9,10);
    objColor.addEdge(9,11);
    objColor.addEdge(9,12);
    objColor.addEdge(10,11);
    objColor.addEdge(10,12);
    objColor.addEdge(11,12);
    objColor.addEdge(13,14);
    objColor.addEdge(13,15);
    objColor.addEdge(13,16);
    objColor.addEdge(14,15);
    objColor.addEdge(14,16);
    objColor.addEdge(15,16);


    System.out.println("Colorarea Grafului 1");
    objColor.greedyColoring();

    System.out.println();

    ColoringGraph objColor1 = new ColoringGraph(8);
    objColor1.addEdge(0, 1);
    objColor1.addEdge(0, 5);
    objColor1.addEdge(1, 2);
    objColor1.addEdge(1, 5);
    objColor1.addEdge(1, 6);
    objColor1.addEdge(1, 7);
    objColor1.addEdge(2, 3);
    objColor1.addEdge(2, 7);
    objColor1.addEdge(3, 4);
    objColor1.addEdge(3, 6);
    objColor1.addEdge(3, 7);
    objColor1.addEdge(4, 5);objColor1.addEdge(0, 1);
    objColor1.addEdge(5, 6);
    objColor1.addEdge(6, 7);
    System.out.println("Colorarea Grafului G6 ");
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
    System.out.println("Colorarea Grafului Nr. G7 ");
    objColor2.greedyColoring();

    System.out.println();

    //Algoritmul lui Prim pentru graful G7
    PrimMST objPrim2 = new PrimMST(11);
    int graphPrim2[][] = new int[][] {
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
    objPrim2.primMST(graphPrim2);
    System.out.println();

    //Algoritmul lui Dijkstra pentru G6
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

    //Algoritmul lui Dijkstra pentru G7
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
    objDjikstra2.dijkstra(graphDijkstra2, 2);
  }
}
