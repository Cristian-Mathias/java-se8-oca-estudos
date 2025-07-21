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

### Sombreamento de Variáveis (Shadowing)

O sombreamento ocorre quando uma variável local (ou parâmetro de método) tem o mesmo nome de uma variável de instância ou de uma variável declarada em um escopo mais externo. Quando isso acontece, a variável mais interna "sombreia" a externa — ou seja, esconde seu acesso direto dentro do bloco atual.

**Quando é permitido:**

- Quando uma variável local ou um parâmetro tem o mesmo nome de um campo da classe.
- Nestes casos, usamos this para acessar o campo da classe.

````java
public class Pessoa {
    String nome;

    public void setNome(String nome) {
        this.nome = nome; // parâmetro 'nome' sombreia o campo 'nome'
    }
}
````
**Neste exemplo não ocorre sombreamento**

````java
public class Pessoa {
    String nome;

    public void setNome(String sobreNome) { 
        this.nome = sobreNome; // parâmetro 'sobreNome' é diferente do campo 'nome'
                               // nome diferentes não há sombreamento     
    }
}
````
**Por quê?**

Porque o nome do parâmetro (sobreNome) é diferente do nome da variável de instância (nome).

Logo, não existe sombra. O parâmetro sobreNome não esconde o campo nome, então o uso de this.nome = sobreNome; apenas:
- Acessa o campo nome da instância com this.nome
- Atribui a ele o valor do parâmetro sobreNome


**Quando não é permitido:**

- Quando duas variáveis com o mesmo nome são declaradas no mesmo escopo ou em blocos aninhados do mesmo método.
````java
public void exemplo() {
    int x = 10;
    int x = 5; // ❌ Erro: 'x' já foi declarado
}
````
***Dica:***

O sombreamento é comum em construtores e métodos set, onde o nome do parâmetro costuma ser igual ao nome do campo da classe.

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

### Processo de Compilação e Execução em Java

**Conceitos**

**Compilação**

É o processo em que o código-fonte escrito em Java (.java) é traduzido para bytecode (.class) pelo compilador (javac). Esse bytecode é uma linguagem intermediária que pode ser interpretada pela JVM em qualquer sistema operacional.
Se o compilador encontrar erros de sintaxe ou estrutura, ele para o processo e exibe erros de compilação.

**Execução**

É o processo em que a JVM (Java Virtual Machine) lê e executa o bytecode .class, interpretando as instruções para rodar o programa no computador.
Se ocorrer algum problema lógico durante a execução (como divisão por zero, acesso a índice inválido, etc.), ocorre um erro de execução, que geralmente lança uma Exception.

**Tabela comparativa: Erro de compilação x Erro de execução**

| Aspecto                | Erro de Compilação                        | Erro de Execução                             |
| ---------------------- | ----------------------------------------- | -------------------------------------------- |
| Quando ocorre?         | Na etapa de compilação (`javac`)          | Durante a execução do programa (JVM)         |
| O que acontece?        | O código não é convertido em bytecode     | Bytecode gerado, mas erro acontece ao rodar  |
| Sintomas               | Mensagens de erro do compilador           | Mensagens de exceção no console (Exception)  |
| Exemplo comum          | Erro de sintaxe, falta de ponto e vírgula | Divisão por zero, NullPointerException       |
| Impacto                | Impede o programa de rodar                | Programa inicia, mas pode parar abruptamente |
| Onde é detectado?      | IDE ou compilador `javac`                 | Console/terminal durante a execução          |
| Pode ser corrigido com | Ajuste na sintaxe, tipos, declarações     | Tratamento de exceções, revisão da lógica    |

**Passo a passo do processo compilação e execução**

| Passo | Descrição                                                                                         |
| ----- | ------------------------------------------------------------------------------------------------- |
| 1     | Você escreve o código-fonte em Java (.java).                                                      |
| 2     | Você solicita a compilação (no terminal ou IDE).                                                  |
| 3     | O compilador `javac` verifica o código.                                                           |
| 4     | Se não houver erros, gera o arquivo bytecode `.class`.                                            |
| 5     | Se houver erros, o processo para e mostra mensagens de erro de compilação.                        |
| 6     | Você solicita a execução do programa.                                                             |
| 7     | A JVM lê o bytecode `.class` e executa as instruções.                                             |
| 8     | Durante a execução, se ocorrer problema lógico (ex: divisão por zero), a JVM lança uma Exception. |
| 9     | Se não houver erros, o programa roda normalmente e exibe o resultado esperado.                    |

**Para fixar:**

>Para compilar um programa Java, usa-se o comando ``javac NomeDoArquivo.java``. 
> Se a classe for public, o nome do arquivo deve ser igual ao nome da classe. Caso contrário, pode ter qualquer nome.

>A execução é feita com ``java NomeDaClasse`` (sem .java ou .class). 
> O programa só será executado se a classe compilada tiver o método main com a assinatura correta: public static void main(String[] args).

>Se a classe estiver em um pacote, a execução deve usar o nome totalmente qualificado, como: ``java pacote.Classe``.


**O que é nome qualificado?**

- O nome qualificado (ou nome totalmente qualificado) é usado quando sua classe está dentro de um pacote, ou seja, quando há uma estrutura de pacotes no projeto.
- Ele é formado pelo nome do pacote + nome da classe.

**Por que usar nome qualificado?**

- Para indicar de forma única e completa onde a classe está localizada dentro da hierarquia de pacotes do projeto.
- Ajuda a JVM a localizar e executar a classe correta.

