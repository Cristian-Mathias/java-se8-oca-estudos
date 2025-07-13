package br.com.cristianmathias.javaoca.estudo01_basicojava.escopoVariavel;
/**
 * Escopo de Variáveis =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-04
 * @author Cristian Mathias
 */

public class EscopoVariavel {
    int numeroClasse = 100; // variável de instância (visível em toda a classe)
    static int numeroClasseEstatica = 200;  // variável de classe (static)

    public void metodo() {
        int numeroLocal = 50; // variável local (visível só dentro do método)
        if (true) {
            int numeroBloco = 20; //variável de bloco (visível só dentro do if)
            System.out.println("Dentro do bloco if: " + numeroBloco);
        }
        System.out.println("Dentro do método: " + numeroLocal);
        System.out.println("Acessando variável de instância: " + numeroClasse);
        System.out.println("Acessando variável de classe (estática): " + numeroClasseEstatica);
    }

    public static void main(String[] args) {
        EscopoVariavel escopo = new EscopoVariavel();
        escopo.metodo();
    }
}
