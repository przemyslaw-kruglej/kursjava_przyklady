import java.util.Scanner;

public class InstrukcjaSwitchDzienTygodniaBezBreak {
  public static void main(String[] args) {
    int dzienTygodnia;

    System.out.println("Podaj dzien tygoddnia:");
    dzienTygodnia = getInt();

    switch (dzienTygodnia) {
      case 1:
        System.out.println("Poniedzialek.");
      case 2:
        System.out.println("Wtorek.");
      case 3:
        System.out.println("Sroda.");
      case 4:
        System.out.println("Czwartek.");
      case 5:
        System.out.println("Piatek.");
      case 6:
        System.out.println("Sobota.");
      case 7:
        System.out.println("Niedziela.");
      default:
        System.out.println("Nieznany dzien tygodnia!");
    }
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}