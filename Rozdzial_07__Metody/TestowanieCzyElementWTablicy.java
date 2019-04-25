public class TestowanieCzyElementWTablicy {
    public static void main(String[] args) {
        czyZawieraElement_pustaTablica_zwrociFalse();
        czyZawieraElement_brakSzukanegoElementu_zwrociFalse();
        czyZawieraElement_zawieraSukanyElement_zwrociTrue();
        czyZawieraElement_zawieraSukanyElementNaPoczatku_zwrociTrue();
        czyZawieraElement_zawieraSukanyElementNaKoncu_zwrociTrue();
    }

    public static boolean czyZawieraElement(int[] tablica, int liczba) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == liczba) {
                return true;
            }
        }

        return false;
    }

    public static void czyZawieraElement_pustaTablica_zwrociFalse() {
        // given
        int[] pustaTablica = {};
        int liczba = 5;

        // when
        boolean czyZawiera = czyZawieraElement(pustaTablica, liczba);

        // then
        if (czyZawiera) {
            System.out.println("Blad! Pusta tablica nie powinna nic zawierac.");
        }
    }

    public static void czyZawieraElement_brakSzukanegoElementu_zwrociFalse() {
        // given
        int[] tablica = {-20, 100, 500};
        int liczba = 128;

        // when
        boolean czyZawiera = czyZawieraElement(tablica, liczba);

        // then
        if (czyZawiera) {
            System.out.println("Blad! Element 128 nie powinien byc znaleziony.");
        }
    }

    public static void czyZawieraElement_zawieraSukanyElement_zwrociTrue() {
        // given
        int[] tablica = {2, 4, 8, 16, 32, 64, 128, 256};
        int liczba = 128;

        // when
        boolean czyZawiera = czyZawieraElement(tablica, liczba);

        // then
        if (!czyZawiera) {
            System.out.println("Blad! Element 128 powinien byc znaleziony.");
        }
    }

    public static void czyZawieraElement_zawieraSukanyElementNaPoczatku_zwrociTrue() {
        // given
        int[] tablica = {100, 200, 300};
        int liczba = 100;

        // when
        boolean czyZawiera = czyZawieraElement(tablica, liczba);

        // then
        if (!czyZawiera) {
            System.out.println("Blad! Element 100 powinien byc znaleziony.");
        }
    }

    public static void czyZawieraElement_zawieraSukanyElementNaKoncu_zwrociTrue() {
        // given
        int[] tablica = {100, 200, 300};
        int liczba = 300;

        // when
        boolean czyZawiera = czyZawieraElement(tablica, liczba);

        // then
        if (!czyZawiera) {
            System.out.println("Blad! Element 300 powinien byc znaleziony.");
        }
    }

    public static void c2zyZawieraElement_zawieraSukanyElementNaKoncu_zwrociTrue() {
        if (!czyZawieraElement(new int[] {100, 200, 300}, 300)) {
            System.out.println("Blad! Element 300 powinien byc znaleziony.");
        }
    }
}
