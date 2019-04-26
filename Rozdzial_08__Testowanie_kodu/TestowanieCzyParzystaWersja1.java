import java.util.Scanner;

public class TestowanieCzyParzystaWersja1 {
  public static void main(String[] args) {
    czyParzysta();
  }

  public static void czyParzysta() {
    System.out.println("Prosze podac liczbe - sprawdze, czy jest parzysta.");

    int liczba = getInt();

    if (liczba % 2 == 0) {
      System.out.println("Ta liczba jest parzysta.");
    } else {
      System.out.println("Ta liczba jest nieparzysta");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
