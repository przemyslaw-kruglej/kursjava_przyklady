import java.util.Scanner;

public class PoliczSilnie {
  public static void main(String[] args) {
    System.out.print("Podaj liczbe nieujemna: ");
    int liczba = getInt();

    if (liczba < 0) {
      System.out.println("Nastepnym razem podaj liczbe nieujemna.");
    } else {
      int silnia = 1;

      for (int i = 1; i <= liczba; i++) {
        silnia = silnia * i;
      }

      System.out.println("Silnia " + liczba + " to " + silnia);
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}