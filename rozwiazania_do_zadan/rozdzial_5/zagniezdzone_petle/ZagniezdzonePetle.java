public class ZagniezdzonePetle {
  public static void main(String[] args) {
    glowna_petla:
    for (int i = 1; i <= 10; i++) {
      // wymaganie 1: petla glowna pomija swoje
      // iteracje, gdy jej zmienna jest nieparzysta
      if (i % 2 == 1) {
        continue;
      }

      for (int j = 1; j <= 10; j++) {
        System.out.print(j + " ");

        // wymganie 2: petla zagniezdzona
        // powoduje zakonczenie iteracji glownej petli
        // gdy wartosc zmiennej petli zagniezdzonej
        // jest wieksza od wartosci petli glownej
        if (j > i) {
          continue glowna_petla;
        }
      }
    }
  }
}