public class Figura {
  private final NiemutowalnyPunkt[] punkty;

  public Figura(NiemutowalnyPunkt[] punkty) {
    this.punkty = punkty;
  }

  public String toString() {
    String punktyFigury = "";

    for (NiemutowalnyPunkt punkt : punkty) {
      punktyFigury += "\t" + punkt + "\n";
    }

    return "Figura sklada sie z punktow:\n" + punktyFigury;
  }

  public static void main(String[] args) {
    NiemutowalnyPunkt[] punktyKwadratu = {
        new NiemutowalnyPunkt(0, 0),
        new NiemutowalnyPunkt(10, 0),
        new NiemutowalnyPunkt(10, 10),
        new NiemutowalnyPunkt(0, 10),
    };

    Figura figura = new Figura(punktyKwadratu);

    System.out.println(figura);

    punktyKwadratu[0] = new NiemutowalnyPunkt(-10, -5);

    System.out.println(figura);
  }
}
