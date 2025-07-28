package br.com.cristianmathias.javaoca.estudo03_operadoresJava;
/**
 * Operadores em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-28
 * @author Cristian Mathias
 */
public class OperadoresBitwise {
    public static void main(String[] args) {
        int a = 5;  // 0101 em binário
        int b = 3;  // 0011 em binário

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")\n");

        // Operações bit a bit
        System.out.println("a & b  (AND)   = " + (a & b) + " (" + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b  (OR)    = " + (a | b) + " (" + Integer.toBinaryString(a | b) + ")");
        System.out.println("a ^ b  (XOR)   = " + (a ^ b) + " (" + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("~a     (NOT)   = " + (~a) + " (" + Integer.toBinaryString(~a) + ")");

        // Operadores de shift
        System.out.println("\nDeslocamento de bits:");
        System.out.println("a << 1 (shift left)  = " + (a << 1) + " (" + Integer.toBinaryString(a << 1) + ")");
        System.out.println("a >> 1 (shift right) = " + (a >> 1) + " (" + Integer.toBinaryString(a >> 1) + ")");
        System.out.println("a >>> 1 (shift right sem sinal) = " + (a >>> 1) + " (" + Integer.toBinaryString(a >>> 1) + ")");
    }
}
