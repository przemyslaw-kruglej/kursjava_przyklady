public class Osoba {
  private int wiek;
  private String imie;
  private String nazwisko;

  public void ustawWiek(int wartoscWieku) {
    wiek = wartoscWieku;
  }

  public void ustawImie(String imieOsoby) {
    imie = imieOsoby;
  }

  public void ustawNazwisko(String nazwiskoOsoby) {
    nazwisko = nazwiskoOsoby;
  }

  public String toString() {
    return "Osoba " + imie + " " + nazwisko +
        " ma " + wiek + " lat.";
  }

  public static void main(String[] args) {
    Osoba autor = new Osoba();
    autor.ustawImie("Stephen");
    autor.ustawNazwisko("King");
    autor.ustawWiek(71);

    System.out.println(autor);
  }
}