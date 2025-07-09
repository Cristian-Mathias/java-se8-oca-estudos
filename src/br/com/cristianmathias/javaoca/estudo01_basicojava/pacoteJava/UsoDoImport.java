
// Declaração do pacote onde esta classe está localizada.
// Isso define a hierarquia da estrutura de diretórios do projeto.
package br.com.cristianmathias.javaoca.estudo01_basicojava.pacoteJava;

// Importa a classe 'Mensagem' de outro pacote.
// Necessário para utilizar a classe Mensagem dentro desta classe.
import br.com.cristianmathias.javaoca.estudo01_basicojava.pacoteJava.pacoteMensagem.Mensagem;

/**
 * Pacotes e Importe Java =>
 *
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 *
 * @since 2025-07-09
 * @author Cristian Mathias
 */

public class UsoDoImport {

    public static void main(String[] args) {
        Mensagem msg = new Mensagem();
        msg.exibir();
    }
}
