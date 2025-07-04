package Atividade_5;

import java.util.Scanner;

public class questao12 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite o nome : ");
    String nome = linhadigitada.next(); // Lê toda a linha de texto

    System.out.print("Digite o peso: ");
    Float peso = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite a altura em metros: ");
    Float altura = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.println("Nome: " + nome);
    System.out.println("Peso: " + peso + " Kg");
    System.out.println("Altura: " + altura+" m");

    System.out.printf("IMC: %.2f%n", peso/(altura*altura));

    linhadigitada.close();
  }
}