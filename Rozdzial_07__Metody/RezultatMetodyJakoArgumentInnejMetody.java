import java.util.Scanner;

public class RezultatMetodyJakoArgumentInnejMetody {
  public static void main(String[] args) {
    System.out.println("Podaj liczbe, a ja wypisze jej kwadrat:");
    System.out.println(podniesDoKwadratu(getInt()));
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }

  public static int podniesDoKwadratu(int liczba) {
    return liczba * liczba;
  }
}
