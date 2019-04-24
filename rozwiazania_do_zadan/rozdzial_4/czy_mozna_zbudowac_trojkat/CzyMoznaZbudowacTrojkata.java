import java.util.Scanner;

public class CzyMoznaZbudowacTrojkata {
  public static void main(String[] args) {
    int a, b, c;

    System.out.println("Podaj pierwszy bok trojkata:");
    a = getInt();

    System.out.println("Podaj drugi bok trojkata:");
    b = getInt();

    System.out.println("Podaj trzeci bok trojkata:");
    c = getInt();

    if (a + b > c && a + c > b && b + c > a) {
      System.out.println("Z tych bokow mozna zbudowac trojkat.");
    } else {
      System.out.println("Z tych bokow nie mozna zbudowac trojkata.");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
