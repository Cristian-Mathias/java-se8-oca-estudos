package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.variaveisPrimitivasVariaveisReferencia;
/**
 * Variáveis Referência em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-14
 * @author Cristian Mathias
 */
public class VariaveisReferencia {
    String nome;

    public static void main(String[] args) {
        VariaveisReferencia pessoa1 = new VariaveisReferencia();
        VariaveisReferencia pessoa2 = pessoa1;

        pessoa1.nome = "Ana";

        System.out.println( "Endereço memória Pessoa 1 => "+ pessoa1);//  imprime endereço da memória @6acbcfc0
        System.out.println("Endereço memória Pessoa 2 => "+ pessoa2);//  imprime endereço da memória @6acbcfc0

        System.out.println("Pessoa 2 => " + pessoa2.nome);// também imprime "Ana"
    }

    /*
    Quando uma variável de referência é atribuída a outra, o que é copiado é a referência, e não o objeto.
    Ou seja, ambas passam a apontar para o mesmo objeto.
     */
}