Exemplo:

Suponha que você tenha a seguinte estrutura:

````
src/
 └─ app/
     └─ Principal.java (contém package app;)
````

Para compilar:
````
javac -d . src/app/Principal.java
````
Para executar:
````
java app.Principal
````
Aqui, app.Principal é o nome qualificado.

***Importante***

**Compilação e Execução Java — Terminal vs IDE**

Pelo Terminal
- Compilação:
  - É necessário compilar todos os arquivos .java que seu programa usa, incluindo as classes importadas ou instanciadas.
  - Pode-se compilar tudo junto:
  ````bash
  javac -d . src/util/Mensagem.java src/app/Main.java
  ````
  - Ou compilar em etapas, garantindo que as dependências estejam compiladas antes:
  ````bash
  javac -d . src/util/Mensagem.java
  javac -d . -cp . src/app/Main.java
  ````
  - O parâmetro -d . indica onde criar a estrutura de pacotes (neste caso, na pasta atual).
  - O parâmetro -cp . informa ao compilador para procurar as classes já compiladas no diretório atual (.), facilitando a resolução das dependências.

- Execução:
  - Executa-se apenas a classe com o método main, usando o nome qualificado (com pacote, se houver):
  ````bash
  java app.Main
  ````
  - Não é preciso listar as dependências no comando de execução.

Pela IDE (IntelliJ, Eclipse, NetBeans, etc.)

- A IDE automatiza o processo de compilação e execução:
  - Ao clicar em Run, ela compila todas as classes necessárias, mesmo as dependências.
  - Organiza a estrutura de pacotes automaticamente.
  - Executa a classe com main sem que o usuário precise se preocupar com parâmetros extras.
- O processo fica mais simples e rápido para o desenvolvedor, especialmente em projetos grandes.

Observação
- O import no código não compila as dependências automaticamente; ele apenas informa ao compilador onde encontrar as classes.
- No terminal, o programador deve garantir que todas as classes estejam compiladas para que o programa funcione.
- Na IDE, esse gerenciamento é feito internamente.

**1- javac (Compilação)**

- O compilador javac usa o ``CLASSPATH`` para encontrar arquivos .class já existentes que são referenciados no seu código-fonte.
- Isso é necessário se você estiver compilando um arquivo .java que usa outras classes (que já foram compiladas).

**2- java (Execução)**
- A JVM usa o ``CLASSPATH`` para localizar o arquivo .class da classe principal (com o main) e também quaisquer outras classes necessárias em tempo de execução.

✅ Resumindo:

| Fase       | Ferramenta | O que faz com o `CLASSPATH`                                    |
| ---------- | ---------- | -------------------------------------------------------------- |
| Compilação | `javac`    | Localiza `.class` usados no seu código `.java`                 |
| Execução   | `java`     | Localiza `.class` para rodar seu programa (incluindo o `main`) |


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

| Conceito                        | Explicação                                                       |
| ------------------------------- | ---------------------------------------------------------------- |
| **JVM**                         | Executa o bytecode em qualquer sistema com Java instalado        |
| **Bytecode (`.class`)**         | Código intermediário gerado pelo compilador Java (`javac`)       |
| **Independência de plataforma** | Você escreve e compila uma vez, e roda em qualquer lugar com JVM |
| **Javac ≠ C compiler**          | Não gera binário nativo, mas sim bytecode portátil               |
| **Vantagem prática**            | Não precisa recompilar o código para cada sistema operacional    |


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
- Utiliza modificadores de acesso (como private).
- Promove segurança, reutilização e organização do código.

📌 Exemplo: uso de getters e setters para acessar atributos private.

Resumo:

| **Aspecto**                    | **Descrição**                                                                                                      |
| ------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| **Definição**                  | Técnica de proteger os dados internos de uma classe, controlando o acesso por métodos públicos.                    |
| **Objetivo principal**         | Esconder os detalhes da implementação e proteger os atributos contra acessos indevidos.                            |
| **Modificador usado**          | `private` para atributos; `public` para métodos `get` e `set`.                                                     |
| **Métodos comuns**             | **Getters:** retornam o valor do atributo.<br>**Setters:** definem/modificam o valor do atributo, podendo validar. |
| **Benefícios**                 | Proteção dos dados, controle de acesso, validação, melhor organização e manutenção do código.                      |
| **Como aplicar**               | Tornar atributos `private` e fornecer métodos `public` para acesso controlado.                                     |
| **Exemplo de getter**          | `public Tipo getNome() { return nome; }`                                                                           |
| **Exemplo de setter**          | `public void setNome(Tipo nome) { this.nome = nome; }` (com validação opcional)                                    |
| **Erro comum**                 | Declarar atributos como `public`, permitindo acesso direto e quebrando o encapsulamento.                           |
| **Relação com outros pilares** | Complementa a **abstração** ao esconder detalhes, facilita a manutenção e evoluções.                               |



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

Resumo:

