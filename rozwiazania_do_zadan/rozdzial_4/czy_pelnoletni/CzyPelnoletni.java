import java.util.Scanner;

public class CzyPelnoletni {
  public static void main(String[] args) {
    int wiek;
    boolean czyPelnoletni;

    System.out.println("Podaj swoj wiek:");
    wiek = getInt();

    czyPelnoletni = wiek >= 18 ? true : false;

    System.out.println("Czy pelnoletni? " + czyPelnoletni);
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}