import java.util.Scanner;

public class ObwodTrojkataPobraneDane {
  public static void main(String[] args) {
    int x, y, z;
    int obwodTrojkata;

    System.out.println("Podaj pierwszy bok trojkata:");
    x = getInt();

    System.out.println("Podaj drugi bok trojkata:");
    y = getInt();

    System.out.println("Podaj trzeci bok trojkata:");
    z = getInt();

    obwodTrojkata = x + y + z;

    System.out.println(
        "Obwod trojkata o tych bokach wynosi " + obwodTrojkata
    );
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}