public class UzycieSamochodu {
  public static void main(String[] args) {
    Samochod samochod1 = new Samochod();
    samochod1.ustawKolor("Zielony");
    samochod1.ustawPredkosc(50);

    Samochod samochod2 = new Samochod();
    samochod2.ustawKolor("Niebieski");
    samochod2.ustawPredkosc(60);

    System.out.println(samochod1);
    System.out.println(samochod2);

    String opisSamochodu1 = samochod1.toString();
    String dokladniejszyOpis = "Opis zmiennej samochod1 to: " + samochod1;

    System.out.println(opisSamochodu1);
    System.out.println(dokladniejszyOpis);
  }
}
