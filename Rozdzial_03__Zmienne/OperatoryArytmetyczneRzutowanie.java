public class OperatoryArytmetyczneRzutowanie {
  public static void main(String[] args) {
    // dodanie wartosci po przecinku powoduje,
    // ze liczba 10.0 jest traktowana jako rzeczywista
    // w takim przypadku, operatora dzielenia zwroci liczbe rzeczywista
    System.out.println(10.0 / 4);

    // rzutowanie literalu liczby calkowitej na rzeczywista
    // wynik jak powyzej - liczba rzeczywista
    System.out.println((double)10 / 4);

    int liczbaCalkowita = 10;
    int innaLiczbaCalkowita = 4;

    // rzutowanie zmiennej calkowitej na rzeczywista
    // ponownie wynikiem bedzie liczba rzeczywista
    System.out.println(liczbaCalkowita / (double)innaLiczbaCalkowita);
  }
}