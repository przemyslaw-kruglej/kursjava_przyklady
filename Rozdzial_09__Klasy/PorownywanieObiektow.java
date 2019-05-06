public class PorownywanieObiektow {
  public static void main(String[] args) {
    Osoba o1 = new Osoba("Jan", "Nowak", 25);
    Osoba o2 = o1;
    Osoba o3 = new Osoba("Jan", "Nowak", 25);
    Osoba o4 = new Osoba(null, "Nowak", 40);
    String powitanie = "Witajcie!";

    if (o1.equals(null)) {
      System.out.println("o1 to null");
    } else {
      System.out.println("o1 nie jest nullem");
    }

    if (o1.equals(o2)) {
      System.out.println("o1 i o2 sa rowne");
    } else {
      System.out.println("o1 i o2 nie sa rowne");
    }

    if (o1.equals(o3)) {
      System.out.println("o1 i o3 sa rowne");
    } else {
      System.out.println("o1 i o3 nie sa rowne");
    }

    if (o4.equals(o3)) {
      System.out.println("o3 i o4 sa rowne");
    } else {
      System.out.println("o3 i o4 nie sa rowne");
    }

    if (o1.equals(powitanie)) {
      System.out.println("o1 i powitanie sa rowne");
    }

    Osoba x = new Osoba("Jan", "Kowalski", 20);
    Osoba y = new Osoba("Jan", "Kowalski", 30);
    Osoba z = new Osoba("Jan", "Kowalski", 20);

    System.out.println("x rowne y? " + x.equals(y));
    System.out.println("x rowne z? " + x.equals(z));
    System.out.println("x rowne null? " + x.equals(null));
    System.out.println("x rowne 'Witajcie!'? " + x.equals("Witajcie!"));

    Osoba a = new Osoba(null, null, 30);
    Osoba b = new Osoba(null, null, 30);

    System.out.println("a rowne b? " + a.equals(b));
    System.out.println("a rowne x? " + a.equals(x));
  }
}
