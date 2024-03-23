# Tarefa1 - Orientação objeto
## Exercício 1
Crie uma classe chamada Carro com os atributos marca, modelo e
ano.
Crie um construtor para a classe Carro que recebe esses atributos
como parâmetros e inicializa os campos.
Crie um método getDescricao que retorna uma string contendo a
descrição do carro no formato "Marca: [marca], Modelo: [modelo],
Ano: [ano]".
## Exercício 2
a) Crie uma classe Animal com os atributos nome e som.
b) Crie subclasses Cachorro e Gato que herdam de Animal.
c) Adicione um método fazerSom nas subclasses Cachorro e Gato
que imprime o som característico do animal.
## Exercício 3
Crie uma interface chamada Forma com um método calcularArea.
Em seguida, implemente duas classes que implementam essa
interface: Circulo e Retangulo. Cada classe deve implementar o
método calcularArea de acordo com sua forma geométrica.

# Exception
## Exercício 1 Try-Catch Básico
Crie um programa que divide dois números inteiros.
Use um bloco try-catch para capturar exceções de divisão por zero
(ArithmeticException).
Imprima uma mensagem de erro apropriada caso ocorra uma exceção.
## Exercício 2 Try-Catch com múltiplas Exceções
Crie um programa que tenta converter uma string em um número
inteiro.
Use um bloco try-catch para capturar exceções NumberFormatException e
NullPointerException.
Imprima mensagens de erro apropriadas para cada tipo de exceção.
## Exercício 3 Try-Catch-Finally
Crie um programa que lê um número inteiro a partir de uma string.
Use um bloco try-catch-finally para lidar com exceções
NumberFormatException.
No bloco finally, imprima uma mensagem para garantir que o código no
bloco finally seja sempre executado, independentemente de ocorrer ou
não uma exceção.

# Collection
## Exercício 1 ArrayList
Crie um ArrayList de nomes de frutas e adicione pelo menos 5 nomes de
frutas a ele.
Imprima o tamanho do ArrayList.
Imprima o terceiro elemento do ArrayList.
Remova a primeira fruta da lista.
Verifique se uma determinada fruta existe na lista.
Itere sobre a lista e imprima todas as frutas.
## Exercício 2 HashSet
Crie um HashSet de cores e adicione pelo menos 5 cores a ele.
Imprima o tamanho do HashSet.
Tente adicionar uma cor que já existe no conjunto. Como o HashSet lida
com elementos duplicados?
Remova uma cor do conjunto.
Verifique se uma cor específica está no conjunto.
Itere sobre o conjunto e imprima todas as cores.
## Exercício 3 Comparando ArrayList e HashSet
Crie um ArrayList e um HashSet contendo números inteiros.
Adicione os mesmos números em ambas as coleções.
Imprima os elementos do ArrayList e do HashSet.
Explique a diferença entre a ordem dos elementos nos dois.
## Exercício 4 Conversão entre ArrayList e HashSet
Crie um ArrayList de palavras.
Converta o ArrayList em um HashSet.
Imprima os elementos do HashSet.
Converta o HashSet de volta para um ArrayList.
Imprima os elementos do ArrayList resultante.
Observe se a ordem dos elementos muda durante as conversões.
## Exercício 5 Operações Avançadas
Crie um ArrayList de números inteiros.
Remova todos os números pares da lista.
Crie um novo HashSet a partir dos números ímpares na lista.
Verifique se o novo HashSet contém um número específico.

# Expressões Lambdas
## Exercício 1 Números pares
Escreva uma função que recebe uma lista de números inteiros e retorna uma
nova lista contendo apenas os números pares.
## Exercício 2 Números primos
Escreva uma função que verifica se um número é primo usando uma
expressão lambda.
## Exercício 3 Transformação de Strings
Escreva uma função que recebe uma lista de strings e retorna uma nova lista
com todas as strings convertidas para maiúsculas.
## Exercício 4 Soma de números
Escreva uma função que recebe uma lista de números e retorna a soma de
todos os números.
