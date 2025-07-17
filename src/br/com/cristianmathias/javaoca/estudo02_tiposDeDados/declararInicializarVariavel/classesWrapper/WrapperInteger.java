package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.classesWrapper;
/**
 * Wrapper Integer Java =>
 *
 * @author Cristian Mathias
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 * @since 2025-07-17
 */
public class WrapperInteger {
    public static void main(String[] args) {

        //Criação de um Integer a partir de um valor int (autoboxing)
        //O compilador converte automaticamente o int 10 em Integer.valueOf(10)
        Integer num1 = 10;

        //Conversão de uma String para Integer usando valueOf (conversão explícita)
        Integer num2 = Integer.valueOf("123");
        System.out.println("=> num2 (Integer criado a partir de String): " + num2); // Saída: 123

        //Conversão de Integer para int (unboxing)
        int x = num2; // Ocorre automaticamente: num2.intValue()
        System.out.println("=> x (valor int extraído de num2): " + x); // Saída: 123

        // Comparação entre Integer e int (autoboxing do int para Integer antes de comparar)
        boolean isEqual = num2.equals(x); // x vira Integer(123) internamente
        System.out.println("=> num2.equals(x): " + isEqual); // Saída: true

        //Conversão de Integer para String
        String str = num1.toString(); // str = "10"
        System.out.println("=> str (num1 convertido para String): " + str); // Saída: 10

        //Comparação entre Integer e String (tipos diferentes)
        boolean isEqual2 = num1.equals(str); // false: tipos diferentes (Integer vs String)
        System.out.println("=> num1.equals(str): " + isEqual2); // Saída: false
    }
}
