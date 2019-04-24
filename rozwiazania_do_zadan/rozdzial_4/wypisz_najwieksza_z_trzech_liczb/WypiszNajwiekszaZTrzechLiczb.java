import java.util.Scanner;

public class WypiszNajwiekszaZTrzechLiczb {
  public static void main(String[] args) {
    int a, b, c;

    System.out.println("Podaj pierwsza liczbe:");
    a = getInt();

    System.out.println("Podaj druga liczbe:");
    b = getInt();

    System.out.println("Podaj trzecia liczbe:");
    c = getInt();

    if (a >= b) {
      if (a >= c) {
        System.out.println("Najwieksza liczba to " + a);
      } else {
        System.out.println("Najwieksza liczba to " + c);
      }
    } else {
      if (b >= c) {
        System.out.println("Najwieksza liczba to " + b);
      } else {
        System.out.println("Najwieksza liczba to " + c);
      }
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
