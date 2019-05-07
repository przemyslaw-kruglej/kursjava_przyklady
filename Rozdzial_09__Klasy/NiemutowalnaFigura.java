public class NiemutowalnaFigura {
  private final NiemutowalnyPunkt[] punkty;

  public NiemutowalnaFigura(NiemutowalnyPunkt[] punkty) {
    // utworz nowa tablice
    this.punkty = new NiemutowalnyPunkt[punkty.length];

    // i przepisz zawartosc z tablicy-argumentu do nowej tablicy
    for (int i = 0; i < punkty.length; i++) {
      this.punkty[i] = punkty[i];
    }
  }
  
  /* ta wersja metody getPunkty sprawia, ze obiekty
     klasy NiemutowalnaFigura przestalyby byc niemutowalne!
  public NiemutowalnyPunkt[] getPunkty() {
    return punkty;
  }
  */

  public NiemutowalnyPunkt[] getPunkty() {
    NiemutowalnyPunkt[] rezultat =
        new NiemutowalnyPunkt[punkty.length];

    for (int i = 0; i < rezultat.length; i++) {
      rezultat[i] = punkty[i];
    }
    return rezultat;
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

    NiemutowalnaFigura figura = new NiemutowalnaFigura(punktyKwadratu);

    System.out.println(figura);

    punktyKwadratu[0] = new NiemutowalnyPunkt(-10, -5);

    System.out.println(figura);
  }
}