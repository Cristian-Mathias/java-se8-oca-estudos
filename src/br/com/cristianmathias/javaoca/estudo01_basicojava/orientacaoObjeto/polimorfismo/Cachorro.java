package br.com.cristianmathias.javaoca.estudo01_basicojava.orientacaoObjeto.polimorfismo;

// Classe derivada 1
public class Cachorro extends Animal{

    //anotação @Override indica que um método está sendo sobrescrito de uma classe pai (Classe Animal) ou interface.
    @Override
    public void emitirSom(){
        System.out.println("O cachorro late: Au Au!");
    }
}
