public class NiemutowalnyOdcinek {
  private final NiemutowalnyPunkt poczatek;
  private final NiemutowalnyPunkt koniec;

  public NiemutowalnyOdcinek(
      NiemutowalnyPunkt poczatek, NiemutowalnyPunkt koniec) {
    this.poczatek = poczatek;
    this.koniec = koniec;
  }

  public String toString() {
    return "NiemutowalnyOdcinek zawarty pomiedzy " +
        poczatek + " i " + koniec;
  }

  public static void main(String[] args) {
    NiemutowalnyPunkt poczatek = new NiemutowalnyPunkt(10, 20);
    NiemutowalnyPunkt koniec = new NiemutowalnyPunkt(15, 25);

    NiemutowalnyOdcinek odcinek =
        new NiemutowalnyOdcinek(poczatek, koniec);
  }
}