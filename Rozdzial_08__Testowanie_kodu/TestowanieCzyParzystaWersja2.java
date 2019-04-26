import java.util.Scanner;

public class TestowanieCzyParzystaWersja2 {
  public static void main(String[] args) {
    System.out.println("Prosze podac liczbe - sprawdze, czy jest parzysta.");

    int liczba = getInt();

    if (czyParzysta(liczba)) {
      System.out.println("Ta liczba jest parzysta.");
    } else {
      System.out.println("Ta liczba jest nieparzysta");
    }
  }

  public static boolean czyParzysta(int x) {
    return x % 2 == 0;
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