| Conceito                                         | Descrição                                                                            | Exemplo                                                      |
| ------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------ |
| **Definição**                                    | Capacidade de um objeto assumir várias formas, comportando-se de maneiras diferentes | `Animal a = new Cachorro(); a.emitirSom();` chama `Cachorro` |
| **Polimorfismo em tempo de execução (dinâmico)** | O método chamado é decidido em tempo de execução, dependendo do tipo real do objeto  | Sobrescrita de métodos com `@Override`                       |
| **Sobrescrita (Overriding)**                     | Subclasse redefine método da superclasse para mudar comportamento                    | `Cachorro` sobrescreve `emitirSom()` de `Animal`             |
| **Sobrecarga (Overloading)**                     | Mesma classe tem vários métodos com o mesmo nome, mas assinaturas diferentes         | `somar(int a, int b)` e `somar(double a, double b)`          |
| **Referência do tipo pai**                       | Variável de tipo superclasse ou interface que aponta para objeto de subclasse        | `Animal meuAnimal = new Gato();`                             |
| **Interfaces e polimorfismo**                    | Polimorfismo também funciona com interfaces implementadas por classes diferentes     | `Animal a = new Gato(); a.emitirSom();`                      |
| **Vantagens**                                    | Reutilização de código, flexibilidade e extensibilidade                              | Facilita adicionar novas classes sem mudar código existente  |
| **Palavra-chave importante**                     | `@Override` para sobrescrever métodos corretamente                                   | Ajuda o compilador a detectar erros                          |
| **Ligação dinâmica**                             | Escolha do método a ser executado é feita em tempo de execução                       | Essencial para o polimorfismo funcionar                      |


4. **Abstração**

Abstração é o princípio de ocultar os detalhes de implementação e expor apenas o essencial. Em Java, isso é feito com:
- Classes abstratas (abstract)
- Métodos abstratos (sem corpo, que devem ser implementados por subclasses)


- Permite definir o que uma classe faz, sem expor como ela faz.
- Utiliza classes abstract e interfaces.
- Muito útil para separar regras gerais de implementações específicas.

Resumo:

| Conceito                    | Descrição                                                                                      | Exemplos/Notas                                                                     |
| --------------------------- | ---------------------------------------------------------------------------------------------- |------------------------------------------------------------------------------------|
| **Definição**               | Esconder detalhes internos e mostrar apenas o necessário para o uso do objeto                  | Ocultar complexidade, simplificar uso                                              |
| **Objetivo**                | Reduzir complexidade e aumentar a clareza do código                                            | Facilita manutenção e extensão                                                     |
| **Ferramentas Java**        | Classes abstratas e interfaces                                                                 |                                                                                    |
| **Classe abstrata**         | Classe que não pode ser instanciada diretamente, pode conter métodos abstratos e concretos     | Define o que deve ser feito, enquanto as subclasses definem como isso será feito   |
| **Método abstrato**         | Método sem corpo que deve ser implementado pelas subclasses                                    | `abstract void emitirSom();`                                                       |
| **Interface**               | Define um contrato (assinaturas de métodos) que as classes devem implementar                   | A partir do Java 8, pode conter métodos default e static                           |
| **Modificadores de acesso** | `private` para esconder detalhes; `public` para expor funcionalidades essenciais               | Parte do encapsulamento e abstração                                                |
| **Subclasse concreta**      | Classe que implementa todos os métodos abstratos da superclasse abstrata                       | Pode ser instanciada                                                               |
| **Vantagens**               | Facilita o design modular, promove reutilização e permite implementar múltiplos comportamentos | Facilita manutenção e escalabilidade                                               |


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

## Declarar e Inicializar Variáveis (Incluindo Conversão de Tipos Primitivos)

Este tópico aborda como declarar variáveis primitivas em Java, como inicializá-las corretamente e como funciona a conversão entre tipos (casting).

### Tipos Primitivos em Java

Java possui 8 tipos primitivos:

| Tipo      | Descrição                                    | Exemplo                 |
| --------- | -------------------------------------------- | ----------------------- |
| `byte`    | Números inteiros pequenos (8 bits)           | `byte b = 100;`         |
| `short`   | Números inteiros curtos (16 bits)            | `short s = 20000;`      |
| `int`     | Números inteiros padrão (32 bits)            | `int i = 100000;`       |
| `long`    | Números inteiros longos (64 bits)            | `long l = 1000000L;`    |
| `float`   | Números decimais (32 bits)                   | `float f = 2.5f;`       |
| `double`  | Números decimais com mais precisão (64 bits) | `double d = 3.14;`      |
| `char`    | Um único caractere Unicode (16 bits)         | `char c = 'A';`         |
| `boolean` | Verdadeiro ou falso                          | `boolean ativo = true;` |


### Declaração e Inicialização

**Declaração:** informar o tipo e o nome da variável.
````java
int idade;
````
**Inicialização:** atribuir um valor à variável.
````java
idade = 25;
````
Também pode ser feito em uma única linha:
````java
int idade = 25;//forma literal de atribuição
````
**Declaração + Inicialização:**
````java
String nome = "Cristian";
````
**Atribuição com base em outra variável:**
````java
idadeFutura = idade + 5;
````

---
## Diferenciar entre variáveis de referência de objeto e variáveis primitivas

Esse é um dos pilares para entender como o Java funciona em tempo de execução

### Variáveis Primitivas

Em Java, variáveis primitivas são aquelas que armazenam diretamente valores simples e básicos, como números, caracteres e valores lógicos.

Elas não armazenam referências a objetos, e sim o dado real na memória, geralmente na stack (pilha).

- Armazenam diretamente o valor.
- São tipos básicos: int, double, boolean, char, etc.
- Armazenadas na stack (pilha), com acesso rápido.
  - O que é Stack (Pilha) em Java?
    - A stack, ou pilha, é uma estrutura de memória usada para armazenar informações de forma temporária durante a execução de um programa. Ela segue o princípio:
    > LIFO → Last In, First Out (o último a entrar é o primeiro a sair)

