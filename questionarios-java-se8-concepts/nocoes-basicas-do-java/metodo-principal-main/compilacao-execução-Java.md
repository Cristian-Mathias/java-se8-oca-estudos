## 1- O que faz o compilador javac no processo de desenvolvimento Java?

>R: O compilador javac pega o código-fonte .java e o converte em bytecode .class, que é uma linguagem intermediária que a JVM pode executar.

## 2- O que acontece se o código Java contém um erro de sintaxe quando você tenta compilar com javac?

>R: Quando há um erro de sintaxe ou estrutural no código, o javac não gera o bytecode .class e exibe uma mensagem de erro de compilação. O processo para até que o erro seja corrigido.

## 3- O que é a JVM e qual seu papel no processo de execução do programa Java?

>R: A JVM (Java Virtual Machine) é responsável por interpretar ou executar o bytecode .class, tornando o programa Java independente de plataforma, pois ela roda em qualquer sistema que tenha essa máquina virtual.

## 4- Qual é a diferença entre um erro de compilação e um erro de execução?

>R: 
>- Erro de compilação: ocorre durante a tradução do código-fonte para bytecode, geralmente por problemas de sintaxe ou estrutura. O programa nem chega a rodar.
>- Erro de execução: acontece enquanto o programa já está rodando, causado por problemas na lógica, como divisão por zero, acesso inválido, etc.

## 5- Se um programa compila sem erros, mas ao executar lança uma NullPointerException, esse erro é de compilação ou execução? Por quê?

>R: NullPointerException é um erro de execução, porque o código compilou normalmente, mas durante a execução tentou usar um objeto que estava com valor null, o que não é permitido.

## 6- O que acontece se você tentar executar um programa Java sem antes compilar o arquivo .java?

>R: Se você tentar rodar (java NomeDaClasse) sem antes ter compilado (javac NomeDaClasse.java), o arquivo .class não existirá, então o Java não conseguirá executar e vai dar erro.

## 7- Qual arquivo é gerado após a compilação do código Java? E qual arquivo é executado pela JVM?

>R: 
>- O compilador gera o arquivo .class (bytecode).
>- A JVM executa esse .class.

## 8- Por que dizemos que Java é independente de plataforma no contexto de compilação e execução?

>R: Java é independente de plataforma porque:
>- O compilador javac transforma o código .java em um arquivo .class, que contém um código intermediário chamado bytecode.
>- Esse bytecode não depende do sistema operacional — ele é o mesmo em todos os lugares.
>- Para rodar o programa, cada sistema precisa ter a sua própria JVM (Java Virtual Machine), que interpreta o bytecode e executa as instruções no sistema específico.
>- Assim, você escreve e compila o programa uma vez, e pode executá-lo em qualquer sistema que tenha uma JVM compatível, sem mudar o código.

## 9- O que significa a sigla IDE e qual é o papel dela no processo de compilação e execução?

>R: IDE (Integrated Development Environment),ajuda a escrever, compilar e executar código, automatizando todo o processo de desenvolvimento

## 10- O que acontece se uma exceção for lançada durante a execução de um programa Java e não for tratada (capturada)?

>R: Se uma exceção não for tratada, o programa para imediatamente e a JVM exibe uma mensagem de erro (stack trace) no console, indicando o tipo da exceção e onde ela ocorreu.
