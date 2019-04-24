import java.util.Scanner;

public class WypiszNajwiekszaZDwochLiczb {
  public static void main(String[] args) {
    int x, y ;

    System.out.println("Podaj pierwsza liczbe:");
    x = getInt();

    System.out.println("Podaj druga liczbe:");
    y = getInt();

    if (x > y) {
      System.out.println("Wieksza liczba to " + x);
    } else {
      System.out.println("Wieksza liczba to " + y);
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}