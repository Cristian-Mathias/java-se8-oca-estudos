package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.abstracao;
/**
 * Orientação Objeto Abstração =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-09
 * @author Cristian Mathias
 */
public class TesteAbstracao {
    public static void main(String[] args) {
        // Criando objetos de subclasses
        Pagamento pagamento1 = new CartaoCredito(250.00,"123456");
        Pagamento pagamento2 = new Dinheiro(350.00);

        // Executando o comportamento abstrato
        pagamento1.realizarPagamento(); // Chama a versão de CartaoCredito
        pagamento2.realizarPagamento(); // Chama a versão de Dinheiro
    }
}
