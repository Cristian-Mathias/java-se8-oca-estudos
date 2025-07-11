## 1- O que significa o conceito de abstração na programação orientada a objetos?

>R: Abstração é justamente isso:
>- Esconder os detalhes internos (como o código funciona por dentro) e mostrar só o que é essencial para o uso do objeto, ou seja, a interface pública.
>- Isso ajuda a reduzir a complexidade e torna o sistema mais fácil de entender e usar.

## 2- Qual das opções abaixo representa melhor uma forma de implementar abstração em Java?

- (A) Usar modificadores private para esconder atributos e métodos
- (B) Criar muitos métodos públicos
- (C) Fazer todos os atributos e métodos públicos
- (D) Usar variáveis globais

>R: A

Explicação:
- Usar private é uma das maneiras de aplicar abstração, pois restringe o acesso direto aos detalhes internos da classe.
- Com isso, você controla o que pode ser acessado ou modificado por outras partes do programa, geralmente por meio de métodos públicos (getters e setters).


## 3- Qual o papel das classes abstratas e interfaces na abstração?

>R: - Classes abstratas:
>- São classes que não podem ser instanciadas diretamente e podem conter métodos abstratos (sem implementação).
>- Elas definem o que deve ser feito, mas deixam para as subclasses o como fazer.
>- Interfaces:
>    - Definem um contrato, ou seja, um conjunto de métodos que as classes que as implementam devem oferecer.
>    - A interface não diz como o método funciona, apenas que ele existe.


## 4- É correto afirmar que uma interface pode conter métodos com implementação a partir do Java 8?

- (A) Sim
- (B) Não

>R: A
 
Explicação:
- A partir do Java 8, interfaces podem conter:
    - Métodos default: métodos com implementação padrão, que podem ser sobrescritos pelas classes que implementam a interface.
    - Métodos static: métodos estáticos com implementação, que pertencem à interface e não à instância.
- Isso trouxe mais flexibilidade para interfaces sem quebrar a compatibilidade com versões anteriores.


## 5- Qual a palavra-chave usada para definir um método abstrato em uma classe abstrata?

- (A) abstract
- (B) interface
- (C) override
- (D) static

>R: A

Explicação:
- Em classes abstratas, métodos que não têm corpo e que obrigam as subclasses a implementá-los são declarados com a palavra-chave abstract.

Exemplo:
````java
abstract class Animal {
    public abstract void emitirSom();
}
````


## 6- É possível que uma classe concreta herde de uma classe abstrata?
- (A) Sim
- (B) Não

>R: A

Explicação:
- Uma classe concreta pode herdar de uma classe abstrata e precisa implementar todos os métodos abstratos da classe abstrata para poder ser instanciada.
- Se a classe concreta não implementar todos os métodos abstratos, ela também deve ser declarada como abstrata.


## 7- Uma classe abstrata pode conter métodos com implementação concreta?
- (A) Sim
- (B) Não

>R: A

Explicação:
- Classes abstratas podem ter tanto:
    - Métodos abstratos (sem corpo), que obrigam as subclasses a implementá-los.
    - Métodos concretos (com corpo), que podem ser usados diretamente ou sobrescritos pelas subclasses.
- Isso permite que as classes abstratas forneçam uma implementação parcial comum para suas subclasses.


## 8- Qual é a vantagem principal da abstração na programação orientada a objetos?

- (A) Evitar a duplicação de código
- (B) Ocultar detalhes complexos e expor apenas funcionalidades essenciais
- (C) Melhorar a performance do programa
- (D) Permitir herança múltipla

>R: B

Explicação:
- A abstração tem como principal objetivo esconder os detalhes internos de implementação, mostrando apenas o que é necessário para o usuário ou para outras partes do sistema.
- Isso ajuda a tornar o código mais simples, fácil de entender e manter.

## 9- Qual das opções a seguir é um exemplo típico de abstração em Java?

- (A) Modificadores de acesso (private, public)
- (B) Classes abstratas e interfaces
- (C) Herança múltipla
- (D) Sobrecarga de métodos

>R: B

Explicação:
- Classes abstratas e interfaces são as principais ferramentas que o Java oferece para implementar abstração.
- Elas permitem definir contratos e comportamentos sem revelar os detalhes da implementação, promovendo o encapsulamento e facilitando o design modular.
