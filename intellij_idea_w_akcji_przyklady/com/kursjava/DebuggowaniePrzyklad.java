package com.kursjava;

public class DebuggowaniePrzyklad {
  public static void main(String[] args) {
    int[] liczby = new int[] { 2, 10, 0, -25, 2, 100 };

    System.out.println(znajdz(10, liczby));
    System.out.println(znajdz(2, liczby));
    System.out.println(znajdz(-33, liczby));
  }

  public static int znajdz(int wartosc, int[] tab) {
    for (int i = 1; i <= tab.length; i++) {
      if (tab[i] == wartosc) {
        return i;
      }
    }

    return -1;
  }
}