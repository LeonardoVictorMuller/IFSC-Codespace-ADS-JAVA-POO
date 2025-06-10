package Atividade_4;

import java.util.Scanner;

public class Slide_33 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite a quantidade de anos: ");
    Float anos = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.println(anos + " equivale a " + anos*365+" dias" );

    linhadigitada.close();
  }
}
