public class Powitanie {
  public static final Powitanie INSTANCE = new Powitanie();

  private Powitanie() {

  }

  public void powitaj(String imie) {
    System.out.println("Witaj " + imie);
  }
}
