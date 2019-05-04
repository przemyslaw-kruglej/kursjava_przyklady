public class ZmienneITablica {
  public static void main(String[] args) {
    double[] rzeczywiste = new double[5];
    rzeczywiste[0] = 3.14;

    double[] drugaTablica = rzeczywiste;
    drugaTablica[0] = 5;

    System.out.println("Pierwszy element rzeczywiste: " + rzeczywiste[0]);
    System.out.println("Pierwszy element drugaTablica: " + drugaTablica[0]);
  }
}
