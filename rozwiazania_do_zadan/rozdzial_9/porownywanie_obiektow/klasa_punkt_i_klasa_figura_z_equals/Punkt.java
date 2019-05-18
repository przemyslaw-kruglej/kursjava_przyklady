public class Punkt {
  private int x;
  private int y;

  public Punkt(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    Punkt other = (Punkt) o;

    return this.x == other.x && this.y == other.y;
  }

  public static void main(String[] args) {
    Punkt p1 = new Punkt(10, 20);
    Punkt p2 = new Punkt(10, 20);
    Punkt p3 = new Punkt(10, -5);
    Punkt p4 = new Punkt(0, 20);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(null));
    System.out.println(p1.equals(p1));
  }
}