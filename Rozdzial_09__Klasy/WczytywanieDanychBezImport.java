public class WczytywanieDanychBezImport {
  public static int getInt() {
    // blad kompilacji - brakuje importu klasy Scanner
    return new Scanner(System.in).nextInt();
  }
}