import java.util.Scanner;

public class PobierzWiekOdUzytkownika {
  public static void main(String[] args) {
    try {
      System.out.print("Podaj wiek osoby: ");
      int wiek = getInt();

      if (wiek <= 0) {
        throw new NieprawidlowyWiekException();
      }

      Osoba osoba = new Osoba("Jan", "Nowak", wiek);

      System.out.println("Obiekt utworzony!");
    } catch (NieprawidlowaWartoscException e) {
      System.out.println("Nieprawidlowa wartosc: " + e.getMessage());
    } catch (NieprawidlowyWiekException e) {
      System.out.println("Nieprawidlowy wiek!");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
