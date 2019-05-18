import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class StatycznyImportMath {
  public static void main(String[] args) {
    System.out.println("Liczba PI wynosi: " + PI);
    System.out.println("Liczba E wynosi: " + Math.E);

    System.out.println(
        "Sinus 90 stopni wynosi: " + Math.sin(Math.toRadians(90))
    );
    System.out.println(
        "Zaokraglona liczba PI: " + Math.round(PI)
    );
    System.out.println(
        "Pierwiastek liczby 100 to " + sqrt(100)
    );
  }
}