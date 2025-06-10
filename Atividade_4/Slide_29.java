package Atividade_4;

import java.util.Scanner;

public class Slide_29 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite a quantas horas: ");
    Float horas = linhadigitada.nextFloat(); // Lê toda a linha de texto

  

    System.out.println("As " + horas+ " horas é iguas a " + horas * 60 + " minutos ");

    linhadigitada.close();
  }
}
