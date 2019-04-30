public class MetodaSumujacaLiczbyWTablicy {
  public static void main(String[] args) {
    int[] tab1 = { 1, 7, 20, 100 };
    int[] tab2 = { }; // tablica z zeroma elementami
    int[] tab3 = { -1, 0, 1 };

    System.out.println("Suma liczb tab1: " + sumaLiczb(tab1));
    System.out.println("Suma liczb tab2: " + sumaLiczb(tab2));
    System.out.println("Suma liczb tab3: " + sumaLiczb(tab3));
  }

  public static int sumaLiczb(int[] tab) {
    int suma = 0;

    for (int i : tab) {
      suma += i;
    }

    return suma;
  }
}