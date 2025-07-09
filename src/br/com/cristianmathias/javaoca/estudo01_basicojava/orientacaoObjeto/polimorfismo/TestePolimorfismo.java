package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.polimorfismo;
/**
 * Orientação Objeto Polimorfismo =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-09
 * @author Cristian Mathias
 */

// Classe de teste (com polimorfismo em ação)
public class TestePolimorfismo {
    public static void main(String[] args) {

        // Polimorfismo: a variável é do tipo Animal, mas armazena um Cachorro
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();

        // Comportamento dinâmico: o método correto é chamado com base no objeto real
        meuAnimal1.emitirSom();//O cachorro late: Au Au!
        meuAnimal2.emitirSom();//O gato mia: Miau Miau!
        System.out.println("----------------");
        // Exemplo com array para mostrar polimorfismo em coleção
        Animal[] animais = { new Cachorro(), new Gato(), new Animal() };
        for (Animal a : animais) {
            a.emitirSom(); // Cada um chama seu próprio método sobrescrito
        }
    }
}
