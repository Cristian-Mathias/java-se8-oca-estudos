package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.abstracao;

//Classe abstrata Pagamento
public abstract class Pagamento {
    protected double preco;

    public Pagamento(double preco) {
        this.preco = preco;
    }

    // Método concreto: tem implementação
    public void confirmarPagamento(){
        System.out.println("Pagamento de R$ " + preco + " confirmado.");
    }

    // Método abstrato: será implementado por subclasses
    public abstract void realizarPagamento();


}
