# Jogo da Senha em Java

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos, com o objetivo de aplicar conceitos de lógica de programação, entrada de dados e manipulação de estruturas em Java.

## Descrição

O Jogo da Senha consiste em um sistema onde o usuário deve adivinhar uma sequência numérica gerada aleatoriamente pelo programa.

A senha é composta por números únicos, dentro de um intervalo definido com base no tamanho escolhido pelo jogador. O jogo fornece feedback a cada tentativa, informando quantos dígitos estão corretos e na posição correta.

## Funcionamento

1. O usuário define o tamanho da senha.
2. O sistema gera uma senha aleatória sem repetição.
3. O usuário realiza tentativas para adivinhar a sequência.
4. A cada tentativa, o sistema informa quantos números estão corretos e na posição correta.
5. O jogo termina quando o usuário acerta toda a senha.

## Funcionalidades

- Geração de senha aleatória sem repetição
- Validação de entrada do usuário
- Contador de tentativas
- Feedback a cada tentativa
- Execução em loop até acerto da senha

## Tecnologias utilizadas

- Java
- Scanner (entrada de dados)
- ArrayList e Collections (geração da senha)

## Estrutura do código

- `main` → ponto de entrada do programa
- `jogar()` → controla o fluxo principal do jogo
- `preencheSenha()` → gera a senha aleatória
- `preencheTentativa()` → coleta e valida a tentativa do usuário
- `verificarTentativa()` → compara tentativa com a senha
- `mostrar()` → exibe os dados no console

## Conceitos aplicados

- Estruturas de repetição (while, for)
- Condicionais (if)
- Vetores (arrays)
- Listas dinâmicas (ArrayList)
- Manipulação de dados aleatórios
- Interação com o usuário via terminal

## Como executar

1. Compile o arquivo:
   javac Jogo.java

2. Execute o programa:
   java jogo.Jogo
