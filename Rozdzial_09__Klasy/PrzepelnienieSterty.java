public class PrzepelnienieSterty {
  private String tekst;

  public PrzepelnienieSterty(String tekst) {
    this.tekst = tekst;
  }

  public static void main(String[] args) {
    PrzepelnienieSterty[] tab = new PrzepelnienieSterty[1000000];

    for (int i = 0; i < tab.length; i++) {
      tab[i] = new PrzepelnienieSterty("Witaj po raz" + i + "!");
    }
  }
}
