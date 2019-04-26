public class Punkt {
    public void ustawX(int wartoscX) {
        x = wartoscX;
    }

    private int x;

    public void ustawY(int wartoscY) {
        y = wartoscY;
    }

    public String toString() {
        return "X: " + x + ", Y: " + y;
    }

    private int y;
}
