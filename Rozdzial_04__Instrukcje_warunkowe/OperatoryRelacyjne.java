import java.util.Scanner;

public class OperatoryRelacyjne {
  public static void main(String[] args) {
    int liczba;

    System.out.println("Podaj liczbe:");
    liczba = getInt();

    if (liczba < 0) {
      System.out.println("Podales liczbe ujemna.");
    } else if (liczba == 0) {
      System.out.println("Podales zero.");
    } else {
      System.out.println("Podales liczbe dodatnia");
    }

    int promien;

    System.out.println("Podaj promien kola:");
    promien = getInt();

    if (promien <= 0) {
      System.out.println("Nieprawidlowy promien: " + promien);
    } else {
      double obwodKola = 2 * 3.14 * promien;
      System.out.println("Obwod tego kola wynosi: " + obwodKola);
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}