package br.com.cristianmathias.javaoca.estudo01_basicojava;

/*
Escopo de Variáveis =>
O escopo de uma variável define onde ela pode ser usada (acessada) dentro do código.
*/

public class EscopoVariavel {
    int numeroClasse = 100; // variável de instância (visível em toda a classe)

    public void metodo() {
        int numeroLocal = 50; // variável local (visível só dentro do método)
        if (true) {
            int numeroBloco = 20; // visível só dentro do if
            System.out.println("Dentro do if: " + numeroBloco);
        }
        System.out.println("Dentro do método: " + numeroLocal);
        System.out.println("Acessando variável de instância: " + numeroClasse);
    }

    public static void main(String[] args) {
        EscopoVariavel escopo = new EscopoVariavel();
        escopo.metodo();
    }
}
