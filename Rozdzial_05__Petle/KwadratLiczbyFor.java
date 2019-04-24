import java.util.Scanner;

public class KwadratLiczbyFor {
  public static void main(String[] args) {
    String czyKoniec = "n";

    for (int x; !czyKoniec.equals("t"); czyKoniec = getString()) {
      System.out.print("Podaj liczbe: ");
      x = getInt();

      System.out.println("Kwadrat tej liczby wynosi: " + (x * x));
      System.out.print("Czy chcesz zakonczyc program? [t/n] ");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}
