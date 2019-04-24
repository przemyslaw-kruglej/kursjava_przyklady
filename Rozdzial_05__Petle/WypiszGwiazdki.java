import java.util.Scanner;

public class WypiszGwiazdki {
  public static void main(String[] args) {
    System.out.println("Ile gwiazdek wypisac?");
    int liczbaGwiazdek = getInt();

    // dopoki liczba gwiazdek jest wieksza od zera...
    while (liczbaGwiazdek > 0) {
      // ...wypisz na ekran gwiazdke
      System.out.print("*");
      liczbaGwiazdek--;
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}