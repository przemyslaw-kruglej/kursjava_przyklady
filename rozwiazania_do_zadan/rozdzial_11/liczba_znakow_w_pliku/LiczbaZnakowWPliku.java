import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LiczbaZnakowWPliku {
  public static void main(String[] args) {
    File f = new File(pobierzLokalizacjePliku());
    int liczbaZnakow = 0;

    try (FileReader fileReader = new FileReader(f)) {
      while (fileReader.read() != -1) {
        liczbaZnakow++;
      }

      System.out.println("Liczba znakow: " + liczbaZnakow);
    } catch(FileNotFoundException e) {
      System.out.println("Podany plik nie istnieje!");
    } catch (IOException e) {
      System.out.println(
          "Wystapil blad podczas odczytywania pliku: " + e.getMessage()
      );
    }
  }

  public static String pobierzLokalizacjePliku() {
    String sciezkaDoPliku;

    while (true) {
      System.out.print("Podaj lokalizacje pliku txt na dysku: ");
      sciezkaDoPliku = getString();

      if (!sciezkaDoPliku.endsWith(".txt")) {
        System.out.println("Zle rozszerzenie pliku!");
      } else {
        return sciezkaDoPliku;
      }
    }
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }
}
