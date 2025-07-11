## 1- O que é herança na programação orientada a objetos?

>R:Herança é um mecanismo da programação orientada a objetos em que uma classe "filha" (ou subclasse) herda os atributos e métodos de uma classe "pai" (ou superclasse).
>- Permite reutilizar código
>- Facilita especializações de comportamentos
>- Cria uma relação "é um" (ex: Cachorro é um Animal)
>- A classe filha pode usar, sobrescrever ou estender os comportamentos da classe pai.

## 2- Qual palavra-chave em Java é usada para criar uma relação de herança entre classes?
- (A) this
- (B) extends
- (C) implements
- (D) inherits

>R: B

Explicação:
- Em Java, usamos a palavra-chave extends para indicar que uma classe está herdando de outra.
````java
public class Animal {
    public void fazerSom() {
        System.out.println("Animal faz som");
    }
}

public class Cachorro extends Animal {
    // Herdou o método fazerSom()
}
````
- Agora a classe Cachorro pode usar ou sobrescrever o método fazerSom() da superclasse Animal.


## 3- Uma classe Java pode herdar de quantas outras classes diretamente?
- (A) Apenas uma
- (B) Duas
- (C) Quantas quiser
- (D) Nenhuma

>R: A

Explicação:
- Java não permite herança múltipla de classes (diferente de C++), ou seja, uma classe só pode estender diretamente uma única superclasse.
- Isso evita ambiguidade de métodos e conflitos de hierarquia.


## 4- É possível sobrescrever um método da superclasse na subclasse?
Se sim, como esse recurso se chama?

>R:
>- Sim, é possível — e comum — que uma subclasse sobrescreva (override) um método herdado da superclasse.
>- Esse processo se chama sobrescrita de método (ou method overriding).
>- A sobrescrita permite que a subclasse altere o comportamento de um método da classe pai para algo mais específico.


## 5- O que acontece se você esquecer de usar a anotação @Override ao sobrescrever um método?
- (A) O código não compila
- (B) O método não funciona
- (C) O código compila, mas não há verificação
- (D) A superclasse perde o método original

>R: C

Explicação:
- A anotação @Override não é obrigatória, mas é altamente recomendada.
- Sem ela:
    - O método pode ser sobrescrito corretamente, mas
    - Se você errar a assinatura (nome, tipo de retorno ou parâmetros), o Java não avisa e você acaba criando um método novo, sem perceber.


## 6- Qual é o nome da classe da qual todas as outras herdam indiretamente em Java?
- (A) Main
- (B) Object
- (C) Superclass
- (D) Root

>R: B

explicação:
- Em Java, toda classe herda direta ou indiretamente da classe java.lang.Object, mesmo que você não declare isso explicitamente

- A classe Object fornece métodos básicos como:
    - toString()
    - equals(Object obj)
    - hashCode()
    - getClass()
- Você pode sobrescrever esses métodos para personalizar o comportamento da sua classe.

## 7- Na herança, qual palavra-chave é usada na subclasse para acessar membros (atributos ou métodos) da superclasse?
- (A) super
- (B) this
- (C) extends
- (D) parent

>R: A

Explicação:
- A palavra-chave super em Java é usada dentro da subclasse para:

  1-Acessar membros (métodos ou atributos) da superclasse, como em:
  - super.metodoDaSuperclasse();
  
  2-Chamar o construtor da superclasse, como em:
  - super(param1, param2);

Exemplo:
````java
public class Animal {
    public void fazerSom() {
        System.out.println("Animal faz som");
    }
}

public class Cachorro extends Animal {
    public void fazerSom() {
        super.fazerSom(); // Chama o método da superclasse
        System.out.println("Cachorro late");
    }
}
````

## 8- Se a superclasse tiver um construtor que exige parâmetros, o que a subclasse deve fazer?
- (A) Criar um construtor vazio
- (B) Nada, o Java cuida disso
- (C) Usar super(...) com os argumentos no construtor da subclasse
- (D) Tornar os atributos públicos na superclasse

>R: C

Explicação:
- Se a superclasse não tiver um construtor padrão (sem parâmetros), a subclasse é obrigada a chamar explicitamente o construtor da superclasse com os argumentos corretos, usando super(...).

Exemplo:
````java
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

public class Aluno extends Pessoa {
    public Aluno(String nome) {
        super(nome); // obrigatório! Chama o construtor da superclasse
    }
}
````
- Se você não usar super(nome), o compilador acusará erro, pois não existe um construtor padrão em Pessoa.

## 9- Se a subclasse sobrescreve um método da superclasse, ela ainda pode chamar a versão original do método da superclasse? Se sim, como?

>R: Sim, a subclasse pode chamar a versão original de um método sobrescrito da superclasse usando a palavra-chave super.

Exemplo:
````java
public class Animal {
    public void fazerSom() {
        System.out.println("Animal faz som");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        super.fazerSom(); // Chama o método da superclasse
        System.out.println("Cachorro late");
    }
}
````
Saída:
````bash
 Animal faz som
 Cachorro late
````

## 10- Qual das opções melhor descreve a relação entre duas classes que usam herança?

- (A) A classe filha copia o código da classe pai
- (B) A classe filha estende e reutiliza o comportamento da classe pai
- (C) A classe filha exclui os métodos da classe pai
- (D) A classe filha ignora a classe pai completamente

>R:
>- Herança em Java é usada para reutilizar código e especializar comportamentos. A subclasse não copia o código, mas herda os métodos e atributos da superclasse — podendo:
>    - Usá-los diretamente
>    - Sobrescrevê-los (@Override)
>    - Estendê-los (adicionando mais funcionalidades)
>- Isso promove o reuso de código, evita duplicação e torna o sistema mais organizado.
