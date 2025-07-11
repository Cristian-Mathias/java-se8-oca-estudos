## 1- O que é uma variável de instância em Java e onde ela é declarada?

> R:Variável de instância:
>- É uma variável que pertence a cada objeto criado a partir da classe.
>- Ou seja, cada objeto tem sua própria cópia dessa variável.
>- Ela é declarada dentro da classe, mas fora de métodos, blocos e construtores.
>- Não usa static, pois isso tornaria a variável de classe (compartilhada por todos).

## 2- Variáveis de instância podem ser acessadas dentro de métodos static? Se sim, como?
Explique.

> R:
>- Variáveis de instância não podem ser acessadas diretamente dentro de métodos static, porque:
>  - Métodos static pertencem à classe, e
>  - Variáveis de instância pertencem a objetos.
>- Mas é possível acessá-las se você passar um objeto da classe como parâmetro, pois assim você pode acessar a variável via o objeto.

## 3- Se duas instâncias de uma mesma classe forem criadas, elas compartilham a mesma variável de instância?
Justifique sua resposta.

>R:
>- Variáveis de instância não são compartilhadas entre objetos.
>- Cada vez que você cria um novo objeto da classe, ele recebe sua própria cópia da variável de instância.
>- Isso garante que cada objeto tenha estado independente.

## 4- Qual é o valor padrão de uma variável de instância do tipo int e do tipo String se não forem inicializadas?
Responda com os dois valores.

>R: Quando você declara uma variável de instância sem inicializá-la, o Java atribui um valor padrão dependendo do tipo:
>- int = 0;
>- String = null;

## 5- Você pode declarar uma variável de instância dentro de um método? Por quê?
Explique.

>R:
>- Variáveis de instância devem ser declaradas dentro da classe, mas fora de métodos, blocos e construtores.
>- Se você declarar uma variável dentro de um método, ela será uma variável local, e não uma variável de instância.
>- Variáveis locais existem apenas durante a execução do método.

## 6- É possível aplicar modificadores de acesso (como private ou public) em variáveis de instância?
Se sim, para quê servem?

>R:
>- Sim, é possível (e recomendado) aplicar modificadores de acesso (private, public, protected, default) às variáveis de instância para controlar o acesso a elas.