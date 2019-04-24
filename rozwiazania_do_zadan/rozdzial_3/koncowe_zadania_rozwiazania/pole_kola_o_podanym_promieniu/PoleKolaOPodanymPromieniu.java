import java.util.Scanner;

public class PoleKolaOPodanymPromieniu {
  public static void main(String[] args) {
    int promienKola;
    double poleKola;

    System.out.println("Podaj promien kola:");
    promienKola = getInt();

    poleKola = 3.14 * promienKola * promienKola;

    System.out.println(
        "Pole kola o tym promieniu wynosi: " + poleKola
    );
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}