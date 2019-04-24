import java.util.Scanner;

public class DzienTygodniaOperatoryWarunkowe {
  public static void main(String[] args) {
    int dzienTygodnia;

    System.out.println("Podaj numer dnia tygodnia:");
    dzienTygodnia = getInt();

    if (dzienTygodnia < 1 || dzienTygodnia > 7) {
      System.out.println("Nieprawidlowy dzien tygodnia.");
    } else if (dzienTygodnia == 5) {
      System.out.println("Jutro weeekeend! :)");
    } else if (!(dzienTygodnia == 6 || dzienTygodnia == 7)) {
      System.out.println("Praca :(");
    } else {
      System.out.println("Weekend! :)");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}