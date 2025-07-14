## 1- Qual das alternativas representa uma variável primitiva em Java?

- A) String nome = "Cristian";
- B) Pessoa pessoa = new Pessoa();
- C) int idade = 25;
- D) Scanner entrada = new Scanner(System.in);

>R: C
- A alternativa C é a resposta certa:
    - int é um dos 8 tipos primitivos em Java.
    - Ele armazena diretamente o valor 25 na stack.

## 2- Dado o código abaixo:
````java
int a = 10;
int b = a;
a = 20;
System.out.println(b);
````
O que será impresso?

- A) 10
- B) 20
- C) null
- D) Erro de compilação

>R: A
- A alternativa A é a certa: 10 será impresso.

Explicação:
````java
int a = 10;
int b = a;     // b recebe uma CÓPIA do valor de a (10)
a = 20;        // apenas 'a' é alterado, 'b' continua com 10
System.out.println(b); // imprime 10
````
- Como int é primitivo, o valor é copiado diretamente.
- Não há vínculo entre a e b após a cópia.
- Variáveis primitivas armazenam valores na stack.
- Cópias entre primitivas não compartilham memória.


## 3- Observe o código abaixo:
````java
class Pessoa {
    String nome;
}

    Pessoa p1 = new Pessoa();
    Pessoa p2 = p1;
    p2.nome = "Cristian";

    System.out.println(p1.nome);
````
Qual será a saída?

- A) Cristian
- B) null
- C) Erro de compilação
- D) p1.nome

>R: A
- Explicação:
````java
Pessoa p1 = new Pessoa(); // cria um novo objeto no heap
Pessoa p2 = p1;           // p2 recebe a mesma referência que p1
p2.nome = "Cristian";     // altera o objeto apontado por ambas
System.out.println(p1.nome); // "Cristian"
````
- p1 e p2 são variáveis de referência.
- Ambas apontam para o mesmo objeto no heap.
- Alterar o atributo via p2 afeta também p1.

## 4- Qual das alternativas melhor descreve a principal diferença entre variáveis primitivas e variáveis de referência?

- A) Variáveis primitivas são mais lentas que referências
- B) Variáveis de referência são armazenadas na stack
- C) Variáveis primitivas armazenam valores; variáveis de referência armazenam endereços
- D) Ambas são armazenadas no heap

>R: C

| Tipo                  | Armazena o quê?        | Onde fica o valor real?           |
| --------------------- | ---------------------- | --------------------------------- |
| Primitiva (`int`)     | Valor literal (ex: 25) | Stack                             |
| Referência (`Pessoa`) | Endereço do objeto     | Referência: Stack<br>Objeto: Heap |


## 5- Qual é o comportamento padrão de uma variável de referência que não foi inicializada?

- A) Contém 0
- B) Contém uma String vazia ""
- C) Contém null
- D) Gera erro de compilação

>R: C
- Em Java, quando uma variável de referência é declarada, mas não inicializada, seu valor padrão é:
````java
Pessoa p; // se for atributo de classe → p == null
````
- null significa que a variável não está apontando para nenhum objeto no heap.

## 6- Dado o código abaixo:
````java
String nome1 = "Cristian";
String nome2 = nome1;
nome1 = "Mathias";

System.out.println(nome2);
````
Qual será a saída?

- A) Cristian
- B) Mathias
- C) null
- D) Erro de compilação

>R: A
````java
String nome1 = "Cristian";  // nome1 aponta para "Cristian"
String nome2 = nome1;       // nome2 aponta para o MESMO valor "Cristian"
nome1 = "Mathias";          // nome1 agora aponta para um NOVO valor "Mathias"
````
- nome2 continua apontando para "Cristian".
- Strings em Java são imutáveis e otimizadas com interning (compartilhamento de valores literais).
- Atribuir nome1 = "Mathias" não altera o conteúdo de "Cristian", apenas faz nome1 referenciar outro valor.
  OBS: Referências podem ser copiadas, mas cada variável pode ser redirecionada para diferentes objetos depois.


## 7- Dado o seguinte código:
````java
int[] numeros = {1, 2, 3};
int[] copia = numeros;
numeros[0] = 10;

System.out.println(copia[0]);
````
Qual será a saída?

- A) 1
- B) 10
- C) Erro de compilação
- D) null

>R: B
````java
int[] numeros = {1, 2, 3};
int[] copia = numeros;     // copia recebe a MESMA referência
numeros[0] = 10;            // altera o valor no índice 0 do mesmo array
System.out.println(copia[0]); // imprime o valor alterado
````
- Tanto numeros quanto copia apontam para o mesmo array no heap.
- Quando você altera um valor em numeros, ele é refletido em copia, pois ambos compartilham o mesmo endereço.
  OBS: Arrays são objetos em Java. Quando você copia um array para outra variável, você está copiando a referência, não os dados.


## 8- Qual é o valor padrão de uma variável primitiva do tipo boolean quando ela é declarada como atributo de instância (fora de um método), mas não é inicializada explicitamente?

- A) true
- B) false
- C) null
- D) Gera erro de compilação

>R: B
- Quando você declara uma variável primitiva como atributo de instância (ou seja, dentro da classe, mas fora de um método), ela recebe um valor padrão definido pela JVM:
````java
public class Exemplo {
    boolean ativo; // valor padrão é false

    public void imprimir() {
        System.out.println(ativo); // false
    }
}
````
## 9- Dado o código abaixo:
````java
class Produto {
    double preco;
}

public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.preco = 100.0;
        p2 = p1;
        p1.preco = 200.0;

        System.out.println(p2.preco);
    }
}
````

O que será impresso?

- A) 100.0
- B) 200.0
- C) null
- D) Erro de compilação

>R: B
````java
Produto p1 = new Produto();  // p1 aponta para um objeto Produto
Produto p2 = new Produto();  // p2 aponta para outro objeto
p1.preco = 100.0;            // preço de p1 = 100
p2 = p1;                     // p2 agora aponta para o MESMO objeto de p1
p1.preco = 200.0;            // altera o mesmo objeto
System.out.println(p2.preco); // imprime 200.0
````
- Após p2 = p1, ambas variáveis apontam para o mesmo objeto no heap.
- Alterar p1.preco também altera p2.preco, pois é o mesmo objeto.
  OBS: Quando você copia uma variável de referência, as duas variáveis passam a apontar para o mesmo objeto.
  Qualquer alteração refletirá para ambas.

## 10- Sobre variáveis primitivas e de referência, qual das afirmações está correta?

- A) Objetos são armazenados na stack
- B) Primitivos sempre ocupam mais memória que objetos
- C) Variáveis de referência armazenam o endereço do objeto no heap
- D) Primitivos não possuem valor padrão

>R: C
- Uma variável de referência (ex: Pessoa p) armazena um ponteiro (endereço) para um objeto criado com new.
- O objeto em si é armazenado no heap.
- A variável que aponta para ele fica na stack.
