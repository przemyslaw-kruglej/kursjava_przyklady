import java.util.Scanner;

public class CzyLiczbaParzystaWersja2 {
  public static void main(String[] args) {
    int liczba;
    boolean czyParzysta;

    System.out.println("Prosze podac liczbe:");
    liczba = getInt();

    czyParzysta = liczba % 2 == 0;

    System.out.println("Czy liczba parzysta: " + czyParzysta);
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
