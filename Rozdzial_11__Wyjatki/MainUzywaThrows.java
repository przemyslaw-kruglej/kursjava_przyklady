class PewienWyjatekException extends Exception {

}

public class MainUzywaThrows {
  public static void main(String[] args) throws PewienWyjatekException {
    pewnaMetoda();
  }

  public static void pewnaMetoda() throws PewienWyjatekException {
    // pewne instrukcje ktore powoduja rzucenie wyjatku
    throw new PewienWyjatekException();
  }
}