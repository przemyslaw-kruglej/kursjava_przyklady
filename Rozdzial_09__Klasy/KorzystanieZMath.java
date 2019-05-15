public class KorzystanieZMath {
  public static void main(String[] args) {
    System.out.println("Liczba PI wynosi: " + Math.PI);
    System.out.println("Liczba E wynosi: " + Math.E);

    System.out.println(
        "Sinus 90 stopni wynosi: " + Math.sin(Math.toRadians(90))
    );
    System.out.println(
        "Zaokraglona liczba PI: " + Math.round(Math.PI)
    );
    System.out.println(
        "Pierwiastek liczby 100 to " + Math.sqrt(100)
    );
  }
}