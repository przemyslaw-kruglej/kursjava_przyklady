package pojazdy;

public class SamochodWyscigowy extends Samochod {
  public SamochodWyscigowy() {
    this.liczbaKol = 4;
    // blad kompilacji - pole prywatne, nie dziedziczymy go
    // this.rejestracja = "KJ-777";
  }

  public String toString() {
    return "Samochod wyscigowy, liczba kol: " + liczbaKol;
  }
}