````java
int idade = 25;
boolean ativo = true;
char letra = 'J';
````
### Variáveis de Referência

Em Java, uma variável de referência não armazena o objeto em si, mas um endereço (ou ponteiro) que aponta para um objeto armazenado no heap (área de memória dinâmica).

Quando uma variável de referência é atribuída a outra, o que é copiado é a referência, e não o objeto.
Ou seja, ambas passam a apontar para o mesmo objeto.

- Armazenam referência (endereço) para um objeto na memória.
- Referem-se a instâncias de classes (como String, Scanner, Pessoa, etc).
- A variável fica na stack, mas o objeto é alocado na heap (amontoado).
  - O que é o Heap em Java?
    - O heap é uma região da memória da JVM usada para armazenar objetos e suas propriedades durante a execução do programa.
      > - Stack = métodos + variáveis locais
      > - Heap = objetos + atributos

**Características do Heap:**

| Característica         | Descrição                                                       |
| ---------------------- | --------------------------------------------------------------- |
| Armazena objetos       | Tudo o que você cria com `new` vai pro heap.                    |
| Gerenciado pela JVM    | Usa o **Garbage Collector** para limpar objetos não utilizados. |
| Acesso via referências | Objetos no heap são acessados por **variáveis de referência**.  |
| Vida longa             | Os objetos permanecem enquanto houver uma referência a eles.    |
| Mais lento que a stack | A alocação é mais custosa, mas flexível.                        |


````java
String nome = "João";          // String é uma classe
Pessoa pessoa = new Pessoa();  // Pessoa é um objeto criado com new
````
**Importante:** A variável não contém o objeto, ela contém a referência para ele.

### Comparação lado a lado

| Característica           | Primitiva              | Referência de Objeto               |
| ------------------------ | ---------------------- | ---------------------------------- |
| Armazena                 | Valor direto           | Endereço para um objeto            |
| Tipo                     | `int`, `boolean`, etc. | `String`, `Scanner`, classes       |
| Onde vive (memória)      | Stack                  | Stack (referência) + Heap (objeto) |
| Criado com `new`?        | ❌                      | ✅ (geralmente)                     |
| Valor padrão (em campos) | 0, false, '\u0000'     | `null`                             |

---
## Saiba como ler ou escrever em campos de objetos

Este tema faz parte dos fundamentos da orientação a objetos, e o objetivo é garantir que você saiba:

- Declarar campos (variáveis de instância) em uma classe.
- Criar objetos.
- Acessar (ler) e modificar (escrever) esses campos por meio de referências de objeto.
- Compreender a diferença entre campos de instância e variáveis locais.
- Evitar erros comuns como NullPointerException.

1. **Campos de objeto (variáveis de instância)**

- São declarados dentro da classe, mas fora dos métodos.
- Pertencem a cada instância (objeto) da classe.
- São armazenados na heap.
- Recebem valores padrão se não forem inicializados.

````java
class Pessoa {
    String nome;   // campo
    int idade;     // campo
}
````
2. **Criando um objeto**

- Você usa new para criar o objeto na memória (heap) e armazenar a referência na stack.

**Explicação detalhada da linha:**
````java
Pessoa p = new Pessoa(); // 'p' é uma referência para o objeto
````
Essa linha é muito importante no Java, pois combina declaração de referência, alocação de memória e construção do objeto.

| Parte do código     | O que representa                                                                 |
| ------------------- | -------------------------------------------------------------------------------- |
| `Pessoa`            | É o **tipo do objeto** (classe).                                                 |
| `p`                 | É uma **variável de referência** — **fica na stack**.                            |
| `new`               | Palavra-chave que **cria um novo objeto na heap**.                               |
| `Pessoa()`          | É a **chamada do construtor da classe Pessoa** (pode ser implícito ou definido). |
| `new Pessoa()`      | Cria um **objeto real** em memória (na **heap**) e retorna o **endereço dele**.  |
| `p = new Pessoa();` | A variável `p` recebe a **referência (endereço)** do objeto criado na heap.      |

**Modelo de memória (simplificado)**

Vamos imaginar isso em termos de **stack** e **heap**:

**Heap (memória para objetos):**

- Contém o objeto real criado pela classe Pessoa, com seus campos/atributos:
````
Objeto Pessoa (ex: endereço 0x1234)
 ├── nome  = null
 └── idade = 0
````

**Stack (memória para variáveis locais):**

- Contém a variável de referência p, que aponta para o objeto na heap:
````
main():
 └── p ──► endereço 0x1234 (referência para o objeto Pessoa)
````
**Visual simplificado:**

````
Stack:                             Heap:
+---------+                      +----------------+
|   p     | ----------+--------►| Pessoa objeto   |
|         |           |         | nome  = null    |
|         |           |         | idade = 0       |
+---------+           |         +----------------+
                      |
            (referência para o objeto)

````
**O que acontece em tempo de execução**

1. ``new Pessoa()``:
   - Cria um novo objeto Pessoa na heap.
   - Seus campos (nome, idade) recebem valores padrão: null e 0.
2. ``p =``:
   - A variável p (na stack) armazena o endereço do objeto recém-criado.
3. Agora, sempre que você fizer p.nome ou p.idade, estará acessando os dados dentro do objeto na heap, usando a ponte (referência) p.

