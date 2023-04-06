package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Class ConverteBytes.
 */
public class ConverteBytes {

  /**
   * Initial Method.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();

    int qtdBits = valor * 8;

    System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");
    scan.close();
  }
}
