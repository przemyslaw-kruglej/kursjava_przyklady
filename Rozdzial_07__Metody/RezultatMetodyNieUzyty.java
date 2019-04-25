import java.util.Scanner;

public class RezultatMetodyNieUzyty {
    public static void main(String[] args) {
        int liczba = getInt();

        // pobieramy od uzytkownika druga liczbe, ale nigdzie jej nie uzywamy
        getInt();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