**Observações importantes:**
- A variável p não é o objeto, é apenas uma referência (endereço).
- O objeto real vive na heap.
- Se você fizer p = null;, a variável deixa de apontar para o objeto, mas o objeto pode continuar existindo na heap (até o Garbage Collector removê-lo).

**Resumo mental:**

>Pessoa p = new Pessoa(); cria um objeto na heap, e p guarda a referência na stack.
---

3. **Lendo campos (acessando)**

- Usa a sintaxe: referencia.nomeDoCampo

````java
System.out.println(p.nome); // imprime o valor atual de nome (ex: null)
````
4. **Escrevendo campos (modificando)**

- Usa a mesma sintaxe para atribuir valores:
````java
p.nome = "João";
p.idade = 30;
````
⚠️ **Atenção com null**

- Se a referência do objeto for null, tentar acessar um campo causará NullPointerException.

````java
Pessoa p = null;
System.out.println(p.nome); // ERRO em tempo de execução
````
📌 **Resumo rápido (mental map):**

| Conceito                    | Exemplo                            | Onde está na memória     |
| --------------------------- | ---------------------------------- | ------------------------ |
| Campo de instância          | `String nome;`                     | Heap (objeto)            |
| Acesso ao campo             | `p.nome`                           | Via referência           |
| Escrita                     | `p.nome = "João";`                 | Modifica o objeto        |
| Leitura                     | `System.out.println(p.nome);`      | Lê o valor atual         |
| Valor padrão (campo)        | `null` (para String)               | Se não inicializado      |
| Variável local (não campo!) | `String nome;` dentro de um método | Stack (sem valor padrão) |

---
## Explicar o ciclo de vida de um objeto (criação, “desreferência por reatribuição” e coleta de lixo)

Em Java, o ciclo de vida de um objeto envolve 3 fases principais:

1. Criação do objeto
2. Desreferência (por reatribuição ou escopo)
3. Coleta de lixo (Garbage Collection)

### 1. Criação do objeto

Quando você cria um objeto com o operador new, a JVM aloca memória no heap para armazená-lo:

````java
Pessoa p = new Pessoa(); // Objeto criado no heap
````
- p é uma variável de referência.
- new Pessoa() cria um objeto na memória.
- A variável p aponta para o objeto.

### 2. Desreferência (perda da referência)

Um objeto se torna inacessível (desreferenciado) quando não há mais variáveis que o referenciem. Isso pode acontecer de duas formas principais:

a) Por reatribuição:

````java
Pessoa p = new Pessoa(); // objeto1
p = new Pessoa();        // objeto1 agora está desreferenciado
````
- A primeira instância de Pessoa não é mais acessível após a segunda atribuição.
- O objeto antigo continua existindo, mas sem nenhuma referência.

b) Por fim de escopo:

````java
void metodo() {
    Pessoa p = new Pessoa(); // acessível dentro do método
} // Ao sair do método, 'p' é destruída e o objeto pode ser coletado
````
### 3. Coleta de lixo (Garbage Collection)

Java gerencia a memória automaticamente com o Garbage Collector (GC).
Quando um objeto não tem mais referência, ele fica elegível para ser coletado.

Características:

- Não há garantia de quando o objeto será coletado.
- Você não precisa liberar a memória manualmente.
- É possível sugerir a coleta com System.gc(), mas não é garantido que ocorra.

````java
public class CicloObjeto {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria");
        Pessoa p2 = new Pessoa("João");

        p1 = null;     // Maria está elegível para GC
        p2 = new Pessoa("Ana"); // João está elegível para GC
    }
}
````
Neste exemplo:

- Maria → perdeu a referência ao fazer p1 = null
- João → perdeu a referência quando p2 foi sobrescrita com Ana

**Observações**
- A coleta de lixo não é determinística.
    - Não há garantia exata de quando o coletor de lixo vai rodar.
    - O GC é acionado pela JVM conforme a necessidade, como por exemplo quando a memória está baixa.
    - Você não pode controlar diretamente o momento da coleta, mesmo chamando System.gc() — isso é apenas uma sugestão para a JVM.
    - Objetos elegíveis para coleta podem permanecer na memória por um tempo indefinido antes de serem efetivamente removidos.
    - Isso significa que o programa não deve depender do GC para executar alguma ação crítica.
- Objetos sem referência não são coletados imediatamente.
- A JVM usa algoritmos de GC para decidir o momento certo da coleta.
---

## Desenvolver código que utilize classes wrapper como Boolean, Double e Integer

As classes wrapper (ou "embrulhadoras") são classes da API Java que representam os tipos primitivos como objetos.

| Primitivo               | Wrapper     |
| ----------------------- | ----------- |
| `int`                   | `Integer`   |
| `double`                | `Double`    |
| `boolean`               | `Boolean`   |
| `char`                  | `Character` |
| (e assim por diante...) |             |

**Por que usar wrappers?**

- Coleções genéricas (como ArrayList) não aceitam tipos primitivos, apenas objetos.
- Wrappers permitem conversão entre strings e números.
- Eles possuem métodos úteis, como parseInt(), valueOf(), compareTo(), etc.

### Integer

***Integer*** é uma classe final do Java que encapsula um valor do tipo primitivo int em um objeto. Ela permite que valores inteiros sejam tratados como objetos, oferecendo métodos úteis para manipulação, comparação, conversão e análise de valores inteiros.

**Principais características da classe Integer:**

