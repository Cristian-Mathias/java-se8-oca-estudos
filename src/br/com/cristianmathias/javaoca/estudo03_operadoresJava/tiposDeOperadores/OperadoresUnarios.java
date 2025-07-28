package br.com.cristianmathias.javaoca.estudo03_operadoresJava.tiposDeOperadores;
/**
 * Operadores em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-28
 * @author Cristian Mathias
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Valor inicial: " + numero);

        // Pré-incremento: incrementa antes de usar
        int resultadoPreIncremento = ++numero;
        System.out.println("\nPré-incremento (++numero):");
        System.out.println("numero agora vale: " + numero);
        System.out.println("resultadoPreIncremento: " + resultadoPreIncremento);

        // Pós-incremento: usa depois incrementa
        int resultadoPosIncremento = numero++;
        System.out.println("\nPós-incremento (numero++):");
        System.out.println("resultadoPosIncremento (antes de incrementar): " + resultadoPosIncremento);
        System.out.println("numero agora vale: " + numero);

        // Pré-decremento: decrementa antes de usar
        int resultadoPreDecremento = --numero;
        System.out.println("\nPré-decremento (--numero):");
        System.out.println("numero agora vale: " + numero);
        System.out.println("resultadoPreDecremento: " + resultadoPreDecremento);

        // Pós-decremento: usa depois decrementa
        int resultadoPosDecremento = numero--;
        System.out.println("\nPós-decremento (numero--):");
        System.out.println("resultadoPosDecremento (antes de decrementar): " + resultadoPosDecremento);
        System.out.println("numero agora vale: " + numero);
    }
}
