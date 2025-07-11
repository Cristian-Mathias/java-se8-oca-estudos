## 1- Onde pode ser declarada uma variável local em Java?

- A) Fora da classe, mas dentro do pacote
- B) Fora de métodos, mas dentro da classe
- C) Dentro de métodos, construtores ou blocos
- D) Em qualquer lugar do código

>R: C
>- Uma variável local só pode ser declarada dentro de métodos, construtores ou blocos (como if, for, while).
>- Ela existe apenas enquanto aquele bloco está sendo executado.

## 2- O que acontece se você declarar uma variável local, mas não inicializá-la antes de usá-la?

- A) O compilador atribui automaticamente um valor padrão
- B) A variável é ignorada
- C) O programa compila, mas dá erro em tempo de execução
- D) O código não compila

>R: D
>- Variáveis locais não recebem valores padrão em Java.
>- Se você declarar uma variável local sem inicializar e tentar usá-la, o compilador acusa erro.

## 3- Dentre as alternativas abaixo, qual variável é local?

- A) int idade; declarada fora de todos os métodos, dentro da classe
- B) static String nome; declarada fora dos métodos, com modificador static
- C) boolean ativo = true; dentro de um método chamado verificar()
- D) private double saldo; dentro da classe, com modificador private

>R: C
>- A variável boolean ativo = true; declarada dentro de um método é uma variável local.

As demais são:
- A) Variável de instância
- B) Variável de classe (estática)
- D) Variável de instância com modificador de acesso

## 4- Qual das alternativas não é permitida em uma variável local?

- A) Inicializá-la com um valor
- B) Declarar dentro de um for
- C) Usar private como modificador
- D) Declarar várias na mesma linha

>R: C
>- Variáveis locais não podem ter modificadores de acesso como private, public ou protected.
  Esses modificadores só são usados em variáveis de instância ou de classe, ou seja, declaradas fora dos métodos.

✔️ As outras alternativas são válidas:

- A) Declarar e inicializar: int x = 10;
- B) Declarar no for: for (int i = 0; i < 10; i++)
- D) Declarar várias: int a = 1, b = 2;

## 5- Qual é o tempo de vida de uma variável local?

- A) Enquanto o programa estiver rodando
- B) Enquanto o objeto da classe existir
- C) Durante a execução do bloco onde foi declarada
- D) Durante a execução do método main

>R: C
>- A variável local vive apenas enquanto o bloco onde foi declarada estiver em execução.
>- Assim que o bloco termina (como um método, if, for, etc.), a variável local deixa de existir e sua memória é liberada.

## 6- Dado o código abaixo, o que acontece?
````java
public void teste() {
    int x;
    if (true) {
        x = 5;
    }
    System.out.println(x);
}
````
- A) Erro de compilação
- B) Erro em tempo de execução
- C) O código imprime 5
- D) O código imprime 0

>R: C
>- A variável x foi declarada fora do bloco if, mas foi inicializada dentro dele.
>- Como o if (true) sempre será executado, x será inicializada com 5 antes do System.out.println(x).

## 7- É possível declarar duas variáveis locais com o mesmo nome dentro de um mesmo método?

- A) Sim, desde que estejam em blocos diferentes
- B) Não, nunca é permitido
- C) Sim, mesmo no mesmo bloco
- D) Apenas se forem do mesmo tipo

>R: A
>- Você não pode declarar duas variáveis com o mesmo nome no mesmo bloco dentro do método (mesmo nível de escopo).
>- Mas pode declarar variáveis com o mesmo nome em blocos diferentes (como um bloco if, for, etc.), mesmo que estejam no mesmo método.
