## 1- Qual é o intervalo padrão dos valores do tipo Integer que são armazenados no cache da JVM?

a) De -128 a 127
b) De 0 a 255
c) De -256 a 256
d) De -1000 a 1000

Qual é a sua resposta?

>R: a.


## 2- Se você fizer o seguinte código em Java:

````java
Integer a = 127;
Integer b = 127;
System.out.println(a == b);
````

Qual será a saída?

a) true
b) false

Qual é a sua resposta?

>R: a.

- Quando o valor está dentro do cache (-128 a 127), o Integer reutiliza o mesmo objeto. Assim, a e b apontam para a mesma referência na memória. - Por isso, o operador == (que compara referências) retorna true.

## 3- Agora veja este código:

````java
Integer x = 128;
Integer y = 128;
System.out.println(x == y);
````
Qual será a saída?

a) true
b) false

Qual a sua resposta?

>R: b.

- Valores fora do intervalo de cache padrão (-128 a 127) não reutilizam objetos.
- Então, para 128, a JVM cria dois objetos Integer distintos, x e y, com referências diferentes. Por isso, x == y é false (pois == compara referência, não valor).


## 4- Para comparar corretamente o valor de dois objetos Integer, independentemente de cache, devemos usar:

a) O operador ==
b) O método equals()
c) O operador !=
d) O método compareTo()

Qual a sua resposta?

>R: b.

- O método equals() compara o valor interno dos objetos Integer, não a referência de memória.
- Então, mesmo que os objetos sejam diferentes (como no caso de valores fora do cache), equals() retorna true se os valores forem iguais.

## 5- Qual é o resultado da expressão abaixo?

````java
Integer a = 1000;
int b = 1000;
System.out.println(a == b);
````

a) true
b) false

Qual a sua resposta?

>R: a.

- O operador == está comparando um Integer com um int. Antes da comparação, o Java faz unboxing automático de a, convertendo-o de Integer para int.
- Assim, a comparação se torna entre dois int com valor 1000, resultando em true.
- Mesmo que 1000 esteja fora do cache, isso não afeta o resultado porque o Integer é convertido para primitivo.


## 6- Considere este código:

````java
Integer a = Integer.valueOf(127);
Integer b = Integer.valueOf(127);
System.out.println(a == b);
````

Qual será a saída?

a) true
b) false

Qual a sua resposta?

>R: a.

- O método Integer.valueOf(int) não cria um novo objeto diretamente.
- Ele verifica se o valor está dentro do intervalo de cache (por padrão, -128 a 127).
- Se estiver, retorna uma referência ao objeto já existente no cache.
- No exemplo, 127 está dentro do cache, então a e b apontam para o mesmo objeto.
- Como são o mesmo objeto, a == b retorna true.


## 7- Qual das alternativas abaixo cria um novo objeto Integer, ignorando o cache, mesmo que o valor esteja dentro do intervalo -128 a 127?

a) Integer a = Integer.valueOf(100);
b) Integer a = 100;
c) Integer a = new Integer(100);
d) Integer a = Integer.parseInt("100");

Qual é a sua resposta?

>R: c.

- A alternativa c) Integer a = new Integer(100); força a criação de um novo objeto, independentemente do valor estar ou não dentro do intervalo de cache.
- Veja o comportamento de cada alternativa:
    - a) Integer.valueOf(100) → Usa o cache, se disponível. Retorna objeto já existente para valores de -128 a 127.
    - b) Integer a = 100; → Autoboxing + cache: converte int para Integer usando valueOf().
    - c) new Integer(100) → Sempre cria um novo objeto! Não usa o cache.
    - d) Integer.parseInt("100") → Retorna um int, não um Integer. Para virar Integer, ainda haveria autoboxing, que usaria o cache.



## 8- Considere o seguinte código:

````java
Integer a = new Integer(127) //(deprecated);
Integer b = 127;
System.out.println(a == b);
````

Qual será a saída?

a) true
b) false

Qual é a sua resposta?

>R: b.

- a aponta para um objeto novo, criado com new Integer(127)
- b aponta para um objeto do cache, pois 127 está dentro do intervalo -128 a 127 e o autoboxing chama Integer.valueOf(127)
- São dois objetos diferentes → suas referências são diferentes
- Por isso, a == b é false


## 9- O que acontece com o cache do Integer se você precisar armazenar valores maiores que 127?

a) A JVM sempre cria novos objetos, sem usar cache.
b) O cache pode ser ampliado configurando a JVM, para armazenar valores maiores.
c) O cache é fixo e não pode ser alterado.
d) A JVM reutiliza objetos de cache mesmo para valores maiores que 127.

Qual a sua resposta?

>R:b.

- Por padrão, o cache de Integer vai de -128 a 127.
- Mas é possível configurar a JVM para aumentar esse limite superior com o parâmetro:
    - `-Djava.lang.Integer.IntegerCache.high=valor`

- OBS: A alternativa a) está parcialmente correta, porque sem essa configuração a JVM cria novos objetos para valores fora do intervalo padrão, mas ela pode sim ampliar o cache.


## 10- Dado o código abaixo, qual é a saída?
````java
Integer a = 1000;
Integer b = 1000;
System.out.println(a.equals(b));
System.out.println(a == b);
````

>R: true, false.
