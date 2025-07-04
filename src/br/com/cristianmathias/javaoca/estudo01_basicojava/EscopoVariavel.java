package br.com.cristianmathias.javaoca.estudo01_basicojava;

/*
Escopo de Variáveis =>
O escopo de uma variável define onde ela pode ser usada (acessada) dentro do código.
 */

/*
Variável de instância:
    - É declarada dentro da classe, mas fora de qualquer método, construtor ou bloco.
    - Cada objeto (instância) da classe tem sua própria cópia dessa variável.
    - Só pode ser acessada diretamente dentro da própria classe (ou via objeto em outra classe).
    - Elas são visíveis (acessíveis) em todos os métodos não estáticos da mesma classe.
    - Para acessá-las dentro desses métodos, você pode:
        - Usar diretamente o nome da variável (ex: numeroClasse).
        - Ou usar explicitamente o this para se referir à variável do próprio objeto (ex: this.numeroClasse).
*/

/*
Variável de Classe (Estática):
    - É declarada dentro da classe, mas com a palavra-chave static.
    - Pertence à toda classe, e não a objetos individuais.
    - Existe uma única cópia da variável, compartilhada entre todas as instâncias da classe.
    - Pode ser acessada:
        - Diretamente por métodos estáticos da própria classe.
        - Pelo nome da classe (ex: Classe.nomeVariavel).
    - Pode ser usada para armazenar valores comuns a todos os objetos, como contadores, configurações globais, ou constantes.
    - Pode ser usada em métodos estáticos e não estáticos.
*/

/*
Variável Local:
    - É declarada dentro de um método, construtor ou bloco.
    - Só existe enquanto o método (ou bloco) estiver sendo executado.
    - Só é acessível dentro do bloco onde foi declarada, a partir da linha onde foi declarada.
    - Usada para armazenar valores temporários usados por aquele método.
    - Não pode ter modificadores como public, private ou static.
    - Deve ser inicializada antes do uso, pois não recebe valor padrão.
*/

/*
Variável de Bloco:
    - É um tipo especial de variável local, declarada dentro de um bloco de código como if, for, while, {}.
    - É visível somente dentro daquele bloco específico (entre as chaves {}).
    - Assim que o bloco termina, a variável deixa de existir.
    - Se tentar acessá-la fora do bloco, ocorre erro de compilação.
*/

public class EscopoVariavel {
    int numeroClasse = 100; // variável de instância (visível em toda a classe)
    static int numeroClasseEstatica = 200;  // variável de classe (static)

    public void metodo() {
        int numeroLocal = 50; // variável local (visível só dentro do método)
        if (true) {
            int numeroBloco = 20; //variável de bloco (visível só dentro do if)
            System.out.println("Dentro do bloco if: " + numeroBloco);
        }
        System.out.println("Dentro do método: " + numeroLocal);
        System.out.println("Acessando variável de instância: " + numeroClasse);
        System.out.println("Acessando variável de classe (estática): " + numeroClasseEstatica);
    }

    public static void main(String[] args) {
        EscopoVariavel escopo = new EscopoVariavel();
        escopo.metodo();
    }
}
