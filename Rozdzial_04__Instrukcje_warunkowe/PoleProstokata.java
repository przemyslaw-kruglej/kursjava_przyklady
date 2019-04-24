import java.util.Scanner;

public class PoleProstokata {
  public static void main(String[] args) {
    int a, b;

    System.out.println("Podaj pierwszy bok prostokata:");
    a = getInt();
    System.out.println("Podaj drugi bok prostokata:");
    b = getInt();

    // uzywamy operatora && - warunek bedzie spelniony,
    // gdy zarowno zmienna a, jak i b, beda wieksze od 0
    if (a > 0 && b > 0) {
      System.out.println("Pole wynosi " + a * b);
    } else {
      System.out.println("Nieprawidlowe dane.");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}