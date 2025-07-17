package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.classesWrapper;
/**
 * Wrapper Double Java =>
 *
 * @author Cristian Mathias
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 * @since 2025-07-17
 */
public class WrapperDouble {

    public static void main(String[] args) {
        // Primitivo (tipo básico, mais eficiente em performance)
        double precoPrimitivo = 29.99;

        // Autoboxing: conversão automática de tipo primitivo → objeto Double
        Double precoWrapper = precoPrimitivo;

        // Unboxing: conversão automática de objeto Double → tipo primitivo
        double precoDesempacotado = precoWrapper;

        System.out.println("Primitivo: " + precoPrimitivo);
        System.out.println("Wrapper: " + precoWrapper);
        System.out.println("Unboxing: " + precoDesempacotado);

        // Comparação entre dois objetos Double com o mesmo valor
        Double d1 = 15.5;
        Double d2 = 15.5;

        // Comparando com "==": compara referências (endereços na memória)
        // Como Double NÃO usa cache para esses valores, d1 e d2 são objetos distintos
        System.out.println("d1 == d2? " + (d1 == d2));  // false

        // Comparando com equals(): compara o valor contido no objeto
        System.out.println("d1.equals(d2)? " + d1.equals(d2)); // true

        // Convertendo uma String para Double (útil em leitura de entrada do usuário)
        String numeroComoTexto = "45.67";
        Double convertido = Double.valueOf(numeroComoTexto); // pode lançar NumberFormatException

        System.out.println("Convertido de String para Double: " + convertido);

        // Casos especiais: Infinito e NaN (Not a Number)

        // Divisão por zero com ponto flutuante: retorna "Infinity"
        // Não lança exceção! (diferente de divisão inteira por zero)
        Double infinito = 1.0 / 0.0;

        // Zero dividido por zero: resultado é "NaN" (Not a Number)
        Double naoNumero = 0.0 / 0.0;

        // Verifica se o valor representa infinito
        System.out.println("É infinito? " + infinito.isInfinite()); // true

        // Verifica se o valor não é um número válido
        System.out.println("É NaN? " + naoNumero.isNaN());          // true

        // Constantes úteis da classe Double

        // Maior valor possível que um double pode representar (~1.8E308)
        System.out.println("Máximo valor possível: " + Double.MAX_VALUE);

        // Menor valor positivo representável (~4.9E-324)
        System.out.println("Mínimo valor positivo: " + Double.MIN_VALUE);
    }

}
