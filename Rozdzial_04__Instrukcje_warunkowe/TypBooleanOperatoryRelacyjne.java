public class TypBooleanOperatoryRelacyjne {
  public static void main(String[] args) {
    int pewnaLiczba = 100;
    int temperatura = 10;
    int innaLiczba = -1;
    int dzienTygodnia = 3;

    boolean czyUjemna;
    boolean czyJestCieplo;
    boolean czyRozneOdZero;
    boolean czySobota;

    czyUjemna = pewnaLiczba < 0;
    czyJestCieplo = temperatura >= 20;
    czyRozneOdZero = innaLiczba != 0;
    czySobota = dzienTygodnia == 6;
  }
}
