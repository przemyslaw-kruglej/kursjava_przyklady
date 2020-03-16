class BlednaWartoscDlaSilniException extends Exception {
  public BlednaWartoscDlaSilniException(String message) {
    super(message);
  }
}

public class SilniaZObslugaLiczbUjemnych {
  public static void main(String[] args) {
    try {
      System.out.println("Silnia 5 = " + silnia(5));
      System.out.println("Silnia -2 = " + silnia(-2));
    } catch (BlednaWartoscDlaSilniException e) {
      System.out.println("Wystpil blad: " + e.getMessage());
    }
  }

  public static int silnia(int n)
      throws BlednaWartoscDlaSilniException {

    if (n < 0) {
      throw new BlednaWartoscDlaSilniException(
          "Silnia moze byc liczona tylko dla n >= 0"
      );
    }

    int result = 1;

    for (int i = 2; i <= n; i++) {
      result *= i;
    }

    return result;
  }
}
