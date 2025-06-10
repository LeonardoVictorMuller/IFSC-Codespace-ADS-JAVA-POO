package Atividade_4;

import java.util.Scanner;



public class Slide_28 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite a altura: ");
    Float altura = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite a base do triangulo: ");
    Float base = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.println("A area do triangulo é " + base*altura/2);

    linhadigitada.close();
  }
}