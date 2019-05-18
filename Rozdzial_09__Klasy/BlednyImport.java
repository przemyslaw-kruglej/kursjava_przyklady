// uzycie * nie powoduje, ze zaimportowane zostana klasy
// z pakietow podrzednych - wystapi blad kompilacji,
// poniewaz kompilator nie wie, czym jest 'Powitanie'
import przykladowypakiet.*;

public class BlednyImport {
  public static void main(String[] args) {
    Powitanie.wypiszKomunikat();
  }
}