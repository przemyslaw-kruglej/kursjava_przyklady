import java.util.Scanner;

public class KolejnoscInstrukcji {
  public static void main(String[] args) {
    System.out.println("Prosze podac liczbe:");   // (1)

    int podanaLiczba = getInt();  // (2)

    System.out.println("Teraz policzymy kwadrat tej liczby."); // (4)

    double liczbaDoKwadratu = policzKwadrat(podanaLiczba); // (5)

    System.out.println("Kwadrat tej liczby wynosi " + liczbaDoKwadratu); // (7)
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt(); // (3)
  }

  public static double policzKwadrat(int liczba) {
    return liczba * liczba; // (6)
  }
}
