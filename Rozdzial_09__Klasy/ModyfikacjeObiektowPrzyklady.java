public class ModyfikacjeObiektowPrzyklady {
  public static void main(String[] args) {
    Produkt ksiazka = new Produkt(49.0, "Hyperion");

    System.out.println("Ksiazka przed zmiana ceny: " + ksiazka);
    double nowaCena = 30.0;

    zmienCene(nowaCena, ksiazka);

    System.out.println("nowaCena po wywolaniu metody: " + nowaCena);
    System.out.println("Ksiazka po zmianie ceny: " + ksiazka);

    //

    Produkt owoc = new Produkt(10.0, "Czeresnie");
    System.out.println("Owoc przed zmiana: " + owoc);

    zmienProdukt(owoc, 5.0, "Jablko");

    System.out.println("Owoc po zmianie: " + owoc);

    //

    Produkt rower = new Produkt(999.0, "Rower");
    Produkt pojazd = rower;

    pojazd = new Produkt(50000.0, "Samochod");

    System.out.println(rower);
    System.out.println(pojazd);
  }

  public static void zmienCene(double cena, Produkt produkt) {
    cena = cena * 1.23;
    produkt.setCena(cena);
  }

  public static void zmienProdukt(Produkt produkt, double nowaCena, String nowaNazwa) {
    produkt = new Produkt(nowaCena, nowaNazwa);
  }
}
