package Atividade_4;

import java.util.Scanner;

public class Slide_30 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite os minutos: ");
    Float minutos = linhadigitada.nextFloat(); // Lê toda a linha de texto

  

    System.out.println("Os " + minutos+ " minutos é iguas a " + minutos/60 + " horas ");

    linhadigitada.close();
  }
}
