class WyjatekBezTresciException extends Exception {}

class WyjatekZKomunikatemException extends Exception {
  public WyjatekZKomunikatemException(String message) {
    // przekaz tresc wyjatku do konstruktora klasy bazowej,
    // ktory umiesci ja w polu message, ktore bedzie dostepne
    // za pomoca metody getMessage
    super(message);
  }
}

class WyjatekZDodatkowymiDanymiException extends Exception {
  private int pewnaWartosc;
  private String innaWartosc;

  public WyjatekZDodatkowymiDanymiException(int pewnaWartosc, String innaWartosc) {
    this.pewnaWartosc = pewnaWartosc;
    this.innaWartosc = innaWartosc;
  }

  public String getMessage() {
    return "Wartosci zapisane w tym wyjatku: " +
        pewnaWartosc + " " + innaWartosc;
  }
}

public class ZawartoscWyjatkowPrzyklady {
  public static void main(String[] args) {
    try {
      throw new WyjatekZKomunikatemException("Co tu sie wyprawia?!");
    } catch (WyjatekZKomunikatemException e) {
      System.out.println("Wyjatek zawiera komunikat: " + e.getMessage());
      e.printStackTrace();
    }

    try {
      throw new WyjatekBezTresciException();
    } catch (WyjatekBezTresciException e) {
      System.out.println("Wyjatek zawiera komunikat: " + e.getMessage());
    }

    try {
      int pewnaWartosc = 10;
      String innaWartosc = "test";

      throw new WyjatekZDodatkowymiDanymiException(pewnaWartosc, innaWartosc);
    } catch (WyjatekZDodatkowymiDanymiException e) {
      System.out.println("Wyjatek zawiera komunikat: " + e.getMessage());
    }
  }
}
