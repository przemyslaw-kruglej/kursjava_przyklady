public class TrojargumentowyOperatorLogiczny {
  public static void main(String[] args) {
    int x = -5;
    int wartoscAbsolutna;

    if (x >= 0) {
      wartoscAbsolutna = x;
    } else {
      wartoscAbsolutna = -x;
    }

    // to samo z uzyciem troj-argumentowego operatora logicznego
    wartoscAbsolutna = x >= 0 ? x : -x;

    System.out.println(
        "Wartosc absolutna liczby " + x + " wynosi " + wartoscAbsolutna
    );
  }
}
