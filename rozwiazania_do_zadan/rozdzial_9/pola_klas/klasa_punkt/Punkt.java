public class Punkt {
  private int x;
  private int y;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public String toString() {
    return "Punkt(x: " + x + ", y: " + y + ")";
  }

  public static void main(String[] args) {
    Punkt p = new Punkt();
    p.setX(10);
    p.setY(-5);

    System.out.println(p);
  }
}