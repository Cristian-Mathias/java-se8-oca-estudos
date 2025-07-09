package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.polimorfismo;

public class Gato extends Animal{

    //anotação @Override indica que um método está sendo sobrescrito de uma classe pai (Classe Animal) ou interface.
    @Override
    public void emitirSom(){
        System.out.println("O gato mia: Miau Miau!");
    }
}
