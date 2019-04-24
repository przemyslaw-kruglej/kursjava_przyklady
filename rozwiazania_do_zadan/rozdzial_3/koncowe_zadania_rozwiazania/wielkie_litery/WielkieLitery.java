import java.util.Scanner;

public class WielkieLitery {
  public static void main(String[] args) {
    String slowo;

    System.out.println("Podaj slowo:");
    slowo = getString();

    System.out.println(slowo.toUpperCase());
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}