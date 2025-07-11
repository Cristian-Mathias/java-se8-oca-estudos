## 1- Dado o código abaixo, o que acontece?

````java
public void teste() {
   if (true) {
      int x = 5;
   }
   System.out.println(x);
}
````
- A) Compila normalmente e imprime 5
- B) Compila mas dá erro em tempo de execução
- C) Erro de compilação: variável x não é visível fora do bloco
- D) O código imprime 0
> R: C

Explicação:
- A variável x foi declarada dentro do bloco if, ou seja, é uma variável de bloco.
- Ela só existe dentro daquele bloco e não pode ser acessada fora dele.
- Por isso, o compilador gera um erro de compilação ao tentar acessar x após o if.


## 2- Observe o código abaixo. Quantas variáveis de bloco ele possui?
````java
public void calcular() {
    int resultado = 0;

    for (int i = 0; i < 5; i++) {
        int parcial = i * 2;
        resultado += parcial;
    }
    System.out.println(resultado);
}
````
- A) 0
- B) 1
- C) 2
- D) 3

> R: C

Explicação:
- O código possui duas variáveis de bloco:
    - int i = 0 → declarada no cabeçalho do for, escopo limitado ao laço → variável de bloco
    - int parcial = i * 2 → declarada dentro do corpo do for, também com escopo restrito → variável de bloco
- A variável resultado não é de bloco, pois foi declarada diretamente no método (antes do for), então ela é uma variável local do método.


## 3- O que acontece se você declarar uma variável de bloco com o mesmo nome de uma variável local do método?
````java
public void exemplo() {
    int valor = 10;

    if (valor > 5) {
        int valor = 20;
        System.out.println(valor);
    }
}
````
- A) Compila e imprime 20
- B) Compila e imprime 10
- C) Compila, mas usa a variável do método
- D) Erro de compilação por duplicação de nome

> R: D

Explicação:
- O código gera um erro de compilação porque você não pode declarar uma nova variável com o mesmo nome de uma já existente no escopo que a inclui (ou seja, uma variável local dentro do método, seguida por uma de bloco com o mesmo nome).
- Mesmo que valor esteja dentro de um if, ele ainda está dentro do escopo do método, que já tem uma variável chamada valor.
- Java não permite sombra de variáveis locais dentro do mesmo método, mesmo que em blocos internos.

## 4- No código abaixo, qual é a saída?
````java
public void mostrar() {
    for (int i = 0; i < 3; i++) {
    System.out.print(i + " ");
    }

    // System.out.println(i); // linha comentada
}
````
- A) 0 1 2
- B) 1 2 3
- C) Erro de compilação
- D) Nada será impresso

> R: A

Explicação:
- O for imprime os valores de i de 0 até 2, porque:
    - i começa em 0
    - O laço continua enquanto i < 3
    - Em cada iteração, i++ é executado
      OBC -Além disso, como a linha System.out.println(i); está comentada, não causa erro, mas se estivesse ativa, daria erro de compilação, pois i é uma variável de bloco do for, não visível fora do laço.


## 5- É possível declarar duas variáveis de bloco com o mesmo nome em blocos diferentes, dentro do mesmo método?

- A) Sim, desde que não estejam no mesmo bloco
- B) Não, isso nunca é permitido
- C) Sim, mas apenas se forem do mesmo tipo
- D) Apenas em métodos diferentes

> R: A

Explicação:
- Em Java, você pode declarar variáveis de bloco com o mesmo nome, desde que estejam em blocos separados e não sobrepostos.

Exemplo válido:
````java
public void exemplo() {
    if (true) {
        int x = 10; // escopo: dentro do if
        System.out.println(x);
    }

    if (true) {
        int x = 20; // escopo: outro bloco independente
        System.out.println(x);
    }
}
````

## 6- Em qual situação abaixo a variável total seria considerada uma variável de bloco?

- A) Declarada como campo da classe
- B) Declarada dentro de um método, fora de qualquer bloco
- C) Declarada dentro de um for ou if
- D) Declarada como parâmetro de um método

> R: C

- A variável total é considerada uma variável de bloco apenas quando declarada dentro de um bloco de controle, como for ou if — por isso, a resposta correta é a letra C.
