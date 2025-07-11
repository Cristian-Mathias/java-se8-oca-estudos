## 1- Qual das seguintes assinaturas é válida para o método main em uma classe Java?

- A) public void main(String[] args)
- B) public static int main(String[] args)
- C) public static void main(String[] args)
- D) void public static main(String args[])

>R: C

Explicação: 
- public → visível pela JVM
- static → pode ser chamado sem instanciar a classe
- void → não retorna valor
- String[] args → argumentos recebidos da linha de comando

## 2- O que acontece se uma classe Java não tiver um método main válido e você tentar executá-la diretamente?

- A) O programa executa normalmente, mas sem imprimir nada
- B) A JVM cria um método main vazio automaticamente
- C) A classe compila, mas gera erro de execução
- D) O compilador gera erro e impede a compilação

>R: C

Explicação:
- Se uma classe não tiver um método main válido, o código ainda compila normalmente, mas ao tentar executá-la, a JVM exibe um erro como:
    - Error: Main method not found in class MinhaClasse
- Ou seja:
    - A compilação é permitida
    - Mas a execução falha, pois a JVM não encontra o ponto de entrada

## 3- Qual dessas opções representa corretamente o tipo do parâmetro args no método main?

- A) List<String>
- B) String
- C) String[]
- D) ArrayList<String>

>R: C

Explicação:
- O parâmetro args do método main é do tipo:
    - String[] args
- Ou seja, um array de String, que representa os argumentos passados pela linha de comando quando a aplicação é executada.


## 4- Assuma que você tem a seguinte classe:
````java
public class Teste {
    public static void main(String[] args) {
        System.out.println("Oi " + args[0]);
    }
}
````
E executa no terminal com:
- java Teste Maria

Qual será a saída?

- A) Oi args[0]
- B) Oi Maria
- C) Oi
- D) Erro em tempo de compilação

>R: B

Explicação:
- java Teste Maria:
    - java → é o comando da JVM
    - Teste → é o nome da classe a ser executada
    - Maria → é o único argumento passado para o programa → args[0]


## 5- O que acontece se você executar a classe sem passar nenhum argumento?
Com o mesmo código: System.out.println("Oi " + args[0]);

- A) Imprime Oi null
- B) Lança NullPointerException
- C) Imprime Oi
- D) Lança ArrayIndexOutOfBoundsException

>R: D

Explicação:
- Quando você executa sem passar nenhum argumento, o array args está vazio, você está tentando acessar uma posição que não existe, e o Java lança Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0.

## 6- Qual dessas formas de declarar o método main também é aceita pela JVM, além de String[] args?

- A) public static void main(String args[])
- B) public static void main(String... args)
- C) public static void main(String args)
- D) A e B estão corretas

>R: D
- As 3 formas válidas:
````java
  // Forma mais comum
  public static void main(String[] args) {
    
  }

  // Forma alternativa (colchetes depois do nome)
  public static void main(String args[]) { 
    
  }

  // Forma com varargs (usada para flexibilidade)
  public static void main(String... args) { 
    
  }
````

## 7- Qual das opções abaixo descreve a principal razão para o método main ser static?

- A) Para poder acessar membros privados da classe
- B) Para que possa ser chamado sem criar um objeto da classe
- C) Porque é obrigatório usar static em métodos públicos
- D) Porque o método main precisa retornar um valor

Qual é a alternativa correta?

>R: B

Explicação:
- A JVM precisa de um ponto de entrada para iniciar o programa. Como nenhum objeto da classe existe ainda, o método main deve ser static, ou seja:
    - Pode ser chamado sem instanciar a classe
    - A JVM acessa diretamente: NomeDaClasse.main(args);

## 8- Considere este código:
````java
public class Argumentos {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
````
Se você executar com os argumentos: java Argumentos Ola Mundo Java

Qual será a saída?

- A) Ola Mundo Java
- B) arg arg arg
- C): 
````bash
     Ola
     Mundo
     Java
````
- D) Não compila

Qual é a alternativa correta?

>R: C

Explicação:
- Obs: Observar a saída, pois tem diferença entre println(tem quebra de linha) e print(imprimi na mesma linha).


## 9- O método main pode ser sobrecarregado (overloaded) em uma classe Java?

- A) Não, só pode existir um main por classe
- B) Sim, mas apenas mudando o nome dos parâmetros
- C) Sim, pode haver múltiplas versões com diferentes parâmetros
- D) Não, porque o main é especial e não pode ser alterado

>R: C

Explicação:
- Em Java, o método main pode ser sobrecarregado (overloaded), ou seja, você pode ter vários métodos main com assinaturas diferentes, como:
````java
public static void main(String[] args) {
    
}

public static void main() { 
    
}

public static void main(int x) { 
    
}
````
Porém, a JVM só reconhece e chama o método: `public static void main(String[] args)`

## 10- Qual das opções abaixo é verdadeira sobre o método main em Java?

- A) O método main pode retornar um valor inteiro para o sistema operacional
- B) O método main deve ser declarado como public e static para ser executável pela JVM
- C) O método main pode ser privado se for chamado internamente
- D) O método main não aceita argumentos

>R: B

Explicação:
- O método main deve ser declarado como public e static para ser executável pela JVM.

- public: para que a JVM consiga acessar o método fora do pacote/classe.
- static: para que o método possa ser chamado sem criar uma instância da classe.
- void: pois o método não retorna nada para a JVM.
- String[] args: para receber argumentos da linha de comando.
