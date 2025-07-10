# JAVA SE 8 (OCA)
# 1. Noções básicas de Java

##  Escopo de Variáveis

> O escopo de uma variável define **onde ela pode ser usada (acessada)** dentro do código.

Em Java, as variáveis podem ter diferentes tipos de escopo dependendo de onde e como são declaradas. Abaixo estão os principais tipos:

---

###  Variável de Instância
Oque é?

- É uma variável que pertence a cada objeto criado a partir da classe.
- Cada **objeto da classe** tem sua **própria cópia** dessa variável.

Onde é declarada?
- Declarada **dentro da classe**, mas **fora de métodos, construtores ou blocos**.
- Visível em todos os **métodos não estáticos** da classe.

Como acessar?
- Só pode ser acessada diretamente **dentro da própria classe** (ou via objeto em outra classe).
- Pode ser acessada:
    - Diretamente pelo nome:
      ```java
      System.out.println(numeroClasse);
      ```
    - Ou com `this`:
      ```java
      System.out.println(this.numeroClasse);
      ```
- Se um método estático precisar acessar uma variável de instância (não estática), 
ele deverá receber um objeto como argumento.
    
  ```java
    public class Turma501 {
        String nomeAluno = "Pedro"; // variável de instância

        public static void metodo(Turma501 turma501){
            System.out.println("{variável de instância dentro de método  static} = " + turma501.nomeAluno );
        }

        public static void main(String[] args) {
            Turma501 escopo = new Turma501();
            metodo(escopo);
        }
    }
    ```
- OBS: se a variável for static ela se tornará variável de classe!
    ```java
        static String nomeAluno = "Pedro"; // variável de classe
    ```

---

###  Variável de Classe (Estática)

- Declarada dentro da classe com a palavra-chave `static`.
    ```java
        public class Turma501 {
            static String nomeAluno = "Pedro";// variável de classe

            public void metodo(){
                System.out.println("{variável de classe dentro de método não static} = " + nomeAluno );
            }

            public static void main(String[] args) {
                Turma501 escopo = new Turma501();
                escopo.metodo();
            }
        }
    ```
- **Pertence à classe** e não a objetos individuais.
- Há **uma única cópia compartilhada** entre todas as instâncias da classe.
- Pode ser acessada:
    - Diretamente por **métodos estáticos** da própria classe.
        ```java
        public class Turma501 {
            static String nomeAluno = "Pedro";// variável de classe

            public static void metodo(){
                System.out.println("{variável de classe dentro de método  static} = " + nomeAluno );
            }

            public static void main(String[] args) {
                metodo();
            }
        }
        ```
    - Pelo nome da classe:
      ```java
      Classe.nomeVariavel;
      ```
- Utilizações comuns:
    - Contadores globais
    - Constantes
    - Configurações compartilhadas
- Pode ser usada em métodos estáticos e não estáticos.
---

###  Variável Local

- Declarada dentro de um **método, construtor ou bloco**.
- Existe **apenas durante a execução** desse bloco.
- Só é acessível **dentro do escopo onde foi declarada**, a partir da linha onde aparece.
- Deve ser **inicializada antes do uso**, pois **não recebe valor padrão**.
- **Não pode** usar modificadores como `public`, `private` ou `static`.

```java
public void exemplo() {
    int idade = 25;
    System.out.println(idade);
}
```
---
###  Variável de Bloco

- É um tipo especial de variável local, declarada dentro de um bloco de código como if, for, while, {}.
- É visível somente dentro daquele bloco específico (entre as chaves {}).
- Assim que o bloco termina, a variável deixa de existir.
- Se tentar acessá-la fora do bloco, ocorre erro de compilação.

```java
        // Bloco if
        if (true) {
            int numero = 10; // variável de bloco
            System.out.println("Dentro do if: " + numero);
        }
```
---
## Estrutura básica de uma classe

