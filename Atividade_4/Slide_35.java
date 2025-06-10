package Atividade_4;

import java.util.Scanner;

public class Slide_35 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite o a da funcao do segundo grau: ");
    Float a = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite o b da funcao do segundo grau: ");
    Float b = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite o c da funcao do segundo grau: ");
    Float c = linhadigitada.nextFloat(); // Lê toda a linha de texto

    float delta = b * b - 4 * a * c;
    if (delta >= 0) {
      System.out.println("A primeira solucao é " + (-b + java.lang.Math.sqrt(delta))/2*a + " a outra soluçao é "+ (-b
          - java.lang.Math.sqrt(delta)) / 2 * a);
    }else{
      System.out.println("Nao exite soluçao real para essa funcao");}

    linhadigitada.close();
  }
}
