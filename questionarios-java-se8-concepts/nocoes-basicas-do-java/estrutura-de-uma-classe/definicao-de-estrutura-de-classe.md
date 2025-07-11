## 1- Em Java, qual é a estrutura básica de uma classe pública chamada Pessoa que ainda está vazia (sem atributos ou métodos)?

- A) class Pessoa {}
- B) public class Pessoa {}
- C) public Pessoa class {}
- D) Pessoa public class {}

>R: B

Explicação:
- A alternativa B) public class Pessoa {} representa corretamente a estrutura básica de uma classe pública em Java.
- A palavra-chave public define a visibilidade da classe (acessível por qualquer outro código).
- A palavra class define que se trata de uma classe.
- O nome Pessoa segue as convenções de nomenclatura: inicial maiúscula, em CamelCase.
- As chaves {} delimitam o corpo da classe, mesmo que ele esteja vazio por enquanto.

## 2- Qual das opções abaixo representa corretamente um atributo de instância privado chamado nome do tipo String?

- A) public nome String;
- B) String nome;
- C) private String nome;
- D) private nome String;

>R: C

Explicação:
- A alternativa C) private String nome; representa corretamente a declaração de um atributo de instância privado do tipo String com o nome nome.
- private: torna o atributo acessível apenas dentro da própria classe, o que promove encapsulamento.
- String: é o tipo de dado do atributo.
- nome: é o identificador do atributo (nome da variável).
- O ponto e vírgula ; finaliza a instrução.

## 3- Em qual parte da classe Java é comum declarar atributos de instância?

- A) Dentro do método main
- B) Dentro de qualquer método da classe
- C) Fora de qualquer método, dentro do corpo da classe
- D) Após o fechamento da chave da classe

>R: C

Explicação:
- Os atributos de instância pertencem ao objeto e são declarados diretamente dentro do corpo da classe, mas fora de qualquer método ou construtor.
- Isso garante que eles sejam visíveis para todos os métodos da classe e mantidos enquanto o objeto existir.

## 4- O que acontece se você declarar uma classe com o modificador private fora de outra classe (top-level)?

- A) A classe funcionará normalmente
- B) A classe só poderá ser acessada dentro do mesmo pacote
- C) A classe poderá ser estendida, mas não instanciada
- D) O compilador emitirá um erro — não é permitido private em classe top-level

>R: D

Explicação:
- Em Java, classes top-level (aquelas que não estão dentro de outra classe) só podem usar dois modificadores de acesso:
    - public: visível em qualquer pacote
    - default (sem modificador): visível apenas dentro do mesmo pacote
- Modificadores como private e protected só podem ser usados em classes internas (aquelas que estão dentro de outra classe).


## 5- Qual das opções abaixo representa corretamente um construtor da classe Pessoa que recebe um String nome e um int idade?

- A) public void Pessoa(String nome, int idade)
- B) public Pessoa(String nome, int idade)
- C) public new Pessoa(String nome, int idade)
- D) Pessoa(String nome, int idade)

>R: B

Explicação:
- A alternativa B) — public Pessoa(String nome, int idade) — representa corretamente a definição de um construtor em Java.
- Um construtor é um método especial que tem o mesmo nome da classe.
- Ele não possui tipo de retorno (nem mesmo void).
- É usado para criar objetos e inicializar seus atributos no momento da criação.


## 6- Em Java, qual método especial é usado para iniciar a execução de um programa?

- A) iniciar()
- B) start()
- C) main()
- D) executar()

>R: C

Explicação:
- A alternativa C) — main() — está 100% correta! Esse é o método especial e obrigatório para iniciar a execução de um programa Java.
- O método main é o ponto de entrada da aplicação Java.
- Ele deve ser declarado exatamente assim para que a JVM o reconheça:
  ````java
    public static void main(String[] args) {
  // código que será executado ao iniciar o programa
  }
  ````
Significado de cada parte:

- public: visível pela JVM, que está fora da classe.
- static: não depende de uma instância para ser executado.
- void: não retorna nenhum valor.
- String[] args: parâmetro usado para receber argumentos da linha de comando.

## 7- O que acontece se você não incluir o método main em uma classe que está sendo executada diretamente?

- A) O programa compila e roda normalmente
- B) A JVM escolhe outro método para iniciar
- C) Um erro de compilação ocorre
- D) Um erro de execução ocorre: “Main method not found”

>R: D

Explicação:
- Se você não declarar o método main() e tentar executar a classe diretamente com o comando:
    - java NomeDaClasse
- A JVM não encontra o ponto de entrada da aplicação e lança um erro de execução, não de compilação.

## 8- Uma classe Java pode conter mais de um construtor, desde que...

- A) Eles tenham o mesmo nome e os mesmos parâmetros
- B) Eles tenham nomes diferentes
- C) Eles tenham o mesmo nome, mas parâmetros diferentes
- D) Só seja permitido um construtor por classe

>R: C

Explicação:
- A alternativa C) — "Eles tenham o mesmo nome, mas parâmetros diferentes" — está absolutamente certa! Isso é conhecido como sobrecarga de construtores (constructor overloading).
- Em Java, todos os construtores de uma classe devem ter o mesmo nome da classe.
- O que os diferencia é a assinatura, ou seja, o número, tipo e ordem dos parâmetros.
- Isso permite criar várias formas de inicializar um objeto.

## 9- O que acontece se você não declarar nenhum construtor na sua classe?

- A) O código não compila
- B) A JVM gera automaticamente um construtor vazio (sem parâmetros)
- C) O Java impede que você instancie a classe
- D) Um erro é lançado na execução

>R: B

Explicação:
- Se você não declara nenhum construtor explicitamente, o compilador Java cria automaticamente um construtor padrão (sem parâmetros).
- Esse construtor é chamado de construtor default (implícito).
- Ele não realiza nenhuma inicialização personalizada, apenas permite instanciar a classe.

## 10- Qual a ordem correta dos componentes dentro de uma classe Java bem estruturada?

- A) Métodos → atributos → construtores
- B) Construtores → atributos → métodos
- C) Atributos → construtores → métodos
- D) Atributos → métodos → construtores

>R: C

Explicação:
- Embora o compilador Java não exija uma ordem específica, existe uma convenção de codificação amplamente adotada para manter a classe organizada e legível:

1. Atributos (variáveis de instância)
- Definem o estado da classe.

2. Construtores
- Inicializam os atributos ao criar objetos.

3. Métodos
- Executam ações e comportamentos da classe.

## 11- É possível declarar múltiplas classes no mesmo arquivo .java?

- A) Sim, e todas podem ser públicas
- B) Não, só pode haver uma classe por arquivo
- C) Sim, mas apenas uma pode ser public
- D) Não, o Java não permite isso

>R: C

Explicação:
- Em Java, é permitido declarar múltiplas classes no mesmo arquivo .java, mas com uma regra importante:
    - Apenas uma das classes pode ser public
    - E o nome do arquivo .java deve ser exatamente igual ao nome dessa classe pública