> Uma classe é a base da programação orientada a objetos em Java. Ela serve como molde para criar objetos, definindo os atributos (dados) e comportamentos (métodos) que esses objetos terão.
- Componentes principais da estrutura de uma classe Java:
    ```java
    [modificador_de_acesso] class NomeDaClasse {
    
        // 1. Atributos (Campos ou Variáveis de Instância)
        [modificador_de_acesso] tipo nomeAtributo;
    
        // 2. Construtores
        [modificador_de_acesso] NomeDaClasse([parâmetros]) {
            // código para inicializar o objeto
        }
    
        // 3. Métodos (comportamentos)
        [modificador_de_acesso] tipoRetorno nomeMetodo([parâmetros]) {
            // corpo do método
        }
    
        // 4. Blocos estáticos ou de inicialização (opcional)
        static {
            // inicialização estática da classe
        }
    }

    ```
1. Modificador de acesso da classe
- Pode ser public (classe visível para todo mundo) ou default (visível só dentro do pacote).
- Exemplo:
    ````java
        public class Pessoa { ... }

    ````
2. Nome da classe
- Deve ser um identificador válido, por convenção começa com letra maiúscula.
- Deve ser igual ao nome do arquivo .java.

3. Atributos (Campos)
- São as variáveis que armazenam o estado do objeto.
- Exemplo:
    ````java
        private String nome;
        private int idade;
    ````
4. Construtores
- Método especial usado para criar e inicializar objetos.
- Tem o mesmo nome da classe e não tem tipo de retorno.
- Pode haver múltiplos construtores (sobrecarga).
- Exemplo:
    ````java
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    ````
5. Métodos
- Definem o comportamento da classe.
- Possuem modificadores de acesso, tipo de retorno, nome e parâmetros.
- Exemplo:
    ````java
        public void fazerAniversario() {
            idade++;
        }

        public String getNome() {
            return nome;
       }
    ````
6. Blocos estáticos (opcional)
- Executados uma vez quando a classe é carregada.
- Usados para inicialização estática.
- Exemplo:
    ````java
        static {
        System.out.println("Classe carregada");
        }
    ````
> **Resumo rápido**:<br><br>
A classe é o molde do objeto.<br>
Tem atributos (dados) e métodos (ações).<br>
Pode ter construtores para inicializar.<br>
Modificadores de acesso controlam a visibilidade.<br>
Cada classe Java é um arquivo .java com o mesmo nome da classe.

---
## Criar Aplicativos Java Executáveis com Método ``main``; Executar pela Linha de Comando; Produzir Saída no Console

### Conceito
Para que um programa Java seja executável, ele precisa conter um método especial chamado **main**, que serve como ponto de entrada da aplicação. É a partir desse método que a Java Virtual Machine (JVM) inicia a execução do programa.

A estrutura do método main deve ser exatamente esta:
````java
public static void main(String[] args)
````

### Detalhes da assinatura:

- ``public`` — Acesso global, necessário para que a JVM possa chamar o método.
- ``static`` — Permite que a JVM execute o método sem criar uma instância da classe.
- ``void`` — Indica que o método não retorna nada.
- ``String[] args`` — Argumentos de linha de comando passados ao programa (opcional).

    String[] args serve para passar informações do terminal (linha de comando) para o programa Java no momento em que ele é iniciado.

    Ou seja, é a comunicação entre o terminal e a aplicação no instante da execução.

**Obs:** Você já se perguntou por que o método main recebe seus argumentos como um array de Strings (String[] args), mesmo que os dados que você passe possam ser números, booleanos ou outros tipos?
> Isso acontece porque, na execução via terminal, tudo que você digita é recebido inicialmente como texto puro. A JVM, então, entrega esses dados ao programa como Strings, deixando para o próprio programa a tarefa de interpretar e converter para os tipos apropriados conforme a necessidade.

### Execução via linha de comando

1. Compilar:
````bash
javac NomeDaClasse.java
````
Gera um arquivo .class com bytecode Java.

2. Executar:
````bash
java NomeDaClasse
````
> Importante: Não incluir a extensão .class na execução.

### Produzir saída no console
Java usa o comando System.out.println() para escrever no terminal (console). É muito útil para exibir resultados, mensagens ou fazer testes:

````bash
System.out.println("Texto com quebra de linha");
System.out.print("Texto na mesma linha");
System.out.printf("Formatado: %.2f", 3.1415);
````
---
## Importe outros pacotes Java para torná-los acessíveis em seu código

Pacotes (packages) são usados para organizar classes, interfaces e subpacotes em grupos lógicos.
Eles funcionam como pastas que ajudam a manter o código estruturado e reutilizável.

