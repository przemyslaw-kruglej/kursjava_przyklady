// ponizszy kod sie nie skompiluje, poniewaz w metodzie
//  podzielLiczby istnieje sciezka wykonania, ktora spowodowalaby
//  nie zwrocenie wartosci (gdy y == 0)
public class ReturnWIfie {
  public static void main(String[] args) {
    double wynikDzielenia = podzielLiczby(100, 25);
  }

  public static double podzielLiczby(int x, int y) {
    if (y != 0) {
      return x / y;
    }
  }
}
