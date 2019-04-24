import java.util.Scanner;

public class WypiszGwiazdkiFor {
  public static void main(String[] args) {
    System.out.println("Ile gwiazdek wypisac?");
    int liczbaGwiazdek = getInt();

    for (int i = 0; i < liczbaGwiazdek; i++) {
      System.out.print("*");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}