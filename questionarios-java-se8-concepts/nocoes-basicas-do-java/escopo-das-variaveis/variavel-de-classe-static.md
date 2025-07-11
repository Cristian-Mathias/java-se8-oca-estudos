## 1- O que diferencia uma variável de classe (static) de uma variável de instância em Java?
(Sua resposta pode ser conceitual, comparando uma com a outra.)

> R:
> - Variável de instância → Cada objeto tem sua própria cópia.
> - Variável de classe (static) → Existe apenas uma cópia, compartilhada por todos os objetos da classe.

## 2- É possível acessar uma variável de classe sem criar nenhum objeto da classe? Se sim, como?
Explique com suas palavras.

> R:
> - Sim, podemos acessar uma variável de classe diretamente pelo nome da classe, assim:
  `NomeDaClasse.nomeDaVariavel`;
> - Variáveis static pertencem à classe, não ao objeto.
> - Podem (e devem) ser acessadas assim: NomeDaClasse.variavel.

## 3- Variáveis static podem ser acessadas dentro de métodos static da mesma classe? 
Justifique.

> R:
> - Variáveis static podem ser acessadas diretamente dentro de métodos static da mesma classe, porque ambos pertencem à classe, e não a um objeto específico.
> - Métodos static não têm acesso direto a variáveis de instância, mas têm acesso direto a variáveis static.
> - Como tudo pertence à classe, não precisa de objeto.

## 4- Se uma variável static for alterada em um objeto, ela muda para os outros objetos também? Por quê?

> R:
> - Variáveis static têm apenas uma única cópia, independente de quantos objetos forem criados.
> - Quando qualquer objeto altera essa variável, todos os outros "enxergam" a mudança, porque estão compartilhando o mesmo valor.

## 5- Qual a diferença entre uma variável static e uma variável static final?
Explique com suas palavras.

> R:
>- Uma variável static:
   >  - Pertence à classe
   >  - Pode ter seu valor alterado
   >  - É compartilhada entre todas as instâncias
>- Uma variável static final:
   >  - Também pertence à classe
   >  - Mas é constante: seu valor não pode ser alterado
   >  - É usada para valores fixos, como PI, versão do sistema, etc.

## 6- Uma variável static pode ser private? Se sim, como ela é acessada fora da classe?

> R:Sim, uma variável static pode (e muitas vezes deve) ser private.
>- Isso protege o acesso direto a ela (encapsulamento).
>- E o acesso externo é feito por métodos get e set, que também devem ser static.
