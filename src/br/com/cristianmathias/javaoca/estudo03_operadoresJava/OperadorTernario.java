package br.com.cristianmathias.javaoca.estudo03_operadoresJava;
/**
 * Operadores em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-28
 * @author Cristian Mathias
 */
public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 18;

        // Usando if-else tradicional
        String situacao;

        if (idade >= 18){
            situacao = "Maior de idade";
        }else {
            situacao = "Menor de idade";
        }
        System.out.println("Com if-else: " + situacao);

        // Usando operador ternário
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Com operador ternário: " + resultado);

        // Outro exemplo com números
        int a = 10, b = 20;
        int maior = (a > b) ? a : b;
        System.out.println("Maior valor entre " + a + " e " + b + " é: " + maior);
    }
}
