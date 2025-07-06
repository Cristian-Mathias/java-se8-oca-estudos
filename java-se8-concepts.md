#  Escopo de Variáveis

> O escopo de uma variável define **onde ela pode ser usada (acessada)** dentro do código.

Em Java, as variáveis podem ter diferentes tipos de escopo dependendo de onde e como são declaradas. Abaixo estão os principais tipos:

---

##  Variável de Instância
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

##  Variável de Classe (Estática)

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

##  Variável Local

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
##  Variável de Bloco

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