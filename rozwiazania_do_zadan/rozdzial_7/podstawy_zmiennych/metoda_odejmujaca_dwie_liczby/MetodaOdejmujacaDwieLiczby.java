public class MetodaOdejmujacaDwieLiczby {
  public static void main(String[] args) {
    wypiszWynikOdejmowania(10, 10);
    wypiszWynikOdejmowania(-5, 10);
    wypiszWynikOdejmowania(2, 5);
    wypiszWynikOdejmowania(20, -10);
  }

  public static void wypiszWynikOdejmowania(int x, int y) {
    System.out.println(x - y);
  }
}