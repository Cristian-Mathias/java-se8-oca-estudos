package br.com.cristianmathias.javaoca.estudo03_operadoresJava.tiposDeOperadores;
/**
 * Operadores em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-28
 * @author Cristian Mathias
 */
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean igualA = a == b;
        boolean diferenteD = a != b;
        boolean maiorQue = a > b;
        boolean menorQue = a < b;
        boolean maiorIagualA = a >= b;
        boolean menorIagualA = a <= b;

        System.out.println("a = " + a + ", b = " + b);

        // Operadores relacionais
        System.out.println("a == b " + igualA);
        System.out.println("a != b " + diferenteD);
        System.out.println("a > b " + maiorQue);
        System.out.println("a < b " + menorQue);
        System.out.println("a >= b " + maiorIagualA);
        System.out.println("a <= b " + menorIagualA);
    }
}
