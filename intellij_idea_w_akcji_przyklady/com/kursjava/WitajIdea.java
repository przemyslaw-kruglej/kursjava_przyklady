package com.kursjava;

import java.util.Scanner;

public class WitajIdea {
  private int pewnePole;

  public static void main(String[] args) {
    String imie;

    // TODO sprawdzic, czy nie ma wiecej argumentow
    if (args.length == 1) {
      imie = args[0];
    } else {
      System.out.println("Podaj imie:");
      imie = getString();
    }

    System.out.println(String.format("Witaj %s!", imie));
  }

  public static String getString() {
    return new Scanner(System.in).next();
  }

  public int getPewnePole() {
    return pewnePole;
  }

  public void setPewnePole(int pewnePole) {
    this.pewnePole = pewnePole;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
