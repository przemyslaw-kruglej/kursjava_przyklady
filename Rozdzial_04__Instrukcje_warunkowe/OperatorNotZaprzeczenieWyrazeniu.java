public class OperatorNotZaprzeczenieWyrazeniu {
  public static void main(String[] args) {
    int a, b;

    a = 5;
    b = -10;

    if (!(a > 0 && b > 0)) {
      System.out.println("Niepoprawne dane.");
    } else {
      System.out.println("Pola prostokata = " + a * b);
    }
  }
}