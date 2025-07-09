package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.heranca;
/**
 * Orientação Objeto Herança =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-09
 * @author Cristian Mathias
 */

//Explicação: Cachorro herda de Animal, e sobrescreve o método emitirSom.
public class Cachorro extends Animal{

    //anotação @Override indica que um método está sendo sobrescrito de uma classe pai (Classe Animal) ou interface.
    @Override
    public void emitirSom(){
        System.out.println(" Auu...Auu...");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
    }
}
