class NieprawidlowyAdresException extends Exception {
  public NieprawidlowyAdresException(String message) {
    super(message);
  }
}

public class Adres {
  private String ulica;
  private int numerDomu;
  private String kodPocztowy;
  private String miasto;

  public Adres(String ulica,
               int numerDomu,
               String kodPocztowy,
               String miasto)
      throws NieprawidlowyAdresException {

    String znalezionBledy = "";

    if (ulica == null) {
      znalezionBledy += "Ulica nie moze byc nullem. ";
    }

    if (numerDomu <= 0) {
      znalezionBledy += "Numer domu musi byc liczba dodatnia. ";
    }

    if (kodPocztowy == null) {
      znalezionBledy += "Kod pocztowy nie moze byc nullem. ";
    }

    if (miasto == null) {
      znalezionBledy += "Miasto nie moze byc nullem.";
    }

    if (!znalezionBledy.equals("")) {
      throw new NieprawidlowyAdresException(znalezionBledy);
    }

    this.ulica = ulica;
    this.numerDomu = numerDomu;
    this.kodPocztowy = kodPocztowy;
    this.miasto = miasto;
  }

  public static void main(String[] args) {
    try {
      Adres adres = new Adres("Jasna", 1, "05-025", "Warszawa");
      System.out.println("Obiekt typu Adres utworzony.");
    } catch (NieprawidlowyAdresException e) {
      System.out.println("Blad tworzenia adresu: " + e.getMessage());
    }

    try {
      Adres adres = new Adres("Koszykowa", -5, null, "Warszawa");
    } catch (NieprawidlowyAdresException e) {
      System.out.println("Blad tworzenia adresu: " + e.getMessage());
    }

    try {
      Adres adres = new Adres(null, 0, null, null);
    } catch (NieprawidlowyAdresException e) {
      System.out.println("Blad tworzenia adresu: " + e.getMessage());
    }
  }
}
