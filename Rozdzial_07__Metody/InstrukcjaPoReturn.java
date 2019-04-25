public class InstrukcjaPoReturn {
    public static void main(String[] args) {
        int kwadrat = liczbaDoKwadratu(10);
    }

    // kod sie nie skompiluje, poniewaz kompilator
    //  wykryl instrukcje, ktora nie ma szansy sie wykonac
    public static int liczbaDoKwadratu(int x) {
        return x * x;

        // linia po return nie ma szansy sie wykonac
        System.out.println("Instrukcja po return!");
    }
}
