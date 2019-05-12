public class ZwracanieObiektuZMetody {
  public static void main(String[] args) {
    NiemutowalnyPunkt pewienPunkt = new NiemutowalnyPunkt(10, 20);
    System.out.println("Poczatkowy punkt: " + pewienPunkt);

    NiemutowalnyPunkt nowyPunkt = przesunPunkt(pewienPunkt, 5);
    System.out.println("Przesuniety punkt: " + nowyPunkt);
  }

  public static NiemutowalnyPunkt przesunPunkt(
      NiemutowalnyPunkt punkt, int wartosc) {

    int noweX = punkt.getX() + wartosc;
    int noweY = punkt.getY() + wartosc;

    return new NiemutowalnyPunkt(noweX, noweY);
  }
}
