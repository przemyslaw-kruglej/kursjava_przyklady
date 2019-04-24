import java.util.Scanner;

public class WypiszNajwiekszaZPodanychLiczb {
  public static void main(String[] args) {
    System.out.print("Podaj liczbe: ");
    int najwiekszaLiczba = getInt();

    while (true) {
      System.out.print("Czy chcesz zakonczyc program? [t/n] ");
      String czyKoniec = getString();

      if (czyKoniec.equals("t")) {
        break;
      }

      System.out.print("Podaj kolejna liczbe: ");
      int nowaLiczba = getInt();

      if (nowaLiczba > najwiekszaLiczba) {
        najwiekszaLiczba = nowaLiczba;
      }
    }

    System.out.println("Najwieksza liczba z podanych to " + najwiekszaLiczba);
  }

  public static int getInt() {
      return new Scanner(System.in).nextInt();
  }

  public static String getString() {
      return new Scanner(System.in).next();
  }
}
