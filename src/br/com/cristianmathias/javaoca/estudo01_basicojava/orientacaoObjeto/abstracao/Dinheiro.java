package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.abstracao;

//Subclasse Dinheiro
public class Dinheiro extends Pagamento{

    public Dinheiro(double preco) {
        super(preco);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagando R$ " + preco + " em dinheiro.");
        confirmarPagamento();
    }
}
