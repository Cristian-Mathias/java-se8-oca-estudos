package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel;
/**
 * Declarar e Inicializar Variáveis Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-13
 * @author Cristian Mathias
 */
public class DeclararInicializarVariavel {
    // Declaração e inicialização com valor literal
    int idade = 25;
    double salario = 5500.00;
    boolean ativo = true;
    char sexo = 'M';
    String nome = "Mathias";

    // Inicialização com outra variável
    int idadeFutura = idade + 5;

    public static void main(String[] args) {
        // Declaração separada da inicialização
        int ano;
        ano = 2025;

       DeclararInicializarVariavel variavel = new DeclararInicializarVariavel();
       System.out.println("========");
       System.out.println("Declaração separada da inicialização " + ano);
       System.out.println("========");
       System.out.println("Inicialização com outra variável " + variavel.idadeFutura);
       System.out.println("========");
        System.out.println(
                "Declaração e inicialização com valor literal {\n" +
                        "  nome = '" + variavel.nome + "',\n" +
                        "  idade = " + variavel.idade + ",\n" +
                        "  sexo = '" + variavel.sexo + "',\n" +
                        "  salario = " + variavel.salario + ",\n" +
                        "  ativo = " + variavel.ativo + "\n" +
                        "}"
        );

    }
}