- Está no pacote java.lang, portanto, pode ser usada sem necessidade de importação.
- É imutável (seu valor não pode ser alterado depois de criado).
- Permite conversão entre String e int, e vice-versa.
- Permite comparação entre objetos Integer.
- Suporta autoboxing e unboxing desde o Java 5:
  - Autoboxing: conversão automática de int para Integer, sem necessidade de usar new ou valueOf explicitamente.
  - Unboxing: conversão automática de Integer para int


**Exemplos de uso:**
````java
public class Teste {

    public static void main(String[] args) {

        // Criação de um Integer a partir de um valor int (autoboxing)
        // O compilador converte automaticamente o int 10 em Integer.valueOf(10)
        Integer num1 = 10;

        // Conversão de uma String para Integer usando valueOf (conversão explícita)
        Integer num2 = Integer.valueOf("123");
        System.out.println("num2 (Integer criado a partir de String): " + num2); // Saída: 123

        // Conversão de Integer para int (unboxing)
        int x = num2; // Ocorre automaticamente: num2.intValue()
        System.out.println("x (valor int extraído de num2): " + x); // Saída: 123

        // Comparação entre Integer e int (autoboxing do int para Integer antes de comparar)
        boolean isEqual = num2.equals(x); // x vira Integer(123) internamente
        System.out.println("num2.equals(x): " + isEqual); // Saída: true

        // Conversão de Integer para String
        String str = num1.toString(); // str = "10"
        System.out.println("str (num1 convertido para String): " + str); // Saída: 10

        // Comparação entre Integer e String (tipos diferentes)
        boolean isEqual2 = num1.equals(str); // false: tipos diferentes (Integer vs String)
        System.out.println("num1.equals(str): " + isEqual2); // Saída: false
    }
}

````

**Alguns métodos úteis da classe Integer:**

| Método                       | Descrição                                            |
| ---------------------------- | ---------------------------------------------------- |
| `intValue()`                 | Retorna o valor primitivo `int` do objeto `Integer`  |
| `parseInt(String s)`         | Converte uma `String` para um `int`                  |
| `valueOf(String s)`          | Converte uma `String` para um `Integer`              |
| `compareTo(Integer another)` | Compara dois objetos `Integer`                       |
| `toString()`                 | Retorna o valor como `String`                        |
| `MAX_VALUE` / `MIN_VALUE`    | Constantes que representam o maior/menor valor `int` |

**Aplicações práticas:**

- Necessário quando é preciso usar tipos primitivos em coleções genéricas (como ArrayList<Integer>)
- Quando se deseja aproveitar os métodos utilitários da classe para conversões e comparações.
- Em operações com APIs que trabalham com objetos ao invés de tipos primitivos.

**Cache no Integer (Autoboxing)**

***O que é o cache do Integer?***

O cache do Integer é uma otimização interna da linguagem Java que reutiliza objetos Integer para valores inteiros entre -128 e 127, com o objetivo de economizar memória e melhorar a performance.

Essa reutilização ocorre quando usamos autoboxing ou o método Integer.valueOf(int).

**Exemplos:**

Dentro do cache com o mesmo valor
````java
        // ----------- DENTRO DO CACHE (entre -128 e 127) ----------- //
        Integer a = 127;  // valor dentro do intervalo de cache do Integer
        Integer b = 127;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Como 127 está no intervalo do cache (-128 a 127),
        // Java reutiliza o mesmo objeto Integer para 'a' e 'b'
        System.out.println("a == b? " + (a == b)); // true (mesmo objeto na memória)

        // Mostra os "endereços simulados" dos objetos (serão iguais)
        System.out.println("a identityHashCode = " + System.identityHashCode(a));
        System.out.println("b identityHashCode = " + System.identityHashCode(b));
````
**Importante:**

- ``==`` compara referência (memória).
- ``.equals()`` compara valores.
- Mesmo dentro do cache, se os valores forem diferentes, os objetos também serão diferentes.

Dentro do cache com valor diferente
````java
        // ----------- DENTRO DO CACHE (entre -128 e 127) ----------- //
        Integer a = 127;  // valor dentro do intervalo de cache do Integer
        Integer b = 126;  // também dentro do cache

        System.out.println("a = " + a); // 127
        System.out.println("b = " + b); // 126

        /*
         * ATENÇÃO:
         * Apesar de ambos os valores estarem dentro do intervalo de cache do Integer (-128 a 127),
         * os objetos 'a' e 'b' referenciam valores diferentes, então eles são objetos distintos no cache.
         *
         * O cache do Integer mantém UM objeto para CADA valor no intervalo.
         * Portanto, 'a' e 'b' apontam para objetos diferentes dentro do cache.
         *
         * Logo: (a == b) → false
         */
        System.out.println("a == b? " + (a == b)); // false (objetos diferentes, pois os valores são diferentes)

        // Mostra os "endereços simulados" dos objetos (serão diferentes)
        System.out.println("a identityHashCode = " + System.identityHashCode(a));
        System.out.println("b identityHashCode = " + System.identityHashCode(b));
    }
````

