package Atividade_4;

import java.util.Scanner;

public class Slide_32 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite o valor: ");
    Float valor = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite o desconto:  ");
    Float desconto = linhadigitada.nextFloat(); // Lê toda a linha de texto

    float valordeconto = valor - desconto;

    System.out.println("O valor com desconto é " + valordeconto  );

    linhadigitada.close();
  }
}
