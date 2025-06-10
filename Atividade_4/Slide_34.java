package Atividade_4;

import java.util.Scanner;

public class Slide_34 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite a quantidade de dolares para real: ");
    Float dolar = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.println(dolar + "dolares e quivale a " + dolar*5.56+ " reais"  );

    linhadigitada.close();
  }
}