Fora do cache
````java
        // ----------- FORA DO CACHE (> 127 ou < -128) ----------- //
        Integer a2 = 128;
        Integer b2 = 128;

        /*
         * Quando usamos autoboxing (Integer a2 = 128), o compilador chama internamente:
         *    Integer.valueOf(128)
         * O método valueOf verifica se o valor está no intervalo do cache [-128, 127].
         *
         * Como 128 está FORA do cache, a JVM CRIA UM NOVO OBJETO Integer para cada atribuição.
         * Assim, 'a2' e 'b2' são objetos distintos, embora contenham o mesmo valor.
         */
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

        // '==' compara as referências (endereços de memória). Como são objetos distintos, retorna false.
        System.out.println("a2 == b2? " + (a2 == b2)); // false

        // .equals() compara os VALORES dos objetos, e não as referências.
        System.out.println("a2.equals(b2)? " + a2.equals(b2)); // true

        // Mostra os identityHashCodes (endereços simulados na memória)
        // Como são objetos diferentes, os códigos também são diferentes.
        System.out.println("a2 identityHashCode = " + System.identityHashCode(a2));
        System.out.println("b2 identityHashCode = " + System.identityHashCode(b2));
    }
````
***Resumo: Cache de Integer em Java***

| Situação                                    | Valor atribuído                          | Resultado com `==`                    | Motivo                                                                   |
| ------------------------------------------- | ---------------------------------------- | ------------------------------------- | ------------------------------------------------------------------------ |
| **Dentro do cache**                         | `Integer a = 127;`<br>`Integer b = 127;` | `true`                                | Java reutiliza o mesmo objeto do cache para valores entre **-128 e 127** |
| **Fora do cache**                           | `Integer a = 128;`<br>`Integer b = 128;` | `false`                               | Java cria **novos objetos** fora do intervalo de cache                   |
| **Dentro do cache, mas valores diferentes** | `Integer a = 127;`<br>`Integer b = 126;` | `false`                               | Mesmo no cache, **valores diferentes geram objetos diferentes**          |
| **Comparação com `.equals()`**              | `a.equals(b)`                            | `true` se valores forem iguais        | `.equals()` compara **valores**, não referências                         |
| **Comparação com `==`**                     | `a == b`                                 | `true` ou `false` dependendo do cache | `==` compara **referência** (endereços de memória)                       |

**Representação na memória**

````
┌────────────┐        ┌────────────┐
│  Integer a │──────▶│ valor: 127 │
└────────────┘        └────────────┘
│                  
│ mesma referência (reutilizado do cache)
▼
┌────────────┐
│  Integer b │
└────────────┘

=== agora fora do cache ===

┌────────────┐        ┌────────────┐
│  Integer x │──────▶│ valor: 128 │
└────────────┘        └────────────┘

┌────────────┐        ┌────────────┐
│  Integer y │──────▶│ valor: 128 │
└────────────┘        └────────────┘

=== fora do cache (>127 ou < -128) ===

┌────────────┐        ┌────────────┐
│  Integer x │──────▶│ valor: 150 │
└────────────┘        └────────────┘

┌────────────┐        ┌────────────┐
│  Integer y │──────▶│ valor: 200 │
└────────────┘        └────────────┘
````

### Boolean

A classe Boolean faz parte do pacote java.lang e é a classe wrapper (invólucro) para o tipo primitivo boolean.
Ela permite representar valores true ou false como objetos, além de fornecer métodos utilitários para conversões e comparações.

**Principais características:**

- A classe Boolean representa um valor lógico: true, false ou null.
- Pode ser usada em coleções (List<Boolean>) e APIs que exigem objetos.
- Suporta autoboxing e unboxing (desde o Java 5).
- É imutável — uma vez criado, o valor não pode ser alterado.

**Exemplos de uso:**

````java
public class Teste {

    public static void main(String[] args) {

        // Exemplo 1: Autoboxing (conversão automática de boolean para Boolean)
        // O valor primitivo 'true' é convertido automaticamente para o objeto Boolean
        boolean ativo = true;
        Boolean wrapperAtivo = ativo; // autoboxing
        System.out.println("Autoboxing: wrapperAtivo = " + wrapperAtivo); // true

        // Exemplo 2: Unboxing (conversão automática de Boolean para boolean)
        // O objeto Boolean é convertido automaticamente para o tipo primitivo boolean
        Boolean online = Boolean.TRUE;
        boolean status = online; // unboxing
        System.out.println("Unboxing: status = " + status); // true

        // Exemplo 3: Conversão de String para Boolean
        // O método valueOf(String) converte a string para Boolean (true apenas se for "true" ignorando maiúsculas/minúsculas)
        String str1 = "true";
        String str2 = "false";
        String str3 = "qualquer coisa"; // qualquer valor diferente de "true" retorna false

        Boolean b1 = Boolean.valueOf(str1); // true
        Boolean b2 = Boolean.valueOf(str2); // false
        Boolean b3 = Boolean.valueOf(str3); // false

        // Exibindo os resultados das conversões de String para Boolean
        System.out.println("String 'true' → Boolean: " + b1);   // true
        System.out.println("String 'false' → Boolean: " + b2);  // false
        System.out.println("String inválida → Boolean: " + b3); // false

        // Exemplo 4: Comparação entre objetos Boolean usando equals()
        // O método equals compara os valores internos dos objetos Boolean
        Boolean x = Boolean.TRUE;
        Boolean y = Boolean.valueOf("true"); // também é true
        System.out.println("x.equals(y): " + x.equals(y)); // true
    }
}
````


**Métodos úteis da classe Boolean:**

| Método                         | Descrição                                           |
| ------------------------------ | --------------------------------------------------- |
| `booleanValue()`               | Retorna o valor primitivo (`true` ou `false`)       |
| `parseBoolean(String s)`       | Converte uma string para `boolean` primitivo        |
| `valueOf(String s)`            | Converte string para `Boolean` (objeto)             |
| `toString()`                   | Retorna o valor como String (`"true"` ou `"false"`) |
| `equals(Object obj)`           | Compara dois objetos `Boolean`                      |
| `Boolean.TRUE / Boolean.FALSE` | Constantes prontas para uso                         |

