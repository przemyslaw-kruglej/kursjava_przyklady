import static java.lang.Math.*;

public class StatycznyImportMathZGwiazdka {
  public static void main(String[] args) {
    System.out.println("Liczba PI wynosi: " + PI);
    System.out.println("Liczba E wynosi: " + E);

    System.out.println(
        "Sinus 90 stopni wynosi: " + sin(toRadians(90))
    );
    System.out.println(
        "Zaokraglona liczba PI: " + round(PI)
    );
    System.out.println(
        "Pierwiastek liczby 100 to " + sqrt(100)
    );
  }
}