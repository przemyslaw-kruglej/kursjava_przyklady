import java.util.Arrays;

public class Figura {
  private Punkt[] wierzcholki;

  public Figura(Punkt[] wierzcholki) {
    this.wierzcholki = wierzcholki;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    Figura other = (Figura) o;

    return Arrays.equals(this.wierzcholki, other.wierzcholki);
  }

  public static void main(String[] args) {
    Figura kwadrat = new Figura(new Punkt[] {
        new Punkt(0, 0),
        new Punkt(10, 0),
        new Punkt(10, 10),
        new Punkt(0, 10)
    });

    Figura podobnyKwadrat = new Figura(new Punkt[] {
        new Punkt(0, 0),
        new Punkt(10, 0),
        new Punkt(10, 10),
        new Punkt(0, 10)
    });

    Figura innyKwadrat = new Figura(new Punkt[] {
        new Punkt(2, 2),
        new Punkt(4, 2),
        new Punkt(4, 4),
        new Punkt(2, 4)
    });

    Figura trojkat = new Figura(new Punkt[] {
        new Punkt(10, 10),
        new Punkt(20, 20),
        new Punkt(10, 30)
    });

    System.out.println(kwadrat.equals(podobnyKwadrat));
    System.out.println(kwadrat.equals(innyKwadrat));
    System.out.println(kwadrat.equals(trojkat));
    System.out.println(kwadrat.equals("Witaj!"));
    System.out.println(kwadrat.equals(null));
    System.out.println(kwadrat.equals(kwadrat));
  }
}
