public class OperatorPrzypisaniaPomocnicze {
  public static void main(String[] args) {
    int a = 10;

    a += 100; // a = 10 + 100, wiec a bedzie rowne 110
    a -= 10; // a = a – 10, wiec a bedzie rowne 100
    a *= 5; // a = a * 5, wiec a bedzie rowne 500
    a /= 25 * 10; // a = a / (25 * 10), wiec a bedzie rowne 2
    a %= 2; // a = a % 2, wiec a bedzie rowne 0

    System.out.println(a); // wypisze 0
  }
}
