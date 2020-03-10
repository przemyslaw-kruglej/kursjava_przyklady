public class NieosiagalnyKodRzucanyWyjatek {
  public static void main(String[] args) {
    throw new IllegalArgumentException("Fajrant!");

    // kod sie nie skompiluje - ponizsza instrukcja
    // nie ma szansy sie wykonac
    System.out.println("Witaj Swiecie?");
  }
}
