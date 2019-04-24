import java.util.Scanner;

public class KwadratLiczbyWhile {
  public static void main(String[] args) {
    int x;
    String czyKoniec = "n";

    while (!czyKoniec.equals("t")) {
      System.out.print("Podaj liczbe: ");
      x = getInt();

      System.out.println("Kwadrat tej liczby wynosi: " + (x * x));

      System.out.print("Czy chcesz zakonczyc program? [t/n] ");
      czyKoniec = getString();
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}
