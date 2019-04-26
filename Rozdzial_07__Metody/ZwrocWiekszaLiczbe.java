public class ZwrocWiekszaLiczbe {
  public static void main(String[] args) {
    int x = ktoraWieksza(100, 200);
    int y = ktoraWieksza(-5, -20);

    System.out.println("x wynosi " + x); // wypisze 200
    System.out.println("y wynosi " + y); // wypisze -5
  }

  public static int ktoraWieksza(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
}
