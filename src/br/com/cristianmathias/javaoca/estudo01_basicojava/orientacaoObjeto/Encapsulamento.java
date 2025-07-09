package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto;
/**
 * Orientação Objeto Encapsulamento =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-09
 * @author Cristian Mathias
 */
public class Encapsulamento {
    //Explicação: os atributos são private (protegidos), e o acesso é feito por métodos get e set.
    private String nome;
    private double preco;

    //Construtor
    public Encapsulamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Encapsulamento produto1 = new Encapsulamento("TV", 1090.00);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());

        //atualizando os dados
        produto1.setNome("Smart-TV");
        produto1.setPreco(2500.00);

        System.out.println("Produto atualizado: " + produto1.getNome());
        System.out.println("Preço atualizado: " + produto1.getPreco());
    }
}
