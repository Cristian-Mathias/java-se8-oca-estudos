## 1- Qual dessas instruções declara e inicializa corretamente uma variável do tipo int em Java?

- A) int idade = "25";
- B) int idade = 25;
- C) int = idade 25;
- D) idade int = 25;

>R: B
- A alternativa B) int idade = 25; declara uma variável chamada idade do tipo int e já a inicializa com o valor literal 25.

## 2- Qual das seguintes variáveis é considerada não inicializada?

- A) String nome = "";
- B) boolean ativo = true;
- C) double salario;
- D) char letra = 'A';

>R: C
- A alternativa C) double salario; declara a variável salario, mas não a inicializa com um valor.
  -Em Java, declarar uma variável sem atribuir valor significa que ela está não inicializada, e tentar usá-la antes de inicializar causará erro de compilação (exceto se for variável de instância, que recebe valor padrão).

| Tipo      | Valor padrão (para variáveis de instância) |
| --------- | ------------------------------------------ |
| `int`     | `0`                                        |
| `double`  | `0.0`                                      |
| `boolean` | `false`                                    |
| `char`    | `\u0000` (caractere nulo)                  |
| `String`  | `null`                                     |


## 3- Qual das opções abaixo declara duas variáveis do tipo int corretamente em uma única linha?

- A) int a = 5, b = 10;
- B) int a, int b = 10;
- C) int a = 5 int b = 10;
- D) int a = 5; int b = 10;

>R: A
- Declara duas variáveis do tipo int na mesma linha.
- Ambas são inicializadas.
- Essa é a forma concisa e correta de declarar múltiplas variáveis do mesmo tipo.

## 4- Dado o seguinte código:
````java
public class Teste {
    public static void main(String[] args) {
        int idade;
        System.out.println(idade);
    }
}
````
O que acontece ao executar esse código?

- A) Compila e imprime 0
- B) Compila e imprime null
- C) Compila e imprime valor indefinido
- D) Erro de compilação

>R: D
- A alternativa D) Erro de compilação é a resposta certa.
- A variável idade foi declarada, mas não foi inicializada antes do uso.
- Em variáveis locais (declaradas dentro de métodos), o Java não atribui valor padrão.
- Por isso, tentar usá-la antes de inicializar causa erro de compilação.
- Já variáveis de instância (fora de métodos) recebem valor padrão automaticamente.

## 5- Qual dessas é uma declaração válida de uma variável char?

- A) char letra = "A";
- B) char letra = A;
- C) char letra = 'A';
- D) char letra = 65;

>R: C
- A alternativa C) char letra = 'A'; é a forma correta de declarar e inicializar uma variável do tipo char com o caractere A.
- O tipo char representa um único caractere Unicode.
- Em Java, ele sempre deve ser colocado entre aspas simples ' '.

## 6- Qual das opções abaixo representa a declaração e inicialização de uma variável do tipo boolean?

- A) boolean ativo = "true";
- B) boolean ativo = 1;
- C) boolean ativo = true;
- D) bool ativo = true;

>R: C
- A alternativa C) boolean ativo = true; está perfeitamente correta.
- O tipo boolean em Java aceita apenas dois valores:
  true ou false (sem aspas).
- boolean ativo = true; → isso declara a variável ativo e a inicializa corretamente.

## 7- Qual a saída do código abaixo?
````java
int idade = 30;
double salario = 2500.50;
boolean ativo = true;

System.out.println("Idade: " + idade + ", Salário: " + salario + ", Ativo: " + ativo);
````
- A) Erro de compilação
- B) Saída formatada com os valores das variáveis
- C) Imprime apenas o valor da variável idade
- D) Imprime os nomes das variáveis, mas não os valores

>R: B
- A alternativa B) Saída formatada com os valores das variáveis é a correta.
- Idade: 30, Salário: 2500.5, Ativo: true

## 8- Em qual dos casos abaixo ocorre declaração sem inicialização, mas que compila sem erro?

- A) Dentro do método main: int x; System.out.println(x);
- B) Em um campo da classe: private int idade;
- C) Dentro de um método: String nome; System.out.println(nome);
- D) boolean ativo = true;

>R: B
- A alternativa B) private int idade; representa uma variável de instância (campo da classe) declarada, mas não inicializada, e compila sem erro, pois o Java atribui um valor padrão.
- Variáveis de instância (fora de métodos) recebem automaticamente um valor padrão:
    - int → 0
    - double → 0.0
    - boolean → false
    - String / objetos → null





















