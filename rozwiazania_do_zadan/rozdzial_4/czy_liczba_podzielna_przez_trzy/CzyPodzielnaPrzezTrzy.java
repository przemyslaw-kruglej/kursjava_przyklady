import java.util.Scanner;

public class CzyPodzielnaPrzezTrzy {
  public static void main(String[] args) {
    int x;

    System.out.println("Prosze podac liczbe:");
    x = getInt();

    if (x % 3 == 0) {
      System.out.println("Liczba " + x + " jest podzielna przez 3.");
    } else {
      System.out.println("Liczba " + x + " nie jest podzielna przez 3.");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
