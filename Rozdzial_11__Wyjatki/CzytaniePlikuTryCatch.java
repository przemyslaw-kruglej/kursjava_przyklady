import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CzytaniePlikuTryCatch {
  public static void main(String[] args) {
    File f = new File("C:/programowanie/powitanie.txt");
    FileReader fileReader = null;

    try {
      fileReader = new FileReader(f);
      int odczytanyZnak;

      while ((odczytanyZnak = fileReader.read()) != -1) {
        System.out.print((char) odczytanyZnak);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (fileReader != null) {
          fileReader.close();
        }
      } catch (IOException e) {
        System.out.println(
            "Blad podczas zamykania strumienia: " + e.getMessage()
        );
      }
    }
  }
}
