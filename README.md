# Processo Seletivo Radix - Estagiário/Trainee

## Regras Gerais

O candidato poderá escolher as seguintes tecnologias para resolução das questões:
1. JAVA
2. C#.NET
3. PYTHON
4. NODE

Em caso de sinalização do RH para que a prova seja feita para uma determinada tecnologia, espera-se que o candidato mantenha aderência ao requerido.
Acreditamos que as 6 (seis) questões a seguir possam ser feitas em 2 horas. 
  
## Questão 1 - Fibonacci Array (1,5 pontos)

Escreva um programa que leia um número inteiro e imprima o número de Fibonacci correspondente a esse número lido. Lembre-se que os primeiros elementos da série de Fibonacci são 0 e 1 e cada termo posterior é calculado a partir da soma dos dois precedentes. Todos os números de Fibonacci calculados neste programa devem caber em um número não assinado de 64 bits.

**********
EXEMPLO:
**********

Entrada: 
- 3
- 0
- 4
- 2

Saída:
- Fib(0) = 0
- Fib(4) = 3
- Fib(2) = 1

**********

ENTRADA: A primeira linha contém um número inteiro T, indicando a quantidade de cenários a serem testados. Cada cenário contém um inteiro N (0 <= N <= 60), correpondendo ao enésimo termo da série de Fibonacci.

SAÍDA: Para cada cenário de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o enésimo termo da série de Fibonacci.


## Questão 2 - Perfect Number (1,5 pontos)

Em matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus próprios divisores positivos (excluindo ele próprio) é igual ao próprio número. Por exemplo, o número 6 é perfeito, porque 1 + 2 + 3 é igual a 6. Sua tarefa é escrever um programa que leia números inteiros e imprimir uma mensagem informando se esses números são perfeitos ou não são perfeitos.

**********
EXEMPLO:
**********

Entrada: 
- 3
- 6
- 5
- 28

Saída:
- 6 eh perfeito
- 5 não eh perfeito
- 28 eh perfeito

**********

ENTRADA: A primeira linha contém um número inteiro T, indicando a quantidade de cenários a serem testados. Cada uma das T subsequentes linhas contém um inteiro X (1 ≤ X ≤ 108), que pode ser ou não um número perfeito.

SAÍDA: Para cada cenário de teste da entrada, imprima a mensagem  “X eh perfeito” (X é perfeito) ou “X não eh perfeito” (X não é perfeito) de acordo com a especificação do enunciado.


## Questão 3 - Big Bang Theory - Bazinga (1,5 pontos)

No oitavo episódio da segunda temporada de Big Bang Theory, chamado "The Lizard-Spock Expansion", Sheldon e Raj estão discutindo sobre o que é melhor: o filme Saturno 3 ou o programa de TV Deep Space 9. Raj, então, sugere que escolha seja baseada no vecendor de "pedra-papel-tesoura". No entanto, Sheldon diz que no jogo de pedra-papel-tesoura, jogadores familiarizados uns com os outros vão empatar de 75% a 80% das vezes devido  ao número limitado de opções e, então, sugire "pedra-papel-tesoura-lagarto-Spock".

As regras do jogo são:

1. tesoura corta papel;
2. papel cobre pedra;
3. pedra esmaga lagarto;
4. lagarto envenena Spock;
5. Spock esmaga tesouras;
6. tesoura decapita lagarto;
7. lagarto come o papel;
8. papel refuta Spock;
9. Spock vaporiza a rocha;
10.pedra esmaga tesoura.
 

Ambos escolheram Spock e o jogo empata! No entanto, não é difícil perceber o que aconteceria se o jogo tivesse continuado. No caso da vitória de Sheldon, ele teria dito: "Bazinga!"; se Raj tivesse vencido, Sheldon declararia: "Raj trapaceou!" ("Raj traiu" em portugues); no caso de empate, ele pedia uma nova rodada: "De novo!". Dadas as opções escolhidas por ambos, faça um programa que imprima a reação de Sheldon ao resultado.

**********
EXEMPLO:
**********

Entrada: 
- 3
- papel pedra
- lagarto tesoura
- Spock Spock

Saída:
- Caso #1: Bazinga!
- Caso #2: Raj trapaceou!
- Caso #3: De novo!

**********

ENTRADA: A primeira linha contém um número inteiro T (T ≤ 100), indicando a quantidade de cenários a serem testados. Cada uma das T subsequentes linhas contém as opções de Sheldon e Raj, separadas por um espaço em branco. As opções são: pedra, papel, tesoura, lagarto e spock.

SAÍDA: Para cada cenário de teste da entrada, imprima a mensagem  "Caso #t: R", onde t é o número do caso de teste e R é a reação de Sheldon ao resultado: "Bazinga!", "Raj trapaceou!" ou "De novo!"


## Questão 4 - Palindrome (2,5 pontos)

Um palíndromo é uma string tal que sua reversão é igual à string original. Em outras palavras, é uma string que, quando lida de trás para frente, é igual à string original. Por exemplo, o BANANAB é um palíndromo, enquanto o BANANAS não. Neste problema estamos interessados em um assunto um pouco mais interessante.

