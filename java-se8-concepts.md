# JAVA SE 8 (OCA)
# Noções básicas de Java

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




