package Atividade_4;

import java.util.Scanner;

public class Slide_31 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite a nota1 ");
    Float nota1 = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite a nota2 ");
    Float nota2 = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite a nota3 ");
    Float nota3 = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite a nota4 ");
    Float nota4 = linhadigitada.nextFloat(); // Lê toda a linha de texto
  
    float media = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println("A media da nota é " + media );

    linhadigitada.close();
  }
}
