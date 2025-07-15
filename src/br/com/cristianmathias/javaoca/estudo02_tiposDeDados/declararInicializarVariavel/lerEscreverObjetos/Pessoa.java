package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.lerEscreverObjetos;
/**
 * Ler Escrever em campos de Obejetos Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-15
 * @author Cristian Mathias
 */
public class Pessoa {
    String nome = "Pedro";
    String sobreNome = "Silva";

    public static void main(String[] args) {

        // Exemplo 1: Dois objetos diferentes
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // Imprime a representação padrão do objeto
        // Saída: Pessoa@<hashCode em hexadecimal>
        // ⚠️ Observação:
        // O valor exibido após o @ (como 6acbcfc0) é baseado em p1.hashCode().
        // A cada vez que você executar o programa, o valor pode ser diferente,
        // pois a JVM gera esse hash dinamicamente com base na identidade do objeto.
        //
        System.out.println("p1 = " + p1);//Pessoa@6acbcfc0
        System.out.println("p2 = " + p2);//Pessoa@5f184fc6

        p2.nome = "Marlene"; // altera apenas p2

        System.out.println("Exemplo 1:");
        System.out.println("p1.nome = " + p1.nome + " " + p1.sobreNome); // Pedro Silva
        System.out.println("p2.nome = " + p2.nome + " " + p2.sobreNome); // Marlene Silva

        //Exemplo 2: Duas referências para o mesmo objeto
        Pessoa p3 = new Pessoa();
        Pessoa p4 = p3; // p4 aponta para o mesmo objeto de p3

        System.out.println("p3 = " + p3);// Pessoa@3feba861
        System.out.println("p4 = " + p4);// Pessoa@3feba861

        p4.nome = "Laura"; // altera o objeto que ambos apontam

        System.out.println("Exemplo 2:");
        System.out.println("p3.nome = " + p3.nome + " " + p3.sobreNome);// Laura Silva
        System.out.println("p4.nome = " + p4.nome + " " + p4.sobreNome);// Laura Silva

        // Exemplo 3: Verificação de identidade (mesmo objeto?)
        System.out.println("Exemplo 3:");
        System.out.println("p1 == p2 ? " + (p1 == p2)); // false
        System.out.println("p3 == p4 ? " + (p3 == p4)); // true
        System.out.println("p1 == p3 ? " + (p1 == p3)); // false

    }
}
