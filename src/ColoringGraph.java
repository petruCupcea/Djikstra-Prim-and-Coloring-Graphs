import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class ColoringGraph extends ReadGraph {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";


  ColoringGraph(int v) {
    super(v);
  }

  void greedyColoring()
  {
    int result[] = new int[V];

    // Initialize all vertices as unassigned
    Arrays.fill(result, -1);

    // Assign the first color to first vertex
    result[0]  = 0;

    // A temporary array to store the available colors. False
    // value of available[cr] would mean that the color cr is
    // assigned to one of its adjacent vertices
    boolean available[] = new boolean[V];

    // Initially, all colors are available
    Arrays.fill(available, true);

    // Assign colors to remaining V-1 vertices
    for (int u = 1; u < V; u++)
    {
      // Process all adjacent vertices and flag their colors
      // as unavailable
      Iterator<Integer> it = adj[u].iterator() ;
      while (it.hasNext())
      {
        int i = it.next();
        if (result[i] != -1)
          available[result[i]] = false;
      }

      // Find the first available color
      int cr;
      for (cr = 0; cr < V; cr++){
        if (available[cr])
          break;
      }

      result[u] = cr; // Assign the found color

      // Reset the values back to true for the next iteration
      Arrays.fill(available, true);
    }

    // Afisarea
//    for (int u = 0; u < V; u++){
//      System.out.println("Varful " + u + " ->  Culoarea " + result[u] );
//    }

    for (int u = 0; u < V; u++){
    switch(result[u]) {
      case 0: System.out.println(ANSI_RED + "Varful " + u + ANSI_RESET); break;
      case 1: System.out.println(ANSI_BLUE + "Varful " + u + ANSI_RESET); break;
      case 2: System.out.println(ANSI_GREEN + "Varful " + u + ANSI_RESET); break;
      case 3: System.out.println(ANSI_PURPLE + "Varful " + u + ANSI_RESET); break;
      case 4: System.out.println( ANSI_YELLOW+ "Varful " + u + ANSI_RESET); break;
      case 5: System.out.println(ANSI_CYAN + "Varful " + u + ANSI_RESET); break;
      case 6: System.out.println(ANSI_WHITE + "Varful " + u + ANSI_RESET); break;
     }
    }

  }

}
