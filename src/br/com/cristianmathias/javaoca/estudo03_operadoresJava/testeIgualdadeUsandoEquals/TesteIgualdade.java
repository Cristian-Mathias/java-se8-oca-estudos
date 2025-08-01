package br.com.cristianmathias.javaoca.estudo03_operadoresJava.testeIgualdadeUsandoEquals;
/**
 * Igualdade entre Strings e outros objetos usando `==` e `equals()`, em Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-08-01
 * @author Cristian Mathias
 */
public class TesteIgualdade {
    public static void main(String[] args) {
        // Comparação com Strings
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        System.out.println("=== Comparando Strings ===");
        System.out.println("s1 == s2: " + (s1 == s2));          // true (mesmo objeto no String Pool)
        System.out.println("s1 == s3: " + (s1 == s3));          // false (objetos diferentes)
        System.out.println("s1.equals(s3): " + s1.equals(s3));  // true (conteúdo igual)

        // Comparação com objetos comuns
        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Pessoa("João");
        Pessoa p3 = p1; // mesma referência

        System.out.println("\n=== Comparando Objetos ===");
        System.out.println("p1 == p2: " + (p1 == p2));          // false (referências diferentes)
        System.out.println("p1 == p3: " + (p1 == p3));          // true (mesma referência)
        System.out.println("p1.equals(p2): " + p1.equals(p2));  // false (equals não sobrescrito)

        // Agora, sobrescrevendo equals em Pessoa, veremos a diferença
        System.out.println("\n=== Após sobrescrever equals ===");
        System.out.println("p1.equals(p2): " + p1.equals(p2));  // true (mesmo nome)
    }
}

class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    // Sobrescrevendo equals para comparar conteúdo lógico
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // mesma referência
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome);
    }
}