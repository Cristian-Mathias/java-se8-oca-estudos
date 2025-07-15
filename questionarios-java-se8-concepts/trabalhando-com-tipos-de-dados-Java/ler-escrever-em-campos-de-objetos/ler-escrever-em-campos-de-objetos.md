## 1- Dado o código abaixo, qual será a saída?
````java
class Pessoa {
    String nome;
    int idade;
}

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Ana";
        p.idade = 28;

        System.out.println(p.nome);
        System.out.println(p.idade);
    }
}
````
Pergunta:

Qual será a saída impressa no console?

(Escreva exatamente o que será exibido, linha por linha.)

>R: 
> - 1° linha Ana
> - 2° linha 28

## 2- Observe o código abaixo:
````java
class Pessoa {
    String nome;
}

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = p1;
        p2.nome = "Carlos";

        System.out.println(p1.nome);
    }
}
````
Pergunta:

O que será impresso no console? E por quê?
>R: A saída será:
>- Carlos
>- p1 e p2 apontam para o mesmo objeto na memória (heap).

````java
Pessoa p1 = new Pessoa(); // cria um novo objeto na heap
Pessoa p2 = p1;           // p2 recebe a MESMA referência de p1
````

3- Observe o código:
````java
class Livro {
    String titulo;
}

public class Teste {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro();

        l1.titulo = "Java para Iniciantes";
        l2.titulo = "Dominando Java";

        System.out.println(l1.titulo);
        System.out.println(l2.titulo);
    }
}
````
Pergunta:

Qual será a saída? Esses objetos compartilham os mesmos campos?

>R: 
> - 1° linha: Java para Iniciantes  
> - 2° linha: Dominando Java

- os objetos não compartilham os mesmos campos.

- l1 e l2 são objetos diferentes na heap, mesmo que da mesma classe.
- Cada um tem seu próprio campo titulo.
- Portanto, mudar o titulo de um não afeta o outro.



4- Considere:
````java
class Aluno {
    String nome;
}

public class Teste {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        System.out.println(a.nome);
    }
}
````
Pergunta:

O que será impresso no console? E por quê?

>R: A saída será:
>- null
>- o campo nome é uma variável de instância do tipo String e não foi atribuído nenhum valor. Por isso, assume o valor null por padrão.


## 5- Considere o código:
````java
class Carro {
    String modelo = "Civic";
}

public class Teste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = c1;

        c2.modelo = "Corolla";

        System.out.println(c1.modelo);
    }
}
````
Pergunta:

Qual será a saída? Explique o motivo.

>R: A saída será:
>- Corolla
>- E a explicação está perfeita: tanto c1 quanto c2 apontam para o mesmo objeto na memória (heap), portanto alterar modelo via c2 afeta o que é lido por c1.

## 6- Considere o código:
````java
class Conta {
    String titular;
    double saldo;
}

public class Teste {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 100.0;

        Conta c2 = new Conta();
        System.out.println(c2.saldo);
    }
}
````
Pergunta:

Qual será a saída? Explique o motivo com foco no valor do campo saldo.

>R: 0.0

- A variável saldo é do tipo double, que é um tipo primitivo em Java.
- Campos (variáveis de instância) primitivos têm valores padrão quando não são atribuídos explicitamente.

## 7- Considere o código:
````java
class Cliente {
    String nome = "Sem nome";
}

public class Teste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println(c.nome);
    }
}
````
Pergunta:

O que será impresso? Por que esse valor é diferente de null, mesmo sem atribuição no main()?

>R:A saída será:
>- Sem nome
- o campo nome da classe Cliente foi inicializado diretamente na declaração
- Esse valor já está definido quando o objeto é criado com new Cliente().
- Ou seja, mesmo que o campo não seja atribuído no main(), ele já contém "Sem nome" ao ser instanciado.

## 8- Considere agora:
````java
class Animal {
    String nome;
}

public class Teste {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.nome = "Cachorro";

        System.out.println(a2.nome);
    }
}
````
Pergunta:

Qual será a saída? Explique o que aconteceu com o campo nome de a2.

>R:A saída será:
>- null
- o objeto a2 foi criado com new, mas nenhum valor foi atribuído ao campo nome, então ele permanece com o valor padrão null.

## 9- Considere o código:
````java
class Usuario {
    String login;
}

public class Teste {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.login = "admin";

        Usuario u2 = u1;
        u2.login = "guest";

        System.out.println(u1.login);
    }
}
````
Pergunta:

Qual será a saída? E por quê?

>R: A saída será:
>- guest

O que acontece?
- Usuario u1 = new Usuario(); — cria um novo objeto Usuario na heap e u1 aponta para ele.
- u1.login = "admin"; — atribui o valor "admin" ao campo login do objeto referenciado por u1.
- Usuario u2 = u1; — u2 recebe a mesma referência que u1, apontando para o mesmo objeto.
- u2.login = "guest"; — altera o campo login do mesmo objeto para "guest".
- System.out.println(u1.login); — imprime o valor atual do campo login desse objeto.

## 10- Considere o código:
````java
class Pessoa {
    String nome;
}

public class Teste {
    public static void main(String[] args) {
        Pessoa p = null;
        System.out.println(p.nome);
    }
}
````
Pergunta:

Esse código compila? O que acontece se ele for executado? Explique.

>R: NullPointerException

- A variável p foi declarada e inicializada com null
- Isso significa que p não aponta para nenhum objeto real na heap.
- Quando o código tenta acessar p.nome, ele está tentando acessar um campo (nome) de algo que não existe.
- A JVM então lança uma exceção

- Você só pode acessar campos (ou métodos) de uma variável que aponte para um objeto válido. Se ela estiver null, qualquer tentativa de uso com '.' (ponto) causará uma NullPointerException.
