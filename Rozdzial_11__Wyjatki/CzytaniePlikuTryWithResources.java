import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CzytaniePlikuTryWithResources {
  public static void main(String[] args) {
    File f = new File("C:/programowanie/powitanie.txt");

    try (FileReader fileReader = new FileReader(f)) {
      int odczytanyZnak;

      while ((odczytanyZnak = fileReader.read()) != -1) {
        System.out.print((char) odczytanyZnak);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
