package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.variaveisPrimitivasVariaveisReferencia;
/**
 * Variáveis Primitivas em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-14
 * @author Cristian Mathias
 */
public class VariaveisPrimitivas {
    public static void main(String[] args) {
        int x = 10;
        int  y = x; // cópia do valor

         x = 20;

        System.out.println(y); //y ainda é 10
        System.out.println(x); // x 20
    }
    // Em Java, tipos primitivos têm uma cópia direta do valor — ou seja:
    // Eles armazenam o valor em si, não uma referência.
}
