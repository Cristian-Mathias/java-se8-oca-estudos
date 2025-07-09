package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.abstracao;

//Subclasse CartaoCredito
public class CartaoCredito extends Pagamento{
    private String numeroCartao;

    public CartaoCredito(double preco, String numeroCartao) {
        super(preco);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagando R$ " + preco + " com cartão de crédito " + numeroCartao);
        confirmarPagamento();
    }
}
