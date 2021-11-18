import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class ColoringGraph extends ReadGraph {
  //Setam pentru stringurile date o culoare
  public static final String ANSI_RESET = "\u001B[0m";
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

    // Initializam toate varfurile ca nealocate (fara culoare)
    Arrays.fill(result, -1);

    //Primului varf ii aloc o culoare (0 care e rosu)
    result[0]  = 0;

    //Un array temporar pentru a contine culorile valabile.
    //adica available de [color] va fi false
    boolean available[] = new boolean[V];

    //Initial toate culorile sunt adevarate
    Arrays.fill(available, true);

    //Ciclul de alocare a urmatoarelor varfuri de la 1 la V-1 (0 este deja alocat)
    for (int u = 1; u < V; u++)
    {
      //Trecem prin toate varfurile adiacente si setam in available ca false
      Iterator<Integer> it = adj[u].iterator() ;
      while (it.hasNext())
      {
        int i = it.next();
        if (result[i] != -1)
          available[result[i]] = false;
      }
      //Gasim prima culoare accesibila
      int color;
      for (color = 0; color < V; color++){
        if (available[color])
          break;
      }
      //Atribuim culoarea gasita in ciclul de mai sus
      result[u] = color;

      //Setam toate valorile true pentru urmatoarea iteratie
      Arrays.fill(available, true);
    }

    // Afisarea doua metode prima care prezinta culoarea prin cifre , doi prin culoare (doar pana la 6 culori)

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
