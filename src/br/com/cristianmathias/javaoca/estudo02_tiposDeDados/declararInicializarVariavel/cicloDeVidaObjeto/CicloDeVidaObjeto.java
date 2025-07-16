package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.cicloDeVidaObjeto;

/**
 * Ciclo de vida de Obejetos Java =>
 *
 * @author Cristian Mathias
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 * @since 2025-07-16
 */
public class CicloDeVidaObjeto {
   /*
   3 fases principais:
       - Criação do objeto
       - Desreferência (por reatribuição ou escopo)
       - Coleta de lixo (Garbage Collection)
   */
    public static void main(String[] args) {
        System.out.println("Início do programa");

        // Fase 1: Criação dos objetos
        Pessoa p1 = new Pessoa("Ana");
        Pessoa p2 = new Pessoa("Bruno");

        // Fase 2: Reatribuição (desreferencia Ana)
        p1 = new Pessoa("Carla"); // Agora o objeto "Ana" está sem referência

        // Fase 3: Definindo referência como null (desreferencia Bruno)
        p2 = null;

        // Fase 4: Objeto ainda referenciado
        Pessoa p3 = new Pessoa("Daniel");
        System.out.println("Nome atual: " + p3.getNome());

        // Fase 5: Fim do escopo da variável — a referência p3 deixa de existir quando o método terminar

        // Sugestão para coletor de lixo (não garante execução)
        System.gc();

        System.out.println("Fim do programa");
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Objeto criado: " + nome);
    }

    public String getNome() {
        return nome;
    }
}
/*
 * === SOBRE O "LIXO" NA JVM ===
 *
 * Em Java, um objeto se torna "lixo" quando não há mais nenhuma variável referenciando-o.
 * Esses objetos continuam ocupando espaço na memória (heap), mas não podem mais ser acessados.
 *
 * No exemplo deste programa:
 * - O objeto "Ana" se torna lixo quando p1 é reatribuída para um novo objeto "Carla".
 * - O objeto "Bruno" se torna lixo quando p2 recebe null.
 * Ambos continuam existindo na memória, mas estão inacessíveis pelo código.
 *
 * === POR QUE O Garbage Collector (GC) NÃO LIMPOU ESSES OBJETOS? ===
 *
 * Mesmo chamando System.gc(), a coleta de lixo:
 * - NÃO é garantida;
 * - PODE ser ignorada pela JVM se o sistema não estiver com pressão de memória;
 * - NÃO ocorre imediatamente após os objetos se tornarem elegíveis.
 *
 * Portanto, a ausência de qualquer indicação de que os objetos foram removidos
 * é esperada em programas curtos ou com pouco uso de memória.
 *
 * Em resumo: os objetos "Ana" e "Bruno" se tornaram lixo, mas a JVM pode decidir
 * não coletá-los nesse momento.
 */