package br.com.cristianmathias.javaoca.estudo01_basicojava.estruturaClasse;
/**
 * Estrutura de Classe =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-07
 * @author Cristian Mathias
 */
public class EstruturaClasse {
    private String nome;
    private int idade;

    // Construtor
    public EstruturaClasse(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void fazerAniversario() {
        idade++;
    }

    // Getter
    public int getIdade() {
        return idade;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        EstruturaClasse pessoa = new EstruturaClasse(20,"Pedro");
        // Usando métodos getters
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        // Fazendo aniversário
        pessoa.fazerAniversario();
        // Mostrando idade atualizada
        System.out.println("Após aniversário, idade: " + pessoa.getIdade());
    }
}
