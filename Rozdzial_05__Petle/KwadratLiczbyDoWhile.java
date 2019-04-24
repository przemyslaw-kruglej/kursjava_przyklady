import java.util.Scanner;

public class KwadratLiczbyDoWhile {
  public static void main(String[] args) {
    int x;
    String czyKoniec;

    do {
      System.out.print("Podaj liczbe: ");
      x = getInt();

      System.out.println("Kwadrat tej liczby wynosi: " + (x * x));

      System.out.print("Czy chcesz zakonczyc program? [t/n] ");
      czyKoniec = getString();
    } while (!czyKoniec.equals("t"));
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}
