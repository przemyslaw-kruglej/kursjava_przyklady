public class ZmienneTypowZlozonych {
  public static void main(String[] args) {
    Samochod2 pierwszySamochod = new Samochod2();
    pierwszySamochod.ustawKolor("Czerwony");
    pierwszySamochod.ustawPredkosc(80);

    Samochod2 drugiSamochod = pierwszySamochod;
    drugiSamochod.ustawKolor("Bialy");

    System.out.println(pierwszySamochod);
    System.out.println(drugiSamochod);
  }
}
