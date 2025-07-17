## 1- Qual dos códigos abaixo usa o cache interno da classe Boolean, sem criar um novo objeto?

a) Boolean b = new Boolean(true);
b) Boolean b = Boolean.valueOf(true);
c) Boolean b = Boolean.TRUE;
d) Boolean b = null;

Qual sua resposta?

>R: b.

- Boolean.valueOf(true) retorna o objeto do cache interno Boolean.TRUE (mesmo para false retorna Boolean.FALSE).
- Isso evita criar novos objetos desnecessários, economizando memória.

## 2- Qual é a saída do código abaixo?

````java
Boolean b1 = Boolean.valueOf("true");
Boolean b2 = Boolean.TRUE;
System.out.println(b1 == b2);
````

a) true
b) false

Qual sua resposta?

>R: a.

- Boolean.valueOf("true") retorna o objeto cacheado Boolean.TRUE quando a string é "true" (ignorando maiúsculas/minúsculas).
- Boolean.TRUE é o objeto singleton que representa true.
- Como ambos apontam para o mesmo objeto na memória, b1 == b2 é true.

## 3- Qual é o resultado da comparação abaixo?

````java
Boolean b1 = new Boolean(true);
Boolean b2 = Boolean.TRUE;
System.out.println(b1 == b2);
````

a) true
b) false

Qual sua resposta?

>R: b.

- new Boolean(true) cria um novo objeto na memória, diferente do objeto cacheado Boolean.TRUE.
- Mesmo que os valores sejam iguais (true), == compara referências, e essas referências são diferentes.
- Portanto, b1 == b2 retorna false.


## 4- O que acontece se você executar este código?

````java
Boolean b = null;
if (b) {
    System.out.println("Verdadeiro");
} else {
    System.out.println("Falso");
}
````

a) Imprime "Verdadeiro"
b) Imprime "Falso"
c) Lança NullPointerException
d) Compila com erro

Qual a sua resposta?
>R: c.

- A variável b é um objeto Boolean e está com valor null.
- Na condição if (b), o Java faz unboxing automático, tentando converter b para um tipo primitivo boolean.
- Como b é null, não é possível fazer essa conversão, e o programa lança um NullPointerException em tempo de execução.


## 5- Qual método da classe Boolean converte uma String em um valor booleano primitivo (boolean)?

a) Boolean.valueOf(String)
b) Boolean.parseBoolean(String)
c) Boolean.booleanValue()
d) Boolean.toString(String)

Qual sua resposta?

>R: b.

- Boolean.parseBoolean(String) retorna um boolean primitivo.
- Ele converte a string "true" (ignorando maiúsculas/minúsculas) em true; qualquer outra coisa vira false.
