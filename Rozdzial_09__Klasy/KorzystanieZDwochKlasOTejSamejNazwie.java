import przykladowypakiet.pl.Powitanie;

public class KorzystanieZDwochKlasOTejSamejNazwie {
  public static void main(String[] args) {
    // klasa z pakietu przykladowypakiet.pl.Powitanie
    Powitanie.wypiszKomunikat();

    // inna klasa o nazwie Powitanie zdefiniowana w innym pakiecie
    // korzystamy z pelnej nazwy tej klasy, aby sie do niej odniesc
    przykladowypakiet.eng.Powitanie.wypiszKomunikat();
  }
}