Dada uma string S, queremos encontrar a MAIOR subsequência que seja um palíndromo (Strings de 1(um) caracter não serão considerados como palíndromo). Uma subsequência é uma string que pode ser obtida da remoção de zero ou mais caracteres da string original. Por exemplo, ANANA é a maior subsequência de BANANAS (retirando-se os caracteres nas posições 0 e 6).

**********
EXEMPLO:
**********

Entrada: 
- 4
- BANANAS
- PATA
- ANEL
- A1A

Saída:
- ANANA
- ATA
- sem resultados
- entrada inválida

**********

ENTRADA: A primeira linha contém um número inteiro T, indicando a quantidade de cenários a serem testados. Cada uma das T subsequentes linhas contém uma string S, onde 0 < len(S) ≤ 100 e S só poderá conter letras, ou seja, tem que pertencer ao intervalo [a, z].

SAÍDA: Para cada cenário de teste da entrada, caso o tamanho desta string seja maior que 1 (um) caracter, imprima a maior string encontrada. Caso contrário, imprima 'sem resultados'. No caso em que a entrada for inválida, imprima 'entrada inválida'.


## Questão 5 - Digits Count (3,0 pontos)

Walewska quer escrever uma lista de todos os inteiros positivos entre A e B (incluindo ambos) na base 10 e sem zeros à esquerda. Ela quer saber quantas vezes cada dígito será usado.

**********
EXEMPLO:
**********

Entrada: 
- 6
- A 9
- 1 9
- 12 321
- 5987 6123
- 12345678 12345679

Saída:
- entrada inválida
- 0 1 1 1 1 1 1 1 1 1
- 61 169 163 83 61 61 61 61 61 61
- 134 58 28 24 23 36 147 24 27 47
- 0 2 2 2 2 2 2 2 1 1

**********

ENTRADA: A primeira linha contém um número inteiro T, indicando a quantidade de cenários a serem testados. Cada uma das T subsequentes linhas contém dois inteiros A e B (1 ≤ A ≤ B ≤ 1.000)

SAÍDA: Para cada cenário de teste da entrada, imprima uma única linha com 10 inteiros representando o número de vezes que cada dígito é usado ao gravar todos os inteiros entre A e B, inclusive, na base 10 e sem zeros à esquerda. Escreva o contador para cada dígito em ordem crescente de 0 a 9. Caso a entrada seja inválida, imprima 'entrada inválida'.


## Questão 6 - (SQL) CPF Validation (1,0 ponto Extra)

Guilherme Fogaça quer um relatório sobre os dados dos funcionário da Radix que estão registrados no banco de dados. Ele já recebera um relatório com problema, já que os dados CPF dos clientes vieram ser organização: alguns tinham máscara e outros não tinham.

Seu trabalho, agora, é selecionar todos os CPFs de todos os clientes e aplicar uma máscara no retorno dos dados.

A máscara final do CPF deve ficar: '000.000.000-00'.

*******
Schema:
*******

Dados da Tabela 'cliente':

1. id (PK)	            numeric	
2. name	                varchar (255)	
3. street	            varchar (255)
4. city	                varchar (255)
5. state	            char (2)	
6. credit_limit	        numeric

Dados da Tabela 'pessoa':

1. id_customers  (FK)   numeric	
2. cpf	                char (14)	

**********

Monte o SQL da consulta que atualizará os cpf contidos na tabela 'pessoa' sem esquecer que o campo pode ou não possuir o dado no padrão desejado. Se desejar criar tabelas ou colunas, não esqueça de removê-las ao final. 


## Finalização do Desenvolvimento

Modo 1:

Assim que finalizado seu projeto crie um merge request para enviar sua alterações ao repositório original da Radix. Sua avaliação será realizada nesta versão, futuras alterações não serão consideradas. Não faça o merge request para o repositório original antes de terminar completamente todo o seu projeto.

Modo 2:

Envie por e-mail para o destinatário: rh@radixeng.com.br. O assunto deverá estar no padrão: "Prova 1 - [Nome] - [Tecnologia]". Não esqueça o anexo ou a url do local onde a solução está hospedada (exemplo hightail). No corpo do e-mail, faça todas as observações que julgar pertinentes para avaliação.

## Avaliação - Critérios/Requisitos Obrigatórios

Você será avaliado nos seguintes aspectos, em ordem de prioridade:
1. Performance e correta execução. As respostas precisam estar coerentes com as premissas estabelecidas no questionário
2. Legibilidade de código
3. Breve análise, em forma de comentário, explicando o raciocíonio utilizado para resoluçaõ da questão.

## Avaliação - Critérios/Requisitos Desejados (diferenciais)

1. Modelagem e OO (Orientação à Objetos)
2. Testes Unitários
3. Uso apropriado da linguagem, assim como as frameworks e suas melhores práticas
4. Uso de uma interface web, por mais simples que seja. Indique o motivo da escolha de tecnologia utilizada

Observe que neste projeto é mais importante que você entregue um código de qualidade do que todas as funcionalidades exigidas. 
Seu código será avaliado independente da entrega total de funcionalidades.
É esperado que você desenvolva sem ajuda ou intervenção direta de terceiros, mas encorajamos que você pesquise por soluções e boas práticas sem nenhum tipo de restrição, apenas lembre-se que serão realizadas perguntas na entrevista a fim de certificar seu conhecimento total sobre a implementação. Jogue limpo!