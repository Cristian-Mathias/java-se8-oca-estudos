## 1- Operadores Aritméticos!
Qual será o valor da variável resultado após a execução do código abaixo?

````java
int a = 10;
int b = 4;
int resultado = a % b;
````
Qual é o valor de resultado?
>R: resultado = 2;

- O operador % (módulo) retorna o resto da divisão inteira.

- 10 ÷ 4 = 2 com resto 2


## 2- Operadores Relacionais!
Qual será o resultado da expressão abaixo (true ou false)?

````java
int x = 7;
int y = 7;
boolean teste = (x != y);
````
Qual é o valor de teste?
>R:

- O operador relacional != verifica se os valores são diferentes.

- x = 7 e y = 7, então não são diferentes → a expressão (x != y) é false.


## 3- Operadores Lógicos!
Qual será o valor da variável resultado no código abaixo?

````java
boolean a = true;
boolean b = false;
boolean resultado = a && b || a;
````
Qual é o valor de resultado?
>R: true;

- A precedência dos operadores lógicos em Java é:

1. && (E lógico)

2. || (OU lógico)

- Então a expressão é avaliada assim:

````java
resultado = (a && b) || a
resultado = (true && false) || true
resultado = false || true
resultado = true
````

## 4- Operadores Unários!
Qual será o valor da variável x após a execução do código abaixo?

````java
int x = 5;
x++;
++x;
````

Qual é o valor final de x?
>R: O valor final de x é 7

Vamos analisar passo a passo:
````java
int x = 5;
x++;    // pós-incremento: x = 6
++x;    // pré-incremento: x = 7
````


## 5- Operador Ternário!
Qual será o valor da variável mensagem após a execução do código abaixo?

````java
int idade = 18;
String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
````

Qual é o valor de mensagem?
>R: mensagem = Maior de idade.


## 6- Operadores Bitwise
Qual será o valor de resultado no código abaixo?

````java
int a = 5;   // em binário: 0101
int b = 3;   // em binário: 0011
int resultado = a & b;
````
Qual é o valor de resultado?
>R:resultado = 1;


## 7- Bitwise com OR |):
Qual será o valor de resultado no código abaixo?

````java
int a = 5;   // em binário: 0101
int b = 3;   // em binário: 0011
int resultado = a | b;  // OR bit a bit
````

Qual é o valor final de resultado?
>R: resultado 7;
