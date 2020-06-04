package com.kursjava;

public class DebuggowaniePrzyklad {
  public static void main(String[] args) {
    int[] liczby = new int[] { 2, 10, 0, -25, 2, 100 };

    System.out.println(znajdz(10, liczby));
    System.out.println(znajdz(2, liczby));
    System.out.println(znajdz(-33, liczby));
  }

  /*
    W tej metodzie są trzy celowe problemy związane ze zmienną pętli:

      1. Inicjalizujemy ją wartością 1, zamiast 0,
         więc zawsze pominiemy pierwszy element tablicy.

      2. Jeżeli tablica posiada tylko jeden element,
         to w związku z punktem nr 1, wyjdziemy w pierwszym obiegu
         pętli poza zakres tablicy (bo jedyny element w tablicy
         jednoelementowej ma indeks 0, a zmienna pętli ma na początku
         ustawianą wartość 1).

      3. Warunek zakończenia pętli jest nieprawidłowy – powinniśmy
         użyć operatora < zamiast <=. Jeżeli szukanej liczby
         nie będzie w tablicy, to wykonanie tej metody zakończy się
         wyjątkiem ArrayIndexOutOfBoundsException.

   */
  public static int znajdz(int wartosc, int[] tab) {
    for (int i = 1; i <= tab.length; i++) {
      if (tab[i] == wartosc) {
        return i;
      }
    }

    return -1;
  }
}