**Cache da Classe Boolean**

| Situação                         | Código exemplo                        | Usa cache? | Resultado de `==` com `Boolean.TRUE`/`FALSE` | Observação                |
| -------------------------------- |---------------------------------------| ---------- | -------------------------------------------- | ------------------------- |
| Autoboxing com `true`            | `Boolean b = true;`                   | ✅ Sim      | `b == Boolean.TRUE → true`                   | Usa cache via `valueOf()` |
| Autoboxing com `false`           | `Boolean b = false;`                  | ✅ Sim      | `b == Boolean.FALSE → true`                  | Usa cache via `valueOf()` |
| Usando `Boolean.valueOf(true)`   | `Boolean b = Boolean.valueOf(true);`  | ✅ Sim      | `b == Boolean.TRUE → true`                   | Forma recomendada         |
| Usando `Boolean.valueOf(false)`  | `Boolean b = Boolean.valueOf(false);` | ✅ Sim      | `b == Boolean.FALSE → true`                  | Forma recomendada         |
| Usando `Boolean.TRUE` ou `FALSE` | `Boolean b = Boolean.TRUE;`           | ✅ Sim      | `b == Boolean.TRUE → true`                   | Objeto singleton          |
| Criando com `new Boolean(true)`  | `Boolean b = new Boolean(true);(deprecated)`   | ❌ Não      | `b == Boolean.TRUE → false`                  | Cria novo objeto (evitar) |
| Criando com `new Boolean(false)` | `Boolean b = new Boolean(false);(deprecated)`  | ❌ Não      | `b == Boolean.FALSE → false`                 | Cria novo objeto (evitar) |
| Comparação por `.equals()`       | `b.equals(Boolean.TRUE)`              | ✅ Sim      | `true` (mesmo valor)                         | Funciona mesmo sem cache  |

### Double

Double é uma das classes wrapper que encapsula o tipo primitivo double como um objeto. Faz parte do pacote java.lang e herda de Number.

**Funções principais da classe Double:**

- Conversão entre String e double.
- Comparação de valores com métodos como compareTo() e equals().
- Constantes como Double.MAX_VALUE e Double.MIN_VALUE.
- Conversão automática (autoboxing/unboxing) entre double e Double.

**Autoboxing e Unboxing**

- Autoboxing: conversão automática de double → Double.
- Unboxing: conversão automática de Double → double.

````java
Double d = 20.0; // autoboxing
double p = d;    // unboxing
````

**Existe cache para Double?**

- Não. 
- A classe Double não utiliza cache para valores pequenos, como acontece com Integer, Byte, Short e Character.

Comparação com Integer:
````java
Integer i1 = 100;
Integer i2 = 100;
System.out.println(i1 == i2); // true (cache entre -128 e 127)

Double d1 = 100.0;
Double d2 = 100.0;
System.out.println(d1 == d2); // false (sem cache)
````
A razão é que o wrapper Double sempre cria um novo objeto com valueOf() (a menos que a JVM decida otimizar em tempo de execução).



**Resumo**

- Double não tem cache de objetos.
- Cada chamada a Double.valueOf() cria um novo objeto.
- Comparações com == em Double geralmente dão false, mesmo para valores iguais.
- Use .equals() para comparar valores de Double.

#### Infinity em Java

Infinity (infinito) é um valor especial representado pelo tipo double (e float) em Java quando ocorre uma divisão de número não zero por zero.

````java
double x = 10.0 / 0.0;
System.out.println(x); // Imprime: Infinity
````
- Não lança exceção (diferente de int, que lança ArithmeticException).
- Existe também -Infinity, que resulta de divisão negativa:

````java
double x = -10.0 / 0.0; // -Infinity
````
Verificação:

````java
Double valor = 1.0 / 0.0;
System.out.println(valor.isInfinite()); // true
````
#### NaN (Not a Number) em Java

NaN é um valor especial do tipo double (ou float) que representa um resultado indefinido ou não numérico, como uma operação matemática inválida.

````java
double y = 0.0 / 0.0;
System.out.println(y); // Imprime: NaN
````

Ocorrências comuns:

- 0.0 / 0.0
- Math.sqrt(-1) (raiz de número negativo)
- Math.log(-5)

Verificação:

````java
Double valor = 0.0 / 0.0;
System.out.println(valor.isNaN()); // true
````

**Comparativo: Infinity vs NaN**

| Característica             | `Infinity`                      | `NaN`                        |
| -------------------------- | ------------------------------- | ---------------------------- |
| Representa                 | Infinito matemático             | Valor indefinido ou inválido |
| Exemplo                    | `10.0 / 0.0`                    | `0.0 / 0.0`                  |
| Exceção?                   | Não                             | Não                          |
| Pode ser positivo/negativo | Sim (`Infinity` / `-Infinity`)  | Não (só existe `NaN`)        |
| Teste com método           | `isInfinite()`                  | `isNaN()`                    |
| Comparação com `==`        | `Infinity == Infinity` → `true` | `NaN == NaN` → `false` (!!)  |

***Curiosidade importante sobre NaN***

````java
System.out.println(Double.NaN == Double.NaN); // false (!)
System.out.println(Double.isNaN(Double.NaN)); // true
````
>NaN nunca é igual a si mesmo. Sempre use .isNaN() para testá-lo!





