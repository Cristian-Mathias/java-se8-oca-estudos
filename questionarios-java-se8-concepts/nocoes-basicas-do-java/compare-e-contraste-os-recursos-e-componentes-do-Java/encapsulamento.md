## 1- O que é encapsulamento em programação orientada a objetos?

>R: Encapsulamento é o ato de proteger os dados internos de uma classe. Para isso:
>- Os atributos são private (acesso restrito à própria classe).
>- Outras classes só podem ler ou modificar esses dados usando métodos públicos:
>    - getNome() → lê
>    - setNome(...) → altera
>- Isso evita que outras partes do programa alterem diretamente o estado do objeto de forma indevida ou incorreta.


## 2- Qual modificador de acesso você deve usar em um atributo para garantir o encapsulamento?
- (A) public
- (B) private
- (C) protected
- (D) default (sem modificador)

>R: B

Explicação:
- O modificador private restringe o acesso ao atributo apenas dentro da própria classe, o que é essencial para aplicar encapsulamento.
- Depois, usamos métodos public (get e set) para permitir o acesso controlado aos dados.


## 3- Observe o seguinte código:
````java
public class Pessoa {
    public String nome;
}
````
Esse código aplica corretamente o encapsulamento? Por quê?

>R: O código não aplica corretamente o encapsulamento, porque o atributo nome está com o modificador public.
Isso permite que qualquer classe acesse e modifique diretamente o valor de nome, sem nenhum controle.

## 4- Por que é importante usar métodos set em vez de permitir que atributos sejam modificados diretamente?

>R: Usar métodos set (e também get) é importante porque:
>- Mantém o encapsulamento: os atributos continuam private.
>- Restringe o acesso direto: outras classes não acessam os dados internamente.
>- Permite validações: por exemplo, impedir que um número negativo seja atribuído a um preço ou idade.

Exemplo com validação:
````java
public void setIdade(int idade) {
    if (idade >= 0) {
        this.idade = idade;
    }
}
````
## 5- Em um cenário bem encapsulado, o que acontece se você tentar acessar diretamente um atributo private de fora da classe?
- (A) Acesso normal
- (B) Gera um aviso, mas compila
- (C) Gera erro de compilação
- (D) O valor é retornado como null

>R: C
 
Explicação:
- Quando um atributo está marcado como private, ele não pode ser acessado diretamente de fora da classe. Se tentar fazer isso, o compilador exibirá um erro.

## 6- Qual é o nome da convenção de métodos usados para acessar (get) e modificar (set) atributos encapsulados?
- (A) Propriedades públicas
- (B) Métodos auxiliares
- (C) Getters e setters
- (D) Construtores e métodos de fábrica

>R: C

Explicação:
- Em Java, os métodos usados para acessar e modificar atributos encapsulados são chamados de getters e setters, seguindo esta convenção:
    - Getter → getNome() → retorna o valor do atributo
    - Setter → setNome("valor") → define/modifica o valor do atributo
- Eles permitem acesso controlado aos atributos privados de uma classe.

## 7- Dado o seguinte trecho:
````java
private double saldo;
````
Como seria um método getter correto para esse atributo?
- (A) public double saldo()
- (B) public double getSaldo()
- (C) private double getSaldo()
- (D) public void setSaldo()

>R: B

Explicação:
- Para que o método seja acessível a partir de outras classes, o getter deve ser declarado com o modificador public.
- public double getSaldo() é o padrão para um getter que retorna o valor do atributo saldo.


## 8- Por que é útil fazer validações dentro de um método set?
- (A) Para facilitar a herança
- (B) Para economizar código
- (C) Para impedir valores inválidos
- (D) Para deixar os atributos públicos mais acessíveis

>R: C

Explicação:
- Um dos grandes benefícios do encapsulamento é que ele permite validar os dados antes de alterá-los.
- Isso é feito dentro dos métodos set, evitando que o objeto entre em um estado inválido.
````java
public void setPreco(double preco) {
    if (preco >= 0) {
        this.preco = preco;
    } else {
        System.out.println("Preço inválido!");
    }
}
````
## 9- Qual das opções mais respeita o encapsulamento?

(A):
````java
public class Produto {
    public double preco;
}
````
(B):
````java
public class Produto {
    private double preco;
}
````
(C):
````java
public class Produto {
    private double preco;
    
    public double getPreco() { 
        return preco; 
    }
    public void setPreco(double preco) { 
        this.preco = preco; 
    }
}
````
>R: C

Explicação:
- O atributo está private, e existem os métodos getPreco() e setPreco(...), permitindo acesso controlado.
- Isso é encapsulamento completo.

## 10- Encapsulamento contribui principalmente para:
- (A) Executar código mais rápido
- (B) Reutilizar código com menos memória
- (C) Melhorar a organização e segurança dos dados
- (D) Criar interfaces gráficas com mais facilidade

>R: C

Explicação:
- O encapsulamento tem como foco principal:
    - Proteger os dados internos do objeto.
    - Controlar o acesso a esses dados, evitando alterações indevidas.
    - Melhorar a manutenção e organização do código.
