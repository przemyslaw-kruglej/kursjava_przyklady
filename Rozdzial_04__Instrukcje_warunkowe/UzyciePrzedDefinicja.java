public class UzyciePrzedDefinicja {
  public static void main(String[] args) {
    // blad! kod sie nie skompiluje - probujemy
    // odniesc sie do zmiennej jeszcze przed jej definicja
    System.out.println("Liczba = " + liczba);

    int liczba = 5;
  }
}