package br.com.cristianmathias.javaoca.estudo03_operadoresJava;
/**
 * Operadores em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-28
 * @author Cristian Mathias
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println("condicao1 = " + condicao1 + ", condicao2 = " + condicao2);

        // Operadores lógicos
        System.out.println("condicao1 && condicao2 : " + (condicao1 && condicao2)); // AND lógico
        System.out.println("condicao1 || condicao2 : " + (condicao1 || condicao2)); // OR lógico
        System.out.println("!condicao1 : " + (!condicao1)); // NOT lógico
        System.out.println("!condicao2 : " + (!condicao2));

        /*
        * - && → AND lógico (verdadeiro se ambas as condições forem verdadeiras)
          - || → OR lógico (verdadeiro se pelo menos uma condição for verdadeira)
          - ! → NOT lógico (inverte o valor lógico)
        */

        // Exemplo prático
        int idade = 20;
        boolean maiorDeIdade = idade >= 18;
        boolean possuiCarteira = true;

        System.out.println("\nExemplo prático: ");
        System.out.println("Pode dirigir? " + (maiorDeIdade && possuiCarteira));
        System.out.println("É menor OU não tem carteira? " + (!maiorDeIdade || !possuiCarteira));
    }
}
