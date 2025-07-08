package br.com.cristianmathias.javaoca.estudo01_basicojava;
/**
 * Método Principal (Main) =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-08
 * @author Cristian Mathias
 */
public class MetodoMain {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao programa Java!");
        System.out.println("Argumentos recebidos:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);
        }
    }
}
