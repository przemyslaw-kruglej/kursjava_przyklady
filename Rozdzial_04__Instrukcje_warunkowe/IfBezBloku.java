import java.util.Scanner;

public class IfBezBloku {
  public static void main(String[] args) {
    int licznik, mianownik;


    System.out.println("Podaj licznik:");
    licznik = getInt();

    System.out.println("Podaj mianownik:");
    mianownik = getInt();

    double wynik;

    // blad! kod sie nie skompiluje, bo w lini:
    //  System.out.println("Wynik: " + wynik);
    // zmienna moze miec nie przypisana wartosc
    if (mianownik != 0)
      wynik = licznik / mianownik;
      System.out.println("Wynik: " + wynik);
}

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}