package wspoldzielenieobiektow;

public class Odcinek {
  private Punkt poczatek;
  private Punkt koniec;

  // poprzednia wersja
  /*public Odcinek(Punkt poczatek, Punkt koniec) {
    this.poczatek = poczatek;
    this.koniec = koniec;
  }*/

  // nowa wersja konstruktora
  public Odcinek(Punkt poczatek, Punkt koniec) {
    this.poczatek = new Punkt(poczatek.getX(), poczatek.getY());
    this.koniec = new Punkt(koniec.getX(), koniec.getY());
  }

  public void przesunPoczatek(int x, int y) {
    this.poczatek.setX(x);
    this.poczatek.setY(y);
  }

  public String toString() {
    return "Odcinek zawarty pomiedzy " + poczatek + " i " + koniec;
  }

  public static void main(String[] args) {
    // 1
    /*Punkt poczatekOdcinkow = new Punkt(10, 20);
    Punkt koniecPierwszego = new Punkt(15, 25);
    Punkt koniecDrugiego = new Punkt(10, 30);

    Odcinek odcinek1 = new Odcinek(poczatekOdcinkow, koniecPierwszego);
    Odcinek odcinek2 = new Odcinek(poczatekOdcinkow, koniecDrugiego);

    System.out.println(odcinek1);
    System.out.println(odcinek2);

    // 2
    odcinek1.przesunPoczatek(0, 5);

    System.out.println(odcinek1);
    System.out.println(odcinek2);

    // 3
    poczatekOdcinkow.setX(-20);
    poczatekOdcinkow.setY(50);

    System.out.println(odcinek1);
    System.out.println(odcinek2);*/

    // 4 - osobne Punkty dla kazdego Odcinka
    /*Punkt poczatekPierwszego = new Punkt(10, 20);
    Punkt koniecPierwszego = new Punkt(15, 25);

    Punkt poczatekDrugiego = new Punkt(10, 20);
    Punkt koniecDrugiego = new Punkt(10, 30);

    Odcinek odcinek1 = new Odcinek(poczatekPierwszego, koniecPierwszego);
    Odcinek odcinek2 = new Odcinek(poczatekDrugiego, koniecDrugiego);

    odcinek1.przesunPoczatek(0, 5);

    System.out.println(odcinek1);
    System.out.println(odcinek2);

    poczatekPierwszego.setX(-100);
    poczatekPierwszego.setY(-100);
    poczatekDrugiego.setX(200);
    poczatekDrugiego.setY(200);

    System.out.println(odcinek1);
    System.out.println(odcinek2);*/

    // 5 - kopie obiektow w konstruktorze
    Punkt poczatekOdcinkow = new Punkt(10, 20);
    Punkt koniecPierwszego = new Punkt(15, 25);
    Punkt koniecDrugiego = new Punkt(10, 30);

    Odcinek odcinek1 = new Odcinek(poczatekOdcinkow, koniecPierwszego);
    Odcinek odcinek2 = new Odcinek(poczatekOdcinkow, koniecDrugiego);

    System.out.println(odcinek1);
    System.out.println(odcinek2);

    poczatekOdcinkow.setX(-20);
    poczatekOdcinkow.setY(50);

    System.out.println(odcinek1);
    System.out.println(odcinek2);

    final Punkt punkt = new Punkt(10, 20);
    System.out.println(punkt);

    punkt.setX(5);
    System.out.println(punkt);
  }
}
