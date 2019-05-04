public class Adres {
  private String miasto;
  private String ulica;
  private int nrDomu;
  private int nrMieszkania;

  public String toString() {
    return "Adres " + miasto + ", ulica " + ulica +
        " " + nrDomu + " m. " + nrMieszkania;
  }

  public static void main(String[] args) {
    Adres mojAdres = new Adres();

    System.out.println(mojAdres);
  }
}
