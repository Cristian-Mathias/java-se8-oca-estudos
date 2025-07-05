#  Escopo de Variáveis

> O escopo de uma variável define **onde ela pode ser usada (acessada)** dentro do código.

Em Java, as variáveis podem ter diferentes tipos de escopo dependendo de onde e como são declaradas. Abaixo estão os principais tipos:

---

##  Variável de Instância

- Declarada **dentro da classe**, mas **fora de métodos, construtores ou blocos**.
- Cada **objeto da classe** tem sua **própria cópia** dessa variável.
- Só pode ser acessada diretamente **dentro da própria classe** (ou via objeto em outra classe).
- Visível em todos os **métodos não estáticos** da classe.
- Pode ser acessada:
    - Diretamente pelo nome:
      ```java
      System.out.println(numeroClasse);
      ```
    - Ou com `this`:
      ```java
      System.out.println(this.numeroClasse);
      ```

---

##  Variável de Classe (Estática)

- Declarada dentro da classe com a palavra-chave `static`.
- **Pertence à classe** e não a objetos individuais.
- Há **uma única cópia compartilhada** entre todas as instâncias da classe.
- Pode ser acessada:
    - Diretamente por **métodos estáticos** da própria classe.
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