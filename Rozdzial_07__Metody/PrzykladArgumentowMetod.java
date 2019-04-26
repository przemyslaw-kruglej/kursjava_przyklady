import java.util.Scanner;

public class PrzykladArgumentowMetod {
  public static void main(String[] args) {
    System.out.println("Ile gwiazdek wypisac?");

    int liczbaGwiazdek = getInt(); // (1)

    wypiszWielokrotnosc("*", liczbaGwiazdek); // (2)
    // wypiszWielokrotnosc(liczbaGwiazdek, "*"); // (3)
  }

  public static int getInt() { // (4)
    return new Scanner(System.in).nextInt();
  }

  public static void wypiszWielokrotnosc(String tekst, int ileRazy) { // (5)
    for (int i = 0; i < ileRazy; i++) {
      System.out.print(tekst);
    }
  }
}
