import java.util.Scanner;

public class CzyRokPrzestepny {
  public static void main(String[] args) {
    int rok;

    System.out.println("Podaj rok:");
    rok = getInt();

    if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
      System.out.println("Ten rok jest przestepny.");
    } else {
      System.out.println("Ten rok nie jest przestepny.");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}
