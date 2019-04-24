import java.util.Scanner;

public class DodawanieLiczbDoWhile {
  public static void main(String[] args) {
    int x, y;
    String czyKoniec;

    do {
      System.out.print("Podaj pierwsza liczbe: ");
      x = getInt();

      System.out.print("Podaj druga liczbe: ");
      y = getInt();

      System.out.println("Ich suma wynosi: " + (x + y));

      System.out.print("Czy chcesz zakonczyc program? [t/n] ");
      czyKoniec = getString();

      // wykonuj petle dopoki uzytkownik nie wpisze litery "t"
    } while (!czyKoniec.equals("t"));
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}