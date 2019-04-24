import java.util.Scanner;

public class PoliczPoleKolaContinue {
  public static void main(String[] args) {
    int promien;

    do {
      System.out.print("Podaj promien kola: ");
      promien = getInt();

      if (promien <= 0) {
        System.out.println(
            "Nieprawidlowy promien. Podaj liczbe wieksza od 0"
        );
        continue;
      }

      double poleKola = 3.14 * promien * promien;
      System.out.println("Pole kola o tym promieniu: " + poleKola);
    } while (promien <= 0);
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
