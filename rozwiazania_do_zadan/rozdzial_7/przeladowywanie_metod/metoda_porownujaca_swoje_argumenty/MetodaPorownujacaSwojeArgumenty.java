public class MetodaPorownujacaSwojeArgumenty {
  public static void main(String[] args) {
    System.out.println("Czy 1 == 2? " + equals(1, 2));
    System.out.println("Czy 0 == 0? " + equals(0, 0));

    System.out.println(
        "Czy 3.14 == 3.14? " + equals(3.14, 3.14)
    );
    System.out.println(
        "Czy 5.55 == 0? " + equals(5.55, 0)
    );

    System.out.println(
        "Czy true == false? " + equals(true, false)
    );
    System.out.println(
        "Czy false == false? " + equals(false, false)
    );

    System.out.println(
        "Czy 'a' == 'A'? " + equals('a', 'A')
    );
    System.out.println(
        "Czy 'x' == 'x'? " + equals('x', 'x')
    );

    System.out.println(
        "Czy kot == Kot? " + equals("kot", "Kot")
    );
    System.out.println(
        "Czy kot == kot? " + equals("kot", "kot")
    );

    int[] tab1 = { 1, 2, 3 };
    int[] tab2 = { 1, 2, 3, 4 };
    int[] tab3 = { 1, 2, 3 };

    System.out.println("Czy tab1 == tab2? " + equals(tab1, tab2));
    System.out.println("Czy tab1 == tab3? " + equals(tab1, tab3));

    String[] str1 = { "Ala", "ma", "kota" };
    String[] str2 = { "ALA", "MA", "KOTA" };
    String[] str3 = { "Ala", "ma", "kota" };

    System.out.println("Czy str1 == str2? " + equals(str1, str2));
    System.out.println("Czy str1 == str3? " + equals(str1, str3));
  }

  public static boolean equals(int a, int b) {
    return a == b;
  }

  public static boolean equals(double a, double b) {
    return a == b;
  }

  public static boolean equals(boolean a, boolean b) {
    return a == b;
  }

  public static boolean equals(char a, char b) {
    return a == b;
  }

  public static boolean equals(String a, String b) {
    return a.equals(b);
  }

  public static boolean equals(int[] a, int[] b) {
    if (a.length != b.length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    return true;
  }

  public static boolean equals(String[] a, String[] b) {
    if (a.length != b.length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      if (!a[i].equals(b[i])) {
        return false;
      }
    }

    return true;
  }
}