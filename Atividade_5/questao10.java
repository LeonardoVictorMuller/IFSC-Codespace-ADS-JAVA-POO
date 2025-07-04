package Atividade_5;

import java.util.Scanner;

public class questao10 {
  public static void main(String[] args) {
    Scanner linhadigitada = new Scanner(System.in);

    System.out.print("Digite o nome do produto: ");
    String nome = linhadigitada.next(); // Lê toda a linha de texto

    System.out.print("Digite o codigo  : ");
    int codigo = linhadigitada.nextInt(); // Lê toda a linha de texto

    System.out.print("Digite o preço do produto : ");
    Float precounitario = linhadigitada.nextFloat(); // Lê toda a linha de texto

    System.out.print("Digite a quantidade do produto em estoque   : ");
    int quantidade = linhadigitada.nextInt(); // Lê toda a linha de texto

    System.out.print("Digite o produto esta ativo : ");
    boolean ativo = linhadigitada.nextBoolean(); // Lê toda a linha de texto


    System.out.println("O valor do produto em estoque é " + quantidade * precounitario);

    System.out.println("\n Produto: " + nome);
    System.out.println("\n codigo: "+ codigo);
    System.out.println("\n preço: " + precounitario);
    System.out.println("\n quantidade em estoque: " + precounitario);
    System.out.println("\n esta ativo: " + ativo);
    
    System.out.printf("preço unitario %.2f%n", precounitario);

    linhadigitada.close();
  }
}