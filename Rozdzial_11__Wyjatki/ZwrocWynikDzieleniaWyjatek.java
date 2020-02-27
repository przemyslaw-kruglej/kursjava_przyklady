public class ZwrocWynikDzieleniaWyjatek {
  public static void main(String[] args) {
    try {
      System.out.println(podziel(10, 0));
    } catch (ArithmeticException e) {
      System.out.println("Nie wolno dzielic przez 0!");
    }
  }

  public static int podziel(int a, int b) {
    return a / b;
  }
}
