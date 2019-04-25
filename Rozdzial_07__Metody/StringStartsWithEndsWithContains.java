public class StringStartsWithEndsWithContains {
    public static void main(String[] args) {
        String s = "Ala ma kota";

        System.out.println("Czy string zaczyna sie od 'Ala'? " + s.startsWith("Ala"));
        System.out.println("Czy string zaczyna sie od 'ala'? " + s.startsWith("ala"));

        System.out.println("Czy string konczy sie na 'kota'? " + s.endsWith("kota"));

        System.out.println("Czy zawiera 'ma'? " + s.contains("ma"));
        System.out.println("Czy zawiera 'kot'? " + s.contains("kot"));
        System.out.println("Czy zawiera 'ala'? " + s.contains("ala"));
        System.out.println("Czy zawiera 'ala'? " + s.toLowerCase().contains("ala"));
    }
}
