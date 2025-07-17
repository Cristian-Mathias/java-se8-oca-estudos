package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.classesWrapper;

/**
 * Wrapper Integer Cache Java =>
 *
 * @author Cristian Mathias
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 * @since 2025-07-17
 */
public class WrapperIntegerCache {
    public static void main(String[] args) {

        System.out.println("=========== DENTRO DO CACHE ============");

        // ----------- DENTRO DO CACHE (entre -128 e 127) ----------- //
        Integer a = 127;  // valor dentro do intervalo de cache do Integer
        Integer b = 127;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Como 127 está no intervalo do cache (-128 a 127),
        // Java reutiliza o mesmo objeto Integer para 'a' e 'b'
        System.out.println("a == b? " + (a == b)); // true (mesmo objeto na memória)

        // Mostra os "endereços simulados" dos objetos (serão iguais)
        System.out.println("a identityHashCode = " + System.identityHashCode(a));
        System.out.println("b identityHashCode = " + System.identityHashCode(b));


        System.out.println("=========== DENTRO DO CACHE COM VALORES DIFERENTES ===========");
        // ----------- DENTRO DO CACHE (entre -128 e 127) ----------- //
        Integer a1 = 127;  // valor dentro do intervalo de cache do Integer
        Integer b1 = 126;  // também dentro do cache

        System.out.println("a1 = " + a1); // 127
        System.out.println("b1 = " + b1); // 126

        /*
         * ATENÇÃO:
         * Apesar de ambos os valores estarem dentro do intervalo de cache do Integer (-128 a 127),
         * os objetos 'a' e 'b' referenciam valores diferentes, então eles são objetos distintos no cache.
         *
         * O cache do Integer mantém UM objeto para CADA valor no intervalo.
         * Portanto, 'a' e 'b' apontam para objetos diferentes dentro do cache.
         *
         * Logo: (a == b) → false
         */
        System.out.println("a1 == b1? " + (a1 == b1)); // false (objetos diferentes, pois os valores são diferentes)

        // Mostra os "endereços simulados" dos objetos (serão diferentes)
        System.out.println("a1 identityHashCode = " + System.identityHashCode(a1));
        System.out.println("b1 identityHashCode = " + System.identityHashCode(b1));


        System.out.println("=========== FORA DO CACHE ===========");
        // ----------- FORA DO CACHE (> 127 ou < -128) ----------- //
        Integer a2 = 128;
        Integer b2 = 128;

        /*
         * Quando usamos autoboxing (Integer a2 = 128), o compilador chama internamente:
         *    Integer.valueOf(128)
         * O método valueOf verifica se o valor está no intervalo do cache [-128, 127].
         *
         * Como 128 está FORA do cache, a JVM CRIA UM NOVO OBJETO Integer para cada atribuição.
         * Assim, 'a2' e 'b2' são objetos distintos, embora contenham o mesmo valor.
         */
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

        // '==' compara as referências (endereços de memória). Como são objetos distintos, retorna false.
        System.out.println("a2 == b2? " + (a2 == b2)); // false

        // .equals() compara os VALORES dos objetos, e não as referências.
        System.out.println("a2.equals(b2)? " + a2.equals(b2)); // true

        // Mostra os identityHashCodes (endereços simulados na memória)
        // Como são objetos diferentes, os códigos também são diferentes.
        System.out.println("a2 identityHashCode = " + System.identityHashCode(a2));
        System.out.println("b2 identityHashCode = " + System.identityHashCode(b2));

    }
}
