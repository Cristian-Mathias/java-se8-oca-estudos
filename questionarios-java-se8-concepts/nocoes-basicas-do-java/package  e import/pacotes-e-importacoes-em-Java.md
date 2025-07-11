## 1- Qual é o propósito da instrução package no início de um arquivo Java?

- A) Importar classes externas
- B) Indicar o local da classe na estrutura do sistema de arquivos
- C) Informar à JVM que o código deve ser compilado em um pacote ZIP
- D) Determinar a ordem de execução do programa

>R: B
 
Explicação:
- A instrução package é usada para organizar as classes em grupos lógicos e indicar a qual pacote (ou "pasta") a classe pertence.

## 2- Qual das opções não precisa de uma instrução import para ser usada?

- A) java.util.Scanner
- B) java.lang.String
- C) java.time.LocalDate
- D) java.math.BigDecimal

>R: B

Explicação:
- O pacote java.lang é importado automaticamente pelo compilador Java, por isso você pode usar classes como String, System, Math sem precisar escrever nenhuma instrução import.

- Já classes em pacotes como java.util, java.time e java.math precisam ser importadas explicitamente para serem usadas.


## 3- Qual dessas instruções de importação é válida para importar todas as classes de um pacote?

- A) import java.util.*;
- B) import java.util.all;
- C) import java.util.packages.*;
- D) import java.util.allClasses;

>R: A

Explicação:
- O caractere curinga * indica que todas as classes do pacote java.util serão importadas.
- Não importa o número de classes, todas ficam acessíveis para uso.
- Isso não importa subpacotes — cada subpacote precisa ser importado separadamente, se for o caso.


## 4- O que acontece se você tentar usar uma classe que não está no seu pacote atual e não foi importada?

- A) O programa compila normalmente
- B) O compilador gera um erro dizendo que a classe não foi encontrada
- C) O programa compila, mas lança erro em tempo de execução
- D) O programa ignora a classe

>R: B
- Se você tentar usar uma classe que não está no mesmo pacote e não foi importada, o compilador gera um erro dizendo que a classe não foi encontrada.

Explicação:
- A importação informa ao compilador onde encontrar as classes usadas no código.
- Sem o import (ou sem usar o nome completo da classe com o pacote), o compilador não sabe onde buscar a classe.
- Isso causa um erro de compilação, impedindo que o programa seja gerado.


## 5- Qual das seguintes opções é verdadeira sobre o pacote java.lang?

- A) Precisa ser importado explicitamente em todo programa Java
- B) Importa automaticamente todas as classes usadas em um programa Java
- C) É importado automaticamente pelo compilador, sem necessidade de declaração import
- D) É um pacote obsoleto e não deve ser usado

>R: C

Explicação:
- É importado automaticamente pelo compilador, sem necessidade de declaração import

- O pacote java.lang é especial no Java — ele é importado automaticamente em todos os programas.
- Por isso, você pode usar classes como:
    - String
    - System
    - Math
    - Integer
    - Object

## 6- Sobre importações estáticas, o que a instrução abaixo permite?
````java
import static java.lang.Math.PI;
````
- A) Importar todas as classes do pacote java.lang.Math
- B) Criar uma nova constante chamada PI
- C) Usar o valor de Math.PI diretamente, sem prefixo
- D) Redefinir o valor da constante PI

>R: C
 
Explicação:
- A instrução: import static java.lang.Math.PI; permite que você use PI sem precisar escrever Math.PI toda vez.
- Ou seja, você pode fazer: System.out.println(PI);
- em vez de: System.out.println(Math.PI);

Importação estática serve para:
- Usar métodos estáticos como abs(), sqrt(), etc.
- Usar constantes como PI, E, etc.
- Sem precisar do prefixo da classe.

## 7- Dado o código abaixo, o que está errado?
````java
package br.estudo;

import java.util.Scanner;

package outro.pacote;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teste");
    }
}
````
- A) Nada, o código está correto
- B) Não pode haver dois package no mesmo arquivo
- C) O import deve vir depois do segundo package
- D) O pacote Scanner não pertence a java.util

>R: B

Explicação:
- Não pode haver dois package no mesmo arquivo
- Só pode haver uma declaração package por arquivo .java
- E ela deve ser a primeira linha válida (ignorando comentários ou espaços)


## 8- É possível importar uma classe de outro pacote e, ao mesmo tempo, ter outra classe com o mesmo nome no pacote atual?

- A) Sim, mas é necessário usar o nome totalmente qualificado para uma delas
- B) Sim, e o compilador escolhe automaticamente qual usar
- C) Não, isso gera erro de compilação
- D) Sim, mas apenas se ambas estiverem em subpacotes

>R: A

Explicação:
- Se você tem uma classe com o mesmo nome em dois pacotes diferentes, e quiser usar ambas, o Java exige que você especifique qual delas está usando por meio do nome totalmente qualificado, ou seja, com o nome completo do pacote.


## 9- O que a instrução import java.util.*; não faz?

- A) Importa todas as classes públicas do pacote java.util
- B) Importa subpacotes de java.util, como java.util.concurrent
- C) Permite usar Scanner, ArrayList, Date, entre outras classes
- D) Evita a necessidade de múltiplos import para classes do mesmo pacote

>R: B

Explicação:
- A instrução:
    - import java.util.*;

Importa apenas as classes do pacote java.util — não importa subpacotes como:
- java.util.concurrent
- java.util.function
- java.util.logging

Esses subpacotes precisam ser importados separadamente, se você quiser usar suas classes.

## 10- O que acontece se você não usar nenhuma instrução import e tentar usar uma classe como Scanner, que pertence a java.util?

- A) O programa roda normalmente
- B) O compilador gera um erro, pois não reconhece a classe
- C) A JVM busca automaticamente no pacote correto
- D) O compilador faz o import automaticamente

>R: B

Explicação:
- Quando você tenta usar uma classe como Scanner — que pertence ao pacote java.util — sem fazer a instrução de importação, o compilador não reconhece a classe e emite um erro.
