import java.util.InputMismatchException;
import java.util.Scanner;

public class GetIntObslugaWyjatkow {
  public static void main(String[] args) {
    boolean wartoscPodana = false;
    int x = 0;

    while (!wartoscPodana) {
      try {
        System.out.print("Podaj liczbe: ");
        x = getInt();

        wartoscPodana = true;
      } catch (InputMismatchException e) {
        System.out.println("To nie jest liczba!");
      }
    }

    int kwadrat = x * x;
    System.out.println("Kwadrat tej liczby wynosi " + kwadrat);
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