- Evitam conflitos entre nomes de classes.
- Facilitam o gerenciamento do projeto.
- Melhoram a modularidade e legibilidade do código.

**Sintaxe para declarar um pacote**
> package br.com.cristianmathias.projeto;

- Isso diz à JVM que a classe faz parte do pacote br.com.cristianmathias.projeto.

**Como funciona a estrutura de ``import``**
Se uma classe quer usar outra classe que está em outro pacote, ela precisa importar essa classe.

- Sintaxe básica:
  ````java
    import nome.do.pacote.NomeDaClasse;
  ````
**Exemplos:**

1. Importar uma classe específica
````java
  import java.util.Scanner;
````
2. Importar todas as classes do pacote
````java
  import java.util.*;
````
3. Importar membros estáticos (atributos ou métodos)
````java
    import static java.lang.Math.PI;
    import static java.lang.Math.sqrt;
````
---
## Compare e contraste os recursos e componentes do Java, como: independência de plataforma, orientação a objetos, encapsulamento, etc.

### Independência de plataforma
- Significa que o mesmo código Java pode rodar em diferentes sistemas operacionais sem modificações.
- Isso é possível porque o código Java é compilado em bytecode, e esse bytecode é executado por qualquer Java Virtual Machine (JVM).

### Orientação a Objetos (OO)
- Java é uma linguagem fortemente orientada a objetos.
- Quase tudo em Java é um objeto, exceto tipos primitivos.
- Os principais pilares da OO são:
  - Encapsulamento
  - Herança
  - Polimorfismo
  - Abstração

1. **Encapsulamento**

Encapsulamento é o princípio de ocultar os detalhes internos de uma classe e proteger o acesso direto aos dados. Em vez de acessar os atributos diretamente, o código externo interage com a classe através de métodos públicos chamados get e set.
- Técnica de esconder detalhes internos de uma classe e expor somente o necessário.
- Utiliza modificadores de acesso (como private, public, protected).
- Promove segurança, reutilização e organização do código.

📌 Exemplo: uso de getters e setters para acessar atributos private.

2. **Herança**

Herança é um princípio da orientação a objetos que permite a uma classe herdar atributos e métodos de outra.
- A classe que herda é chamada de subclasse (ou classe filha).
- A classe que é herdada é chamada de superclasse (ou classe pai).
- Usa-se a palavra-chave extends.


- Permite criar novas classes a partir de classes existentes.
- A nova classe herda atributos e métodos da classe base.
- Java só permite herança simples (uma classe só pode estender uma outra classe).

3. **Polimorfismo**

Polimorfismo vem do grego e significa “muitas formas”. Em Java, é a capacidade de um objeto se comportar de diferentes formas, dependendo do contexto.
- Um mesmo método pode se comportar de formas diferentes, dependendo do contexto (ex: sobrescrita).
- Permite que um objeto seja tratado como uma instância de sua superclasse.

4. **Abstração**

Abstração é o princípio de ocultar os detalhes de implementação e expor apenas o essencial. Em Java, isso é feito com:
- Classes abstratas (abstract)
- Métodos abstratos (sem corpo, que devem ser implementados por subclasses)


- Permite definir o que uma classe faz, sem expor como ela faz.
- Utiliza classes abstract e interfaces.
- Muito útil para separar regras gerais de implementações específicas.

### Gerenciamento automático de memória
- Java possui coletor de lixo (Garbage Collector), que remove automaticamente objetos não utilizados da memória.
- Isso facilita o desenvolvimento e evita vazamentos de memória comuns em C/C++.

### Segurança
- O modelo de segurança da JVM impede que códigos maliciosos acessem áreas protegidas da máquina.
- Também permite executar código em ambientes restritos (sandbox).

### Multithreading
- Java oferece suporte nativo a programação concorrente com threads.
- Permite que múltiplas tarefas sejam executadas em paralelo, aproveitando melhor os recursos do sistema.

### Bibliotecas ricas (API)
- Java oferece amplas bibliotecas padrão, como:
  - **java.util** (coleções, datas, etc.)
  - **java.io** (entrada e saída)
  - **java.time** (API moderna de datas)
  - **java.net** (comunicação em rede)

---

# 2. Trabalhando com tipos de dados Java