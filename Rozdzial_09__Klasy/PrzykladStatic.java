public class PrzykladStatic {
  private int poleInstancji;

  private static int poleStatyczne = 5;

  public PrzykladStatic(int poleInstancji) {
    this.poleInstancji = poleInstancji;
  }

  public static void main(String[] args) {
    System.out.println("Pole statyczne (przez klase): " +
        PrzykladStatic.poleStatyczne // 1
    );

    PrzykladStatic obiekt1 = new PrzykladStatic(10);

    System.out.println("Pole statyczne (przez obiekt1): " +
        obiekt1.poleStatyczne // 2
    );

    PrzykladStatic obiekt2 = new PrzykladStatic(15);

    obiekt2.poleStatyczne = -20; // 3

    System.out.println("Pole statyczne po zmianie (przez klase): " +
        PrzykladStatic.poleStatyczne // 4
    );

    System.out.println("Pole statyczne po zmianie (przez obiekt1): " +
        PrzykladStatic.poleStatyczne // 5
    );

    System.out.println("Pole statyczne po zmianie (przez obiekt2): " +
        PrzykladStatic.poleStatyczne // 6
    );
  }
}
