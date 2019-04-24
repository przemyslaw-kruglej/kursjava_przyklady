public class ZagniezdzonyOperatorTrojargumentowy {
  public static void main(String[] args) {
    int y = -2;
    String komunikat;

    if (y < 0) {
      komunikat = "mniejsze od zero";
    } else if (y > 0) {
      komunikat = "wieksze od zero";
    } else {
      komunikat = "rowne zero";
    }

    // powy¿sze, zapisane przy uzyciu zagniezdzonych
    // troj-argumentowych operatorow logicznych
    komunikat = y < 0 ? "mniejsze od zero" :
        (y > 0 ? "wieksze od zero" : "rowne zero");
  }
}