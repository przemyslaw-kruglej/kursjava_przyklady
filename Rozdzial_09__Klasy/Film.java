public class Film {
  private String tytul;
  private String rezyser;
  private double cenaBiletu;

  public Film() {
    this("<nienazwany film>", "<brak rezysera>", 20.0);
    System.out.println("Wywolales konstruktor bezargumentowy!");
  }

  public Film(String tytul) {
    this(tytul, "<brak rezysera>", 20.0);
  }

  public Film(String tytul, String rezyser) {
    this(tytul, rezyser, 20.0);
  }

  public Film(String tytul, String rezyser, double cenaBiletu) {
    this.tytul = tytul;
    this.rezyser = rezyser;
    this.cenaBiletu = cenaBiletu;
  }

  public static void main(String[] args) {
    Film tajemniczyFilm = new Film();
    Film rambo = new Film("Rambo");
    Film zrodlo = new Film("Zrodlo", "Darren Aronofsky");
    Film cicheMiejsce = new Film("Ciche miejsce", "John Krasinski", 25.0);
  }
}
