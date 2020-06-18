package domyslneKonstruktory;

public class Monitor extends Produkt {
  private int przekatnaEkranu;

  // blad kompilacji! nie wywolujemy konstruktora
  // klasy bazowej, a nie posiada on konstruktora bezargumentowego
  public Monitor(int przekatnaEkranu) {
    this.przekatnaEkranu = przekatnaEkranu;
  }
}
