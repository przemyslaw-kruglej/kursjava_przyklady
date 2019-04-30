public class MetodaWypisujacaGwiazdki {
  public static void main(String[] args) {
    wypiszGwiazdki(10);
    wypiszGwiazdki(0);
    wypiszGwiazdki(1);
    wypiszGwiazdki(20);
  }

  public static void wypiszGwiazdki(int ileGwiazdek) {
    for (int i = 0; i < ileGwiazdek; i++) {
      System.out.print("*");
    }
    System.out.println(); // nowa linia
  }
}