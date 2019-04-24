import java.util.Scanner;

public class WypiszGwiazdkiDoWhile {
  public static void main(String[] args) {
    System.out.println("Ile gwiazdek wypisac?");
    int liczbaGwiazdek = getInt();

    if (liczbaGwiazdek > 0) {
      do {
        System.out.print("*");
        liczbaGwiazdek--;
      } while (liczbaGwiazdek > 0);
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}