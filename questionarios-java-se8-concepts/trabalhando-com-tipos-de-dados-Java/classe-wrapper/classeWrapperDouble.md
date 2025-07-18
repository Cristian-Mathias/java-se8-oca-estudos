## 1- Qual a principal diferença entre o tipo primitivo double e a classe wrapper Double em Java?

>R: - double é um tipo primitivo, que armazena diretamente o valor numérico de ponto flutuante.
>- Double é uma classe wrapper que encapsula o valor double em um objeto, permitindo usar métodos úteis (como Double.parseDouble(), Double.isNaN(), entre outros) e também permite tratamento como um objeto, podendo ser usado em coleções que só aceitam objetos (ex: ArrayList<Double>).
>- Além disso, Double herda de Object, então pode ser usado onde objetos são necessários.

## 2- Como você cria um objeto Double a partir de um valor primitivo double? Cite uma forma válida.

>R: Double d = 2.10;

- No Java SE 8, graças ao autoboxing, você pode atribuir um valor primitivo double diretamente a uma variável do tipo Double, e o compilador converte automaticamente esse valor primitivo para um objeto Double.

- Outras formas válidas (mais explícitas) são:
````java
Double d1 = new Double(2.10);         // Construtor (desencorajado)  
Double d2 = Double.valueOf(2.10);     // Método estático recomendado 
````

## 3- O que acontece se você tentar converter a string "abc" usando Double.parseDouble("abc")?

>R: java.lang.NumberFormatException

- O método Double.parseDouble(String s) tenta converter a String passada em um valor primitivo double. Se a string não for um número válido, como no caso de "abc", ele lança uma exceção.

- Esse tipo de exceção não é verificada (unchecked), ou seja, não exige try-catch, mas pode ser tratada com try-catch se você quiser evitar que a aplicação quebre.

## 4- Qual a diferença entre Double.parseDouble("3.14") e Double.valueOf("3.14") em termos de retorno?

>R:- ``Double.parseDouble("3.14")`` → Retorna um tipo primitivo double com valor 3.14.

>- ``Double.valueOf("3.14")`` → Retorna um objeto Double que representa o valor 3.14.

- Ou seja:
````java
double x = Double.parseDouble("3.14"); // tipo primitivo
Double y = Double.valueOf("3.14");     // objeto wrapper
````


## 5- Dado o seguinte código:

````java
Double d1 = 100.0;
Double d2 = 100.0;
System.out.println(d1 == d2);
````

O que será impresso? E por quê?

>R: false

- Double não faz caching automático para valores como 100.0.
- Mesmo que o valor seja o mesmo, dois objetos diferentes são criados com autoboxing.
- Comparar com == retorna false porque compara referências, e os objetos são distintos.


## 6-  O que acontece com o código abaixo?
````java
Double d1 = null;
double d2 = d1;
````

>R: java.lang.NullPointerException



## 7- Qual a diferença entre os métodos isNaN() e isInfinite() da classe Double? Explique com suas palavras.

>R: isNaN()

- Verifica se o valor do Double é NaN (Not a Number), ou seja, representa um valor indefinido ou não numérico.
- Exemplo clássico:
````java
Double d = 0.0 / 0.0;
System.out.println(d.isNaN()); // true
````

>R: isInfinite()

- Verifica se o valor do Double é positivo ou negativo infinito (+Infinity ou -Infinity).
- Isso ocorre, por exemplo, quando um número finito é dividido por zero:
````java
Double d = 1.0 / 0.0;
System.out.println(d.isInfinite()); // true
````

## 8- Qual é a saída do seguinte código?
````java
Double d = Double.valueOf("NaN");
System.out.println(d == Double.NaN);
````

>R: false

- O valor NaN (Not a Number) tem uma propriedade especial:
    - NaN nunca é igual a nada — nem mesmo a ele próprio!

- Para verificar se um valor é NaN, NUNCA use ==.
````java
Double.isNaN(d)
````


## 9- O que será impresso no código abaixo?

````java
Double d1 = 128.0;
Double d2 = 128.0;
System.out.println(d1 == d2);
````

>R: false

- Como Double é um objeto wrapper, o operador == compara referências (endereços de memória), não os valores.
- O valor 128.0 está fora do intervalo de caching (diferente do Integer que cacheia até 127).
- Portanto, d1 e d2 são dois objetos distintos, e d1 == d2 retorna false.


## 10- Qual método da classe Double você usaria para converter um valor Double em seu valor primitivo double? Dê o nome exato do método.

>R: doubleValue()

````java
Double dWrapper = 12.2;
double dPrimitivo = dWrapper.doubleValue();
System.out.println(dWrapper);
System.out.println(dPrimitivo);
````