package br.com.cristianmathias.javaoca.estudo02_tiposDeDados.declararInicializarVariavel.classesWrapper;
/**
 * Wrapper Boolean Java =>
 *
 * @author Cristian Mathias
 * @implNote Veja a explicação teórica no arquivo java-se8-concepts.md
 * @since 2025-07-17
 */
public class WrapperBoolean {
    public static void main(String[] args) {
        // Exemplo 1: Autoboxing (conversão automática de boolean para Boolean)
        // O valor primitivo 'true' é convertido automaticamente para o objeto Boolean
        boolean ativo = true;
        Boolean wrapperAtivo = ativo; // autoboxing
        System.out.println("Autoboxing: wrapperAtivo = " + wrapperAtivo); // true

        // Exemplo 2: Unboxing (conversão automática de Boolean para boolean)
        // O objeto Boolean é convertido automaticamente para o tipo primitivo boolean
        Boolean online = Boolean.TRUE;
        boolean status = online; // unboxing
        System.out.println("Unboxing: status = " + status); // true

        // Exemplo 3: Conversão de String para Boolean
        // O método valueOf(String) converte a string para Boolean (true apenas se for "true" ignorando maiúsculas/minúsculas)
        String str1 = "true";
        String str2 = "false";
        String str3 = "qualquer coisa"; // qualquer valor diferente de "true" retorna false

        Boolean b1 = Boolean.valueOf(str1); // true
        Boolean b2 = Boolean.valueOf(str2); // false
        Boolean b3 = Boolean.valueOf(str3); // false

        // Exibindo os resultados das conversões de String para Boolean
        System.out.println("String 'true' → Boolean: " + b1);   // true
        System.out.println("String 'false' → Boolean: " + b2);  // false
        System.out.println("String inválida → Boolean: " + b3); // false

        // Exemplo 4: Comparação entre objetos Boolean usando equals()
        // O método equals compara os valores internos dos objetos Boolean
        Boolean x = Boolean.TRUE;
        Boolean y = Boolean.valueOf("true"); // também é true
        System.out.println("x.equals(y): " + x.equals(y)); // true
    }
}
