package br.com.cristianmathias.javaoca.estudo03_operadoresJava.tiposDeOperadores;
/**
 * Operadores em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-28
 * @author Cristian Mathias
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Operações básicas
        int soma = a + b;
        int subtracao = a - b;
        int multipicacao = a * b;
        int divisao = a / b; // divisão inteira
        int restoDivisao = a % b; // módulo (resto da divisão)

        // Exibição dos resultados
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multipicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + restoDivisao);
    }
}
