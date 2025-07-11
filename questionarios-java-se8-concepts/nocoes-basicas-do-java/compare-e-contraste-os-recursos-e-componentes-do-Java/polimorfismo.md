## 1- O que é polimorfismo na programação orientada a objetos?

>R: Polimorfismo significa "muitas formas".
Na programação orientada a objetos, refere-se à capacidade de um mesmo objeto se comportar de maneiras diferentes, dependendo do contexto ou do tipo de referência.

Explicação:
- Isso permite, por exemplo:
    - Tratar diferentes objetos por meio de uma mesma interface ou superclasse
    - Executar comportamentos específicos mesmo quando acessados pelo tipo genérico

- Exemplo:
  Animal meuAnimal = new Cachorro();
  meuAnimal.emitirSom(); // Executa o método sobrescrito em Cachorro

- Embora a variável seja do tipo Animal, o comportamento é do Cachorro.

## 2- Qual das alternativas melhor representa o uso de polimorfismo em Java?

- (A) Usar atributos private em uma classe
- (B) Criar vários métodos com o mesmo nome e parâmetros diferentes
- (C) Usar uma referência de tipo pai para apontar para um objeto de tipo filho
- (D) Usar static para compartilhar métodos entre instâncias

>R: C

Explicação:
- Esse é o caso clássico de polimorfismo em tempo de execução (dinâmico).
  Permite que você use uma referência genérica (como Animal) para acessar comportamentos específicos de uma subclasse (como Cachorro).

Exemplo:
````java
Animal a = new Gato();
a.emitirSom(); // Executa o método da classe Gato
````
- Mesmo sendo declarado como Animal, o método chamado é o da subclasse real (Gato), graças ao polimorfismo.

## 3- Qual palavra-chave é usada para sobrescrever um método e garantir que o compilador verifique isso corretamente?

>R: A anotação @Override é usada para informar ao compilador que você está sobrescrevendo (reescrevendo) um método da superclasse ou interface.

Explicação:
- Ela não é obrigatória, mas é altamente recomendada, porque:
- Garante que o método está sendo sobrescrito corretamente.
- Evita erros sutis de digitação ou de assinatura.

Exemplo:
````java
public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
````
- Se o método emitirSom() não existir na superclasse, o compilador acusará erro.

## 4- Polimorfismo permite que diferentes classes compartilhem a mesma interface e implementem comportamentos diferentes?

- (A) Sim
- (B) Não

>R: A

Explicação:
- Diferentes classes implementam a mesma interface, mas cada uma com seu próprio comportamento.

Exemplo:
````java
interface Animal {
    void emitirSom();
}

class Gato implements Animal {
    public void emitirSom() {
        System.out.println("Miau");
    }
}

class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("Au au");
    }
}
````
- Agora você pode fazer:
````java
Animal a1 = new Gato();
Animal a2 = new Cachorro();

a1.emitirSom(); // Miau
a2.emitirSom(); // Au au
````

## 5- O polimorfismo em tempo de execução depende de:

- (A) Sobrecarga de métodos
- (B) Classes abstratas e métodos static
- (C) Herança ou interfaces e sobrescrita de métodos
- (D) O uso de variáveis final

>R: C

Explicação:
- O polimorfismo em tempo de execução (também chamado de dinâmico) depende de:
    - Herança ou implementação de interfaces
    - Sobrescrita (@Override) de métodos
- Ele ocorre quando uma chamada a um método é resolvida em tempo de execução, com base no tipo real do objeto.

Atenção:
- Sobrecarga é polimorfismo em tempo de compilação, não de execução.

## 6- Qual é a diferença entre sobrecarga e sobrescrita de métodos em Java?

>R: Sobrecarga(overloading): 
> - é quando você tem vários métodos com o mesmo nome, mas assinaturas diferentes (parâmetros diferentes) dentro da mesma classe.
>- Sobrescrita(overriding): é quando uma subclasse redefine (reescreve) um método da superclasse com a mesma assinatura, para alterar seu comportamento.

Exemplo de Sobrescrita:
````java
class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
}
````
Exemplo de Sobrecarga:
````Java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
}

    public double somar(double a, double b) {
        return a + b;
    }
}
````

## 7- O que é necessário para que o polimorfismo funcione corretamente em Java?
- (A) A subclasse deve sobrescrever os métodos da superclasse
- (B) A subclasse deve ter métodos estáticos
- (C) A superclasse deve ter todos os métodos privados
- (D) A subclasse deve ter construtores sem parâmetros

>R: A

Explicação:
- Para o polimorfismo em tempo de execução funcionar, a subclasse precisa sobrescrever os métodos da superclasse que serão chamados via referência do tipo pai.
- Assim, quando o método é invocado, a versão da subclasse será executada, permitindo o comportamento dinâmico esperado.


## 8- É possível aplicar polimorfismo com interfaces em Java?
- (A) Sim
- (B) Não

>R: A

Explicação:
- Em Java, polimorfismo funciona muito bem com interfaces.
- Você pode ter várias classes diferentes implementando a mesma interface, e usar referências do tipo da interface para manipular objetos dessas classes, chamando os métodos implementados de forma específica.

## 9- Qual é o papel do método toString() em relação ao polimorfismo?
- (A) Ele não tem relação com polimorfismo
- (B) Permite que objetos de diferentes classes forneçam uma representação em texto personalizada
- (C) É usado apenas para comparação de objetos
- (D) Impede que métodos sejam sobrescritos

>R: B

Explicação:
- O método toString() está definido na classe Object (superclasse de todas as classes Java).
- Quando você sobrescreve toString() em suas classes, permite que cada objeto forneça uma descrição textual personalizada.
- Isso é um exemplo de polimorfismo, porque a chamada ao método toString() em uma referência do tipo Object pode executar diferentes versões dependendo da classe real do objeto.


## 10- Qual das opções abaixo melhor define o benefício do polimorfismo?
- (A) Facilitar a reutilização de código e aumentar a flexibilidade do programa
- (B) Aumentar o tamanho do código-fonte
- (C) Restringir o acesso a atributos da classe
- (D) Melhorar a performance do hardware

>R: A

Explicação:
- O polimorfismo permite que diferentes classes sejam tratadas de forma uniforme, com comportamentos específicos em tempo de execução, o que:
    - Reduz duplicação de código
    - Facilita manutenção e extensão do sistema
    - Aumenta a flexibilidade para adicionar novas funcionalidades sem modificar o código existente
 