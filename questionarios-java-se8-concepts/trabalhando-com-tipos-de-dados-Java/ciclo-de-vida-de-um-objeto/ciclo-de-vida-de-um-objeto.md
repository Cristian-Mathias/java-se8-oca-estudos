## 1- O que acontece na memória quando você executa esta linha em Java?

````java
Pessoa p = new Pessoa("João");
````
>R: Acontece o seguinte:
>- Um novo objeto do tipo Pessoa com o nome "João" é criado na heap (área de memória usada para objetos).
>- A variável p é uma variável local (está na stack) e guarda uma referência para o objeto na heap.
>- O objeto só pode ser acessado enquanto houver uma referência válida (como p) apontando para ele.


## 2- Considere o seguinte código:

````java
Pessoa p = new Pessoa("Maria");
p = new Pessoa("Carla");
````

O que acontece com o objeto "Maria" depois da reatribuição?

>R:
>- O objeto "Maria" será desreferenciado, porque a variável p foi reatribuída para apontar para um novo objeto chamado "Carla".
>- Como mais nenhuma variável aponta para "Maria", ela se torna lixo — ou seja, elegível para coleta de lixo.
>- Reatribuição é uma das formas de desreferenciar um objeto.
>- A outra forma comum é definir a variável como null.


## 3- Considere o código:

````java
Pessoa p1 = new Pessoa("Ana");
Pessoa p2 = new Pessoa("Beatriz");
p1 = null;
````
Depois dessa execução, quais objetos continuam acessíveis e quais se tornam lixo?

>R:
>- O objeto "Ana" se torna lixo porque:
>    - A variável p1 foi definida como null, ou seja, não aponta mais para o objeto.
>    - Se nenhuma outra variável aponta para "Ana", ele fica inacessível → elegível para coleta de lixo.
>- O objeto "Beatriz" ainda está acessível, pois a variável p2 continua referenciando-o.


## 4- O que acontece com os objetos criados dentro de um método quando o método termina a execução?
Eles são removidos imediatamente da memória? Explique.

>R:
>- Quando um método termina, todas as variáveis locais (como referências a objetos) saem do escopo.
>- Os objetos referenciados por essas variáveis se tornam elegíveis para coleta de lixo — mas isso não significa que serão removidos imediatamente.
>- A JVM decide quando o Garbage Collector (GC) será executado, com base em critérios como:
>    - Uso de memória
>    - Pressão de alocação
>    - Otimizações internas
>- Por isso dizemos que a coleta de lixo é não determinística.

## 5- Considere o código abaixo. Ele imprime alguma mensagem indicando que o objeto foi removido?
````java
Pessoa p = new Pessoa("Lucas");
p = null;
System.gc();
````
Explique por que sim ou por que não.

>R:
>- Mesmo com o comando System.gc();, nenhuma mensagem será impressa automaticamente, porque:
>    - O Garbage Collector pode ignorar a sugestão.
>    - A execução da coleta de lixo não é garantida, nem é imediata.
>    - A JVM decide se e quando vai realmente fazer a coleta.

## 6- O que acontece se você reatribuir duas variáveis para se referirem ao mesmo objeto?
Esse objeto poderá ser coletado pelo GC se uma delas for definida como null?

>R:
>Se duas variáveis referenciam o mesmo objeto, e uma delas é definida como null,
o objeto não será coletado se a outra variável ainda estiver referenciando ele.

Ou seja:

````java
Pessoa p1 = new Pessoa("Lucas");
Pessoa p2 = p1; // agora p1 e p2 apontam para o mesmo objeto

p1 = null; // apenas p1 deixou de apontar
````
- Nesse caso, o objeto "Lucas" ainda está acessível via p2,
  portanto não é lixo e não será coletado.

- O objeto **só pode ser coletado quando nenhuma variável mais apontar para ele.


## 7- Qual é a principal diferença entre variáveis de instância e variáveis locais, no contexto da coleta de lixo?

>R:
>Variáveis locais duram pouco (até o fim do método).
>Variáveis de instância duram enquanto o objeto da classe existir.


Variável local:
````java
void metodo() {
    Pessoa p = new Pessoa("Ana");
    // p é uma variável local
}

````
- Assim que o método termina, p sai de escopo.
- O objeto "Ana" pode se tornar lixo.

Variável de instância:
````java
class Exemplo {
    Pessoa p = new Pessoa("Carlos"); // variável de instância
}
````
- Essa variável pertence a um objeto da classe Exemplo.
- Enquanto o objeto Exemplo existir, a variável p também existe.
- O objeto "Carlos" só será lixo quando o objeto Exemplo for coletado ou a variável for setada como null.


## 8- No contexto do garbage collector, qual é a diferença entre tornar um objeto inacessível por:

1. Reatribuição (ex: p = new Pessoa("Outro");)
2. Atribuição de null (ex: p = null;)

Ambos os casos tornam o objeto lixo? Existe alguma vantagem entre eles?

>R:Sim, ambos os casos tornam o objeto lixo, desde que nenhuma outra variável o referencie.

Vantagem:
- Não há diferença prática para o GC — usar null é mais explícito, mas ambos têm o mesmo efeito na coleta de lixo.
