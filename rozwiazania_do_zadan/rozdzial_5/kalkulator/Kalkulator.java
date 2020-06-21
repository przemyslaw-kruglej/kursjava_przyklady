import java.util.Scanner;

public class Kalkulator {
  public static void main(String[] args) {
    // poczatek dzialania programu jest szczegolny,
    // bo potrzebujemy dwoch liczb od uzytkownika,
    // wiec pobierzemy pierwsza z nich od razu i zapiszemy
    // w zmiennej poprzedniWynik
    System.out.print("Podaj liczbe: ");
    int poprzedniWynik = getInt();

    String czyKoniec;
    boolean czyBlednaOperacja;

    do {
      int nowyWynik = 0;
      // ustaw ta zmienna na false - jezeli cos bedzie nie tak,
      // ustawimy wartosc na true (patrz instrukcja switch ponizej)
      czyBlednaOperacja = false;

      System.out.print("Podaj dzialanie (* / - +): ");
      String dzialanie = getString();

      System.out.print("Podaj kolejna liczbe: ");
      int drugaLiczba = getInt();

      // wykonaj dzialanie i zapisz wynik w zmiennej nowyWynik
      switch (dzialanie) {
        case "+":
          nowyWynik = poprzedniWynik + drugaLiczba;
          break;
        case "-":
          nowyWynik = poprzedniWynik - drugaLiczba;
          break;
        case "*":
          nowyWynik = poprzedniWynik * drugaLiczba;
          break;
        case "/":
          if (drugaLiczba == 0) {
            czyBlednaOperacja = true;
            System.out.println("Nie moge podzielic przez 0.");
          } else {
            nowyWynik = poprzedniWynik / drugaLiczba;
          }
          break;
        default:
          czyBlednaOperacja = true;
          System.out.println("Nieprawidlowa operacja.");
      }

      // jezeli podano 0 przy dzieleniu lub nieznany symbol dzialania,
      // nie chcemy nic wypisywac na ekranie
      if (!czyBlednaOperacja) {
        // wypisz wykonywane dzialanie i jego wynik
        System.out.println(
            poprzedniWynik + " " + dzialanie + " " + drugaLiczba + " = " + nowyWynik
        );

        // nowy wynik staje sie poprzednim wynikiem
        poprzedniWynik = nowyWynik;
      }

      System.out.println("Czy chcesz zakonczyc program? [t/n]");
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