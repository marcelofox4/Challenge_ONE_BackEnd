# Challenge ONE Back End - Java

   <img src="http://img.shields.io/static/v1?		label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>



### Tópicos 

:small_blue_diamond: [Descrição do Desafio](#descrição-do-desafio)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Layout da Aplicação](#layout-da-aplicação)

:small_blue_diamond: [Linguagem e lib utilizada](#linguagem-e-lib-utilizada)



## Descrição do Desafio

Crie seu próprio conversor de moeda.

Foi solicitado para nós Devs a criação de um conversor de moeda utilizando a linguagem Java. As características solicitadas por nosso cliente são as seguintes:

O conversor de moeda deverá:

- Converter de Reais a Dólar
- Converter de Reais a Euro
- Converter de Reais a Libras Esterlinas
- Converter de Reais a Peso argentino
- Converter de Reais a Peso Chileno

Como desafio extra incentivamos vocês a deixar fluir sua criatividade, se posso converter moedas, será que posso tal vez adicionar a meu programa outro tipo de conversões como temperatura por exemplo?

É hora de surpreender nosso cliente com uma feature que tal vez nem ele sabia que precisava.



## Funcionalidades

:heavy_check_mark: Funcionalidade 1: No menu principal é possível escolher dois tipos de conversões, a primeira que é para converter um valor digitado em Reais e converte-lo para 10 tipos de moedas diferentes, a escolha das moedas foi com base no site [Planner](https://www.planner.com.br/2022/12/12/principais-moedas-do-mundo/);

:heavy_check_mark: Funcionalidade 2: Também é possível escolher a opção de fazer conversões de temperatura de Celcius para outros dois tipos, sendo eles: Fahrenheit e Kelvin.



## Layout da Aplicação 

- A primeira tela consiste no menu principal da aplicação, onde é possível escolher qual das conversões, moeda ou temperatura, o usuário deseja fazer.

<img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/01-tela-principal.png> <img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/02-tela-principal-escolha-conversor.png>

- Dependendo da escolha, o usuário poderá digitar um valor, tanto para as conversões de moedas quanto de temperaturas;

<img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/03-tela-conversor-moedas-valor.png> <img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/06-tela-conversor-temperatura-valor.png>

- Após o valor escolhido pelo usuário é possível fazer uma escolha dentre varias para a conversão de moedas, já na conversão de temperatura é possível escolher entre duas;

<img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/04-tela-conversor-moeda-escolha.png> <img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/07-tela-conversor-temperatura-escolha.png>

- É possível visualizar o resultado logo abaixo da caixa de opções;

<img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/05-tela-conversor-moeda-resultado.png> <img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/08-tela-conversor-temperatura-resultado.png>

- Caso o usuário digite valores não numéricos ou digite valores decimais que estejam separados por "**,**", a aplicação gerará uma Exception com uma mensagem, indicando o que ele deve fazer.

<img src=https://github.com/marcelofox4/Challenge_ONE_BackEnd/blob/master/img-telas-conversor/09-tela-erro-digitacao.png>



## Linguagem e lib utilizada

- Java;
- Biblioteca Swing



​																												
