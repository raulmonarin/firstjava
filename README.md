# firstjava
## My first java files from random homeworks from college.

## Basically i will be posting my homework files from my java class here.

> I'm a **pt/br** speaker so almost all the things here will be in portuguese

========================================================================================

## TAREFA 1

LISTA DE ATIVIDADES
Assunto: Conceitos Básicos de Java – Entrada/Saída – Estrutura Condicional

1) Elabore um algoritmo que leia dois números e depois leia o tipo de operação a ser realizada com os
números (1 - Adição, 2 - subtração, 3 - multiplicação e 4 - divisão). O algoritmo deverá imprimir o
resultado da operação escolhida pelo usuário.

        Ex: Informe o Numero 1: 4  
            Informe o Número 2: 6  
            Escolha uma Operação (1 - Adição, 2 - subtração, 3 - multiplicação e 4 – divisão): 1  
            O resultado é: 10  
        
        
2) Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de um triângulo.
Se for possível construir um triângulo com esses valores, verificar qual tipo de triãngulo ele é: se é
um triângulo equilátero, isósceles ou escalenos. Se eles não formarem um triângulo, escrever
a mensagem: “Valores não formam um triângulo!”.  
Considere as seguintes propriedades:  

   A. O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados;  
   B. Equilátero: tem os comprimentos dos três lados iguais;  
   C. Isósceles: tem os comprimentos de dois lados iguais;  
   D. Escaleno: tem os comprimentos dos três lados diferentes.  
  
  
3) Escrever um algoritmo que lê um valor em reais e calcule qual o menor número possível de notas de
100, 50, 10, 5, 2, e 1 (moeda) em que o valor lido pode ser decomposto. Escrever o valor lido e a
relação de notas necessárias. 

========================================================================================

## TAREFA 2

LISTA DE ATIVIDADES
Assunto: Estruturas de Repetição (Laços)

1) Leia dois valores (m e n). Imprima todos os números ímpares entre M e N e, no final imprima a soma
dos mesmos.

Obs1: Para saber se um número é ímpar, devemos verificar se o número não é divisível por 2.
Obs2: Garanta que N é obrigatoriamente maior que N.  

    Ex: Informe M: 10  
        Informe N: 20  
        Os valores ímpares entre 10 e 20 são: 13, 15, 17, 19  
        A soma dos valores ímpares é: 64  
 
 
2) Um professor de primário está precisando de um programa de tabuadas para ajudar seus alunos. O
programa deverá solicitar os seguintes dados ao usuário:
- O intervalo para ser feita a tabuada, isto é, o início e o fim da tabuada;
- A tabuada que ele deseja;

OBS: O Final da tabuada deverá ser maior que o início. E, a tabuada deverá ser maioir do que 1.

Além de imprimir a tabuada, o professor deseja que o programa imprima a soma dos resultados da
tabuada. Elabore o algoritmo para o professor.

    Ex: Informe o início da Tabuada: 12  
        Informe o final da Tabuada: 14  
        Informe a Tabuada: 3  
        3 x 12 = 36  
        3 x 13 = 39  
        3 x 14 = 42  
        A soma dos resultados é: 117  
      
========================================================================================

## TAREFA 3

Atividade
Crie uma classe para representar empregados de uma organização.  
Todo empregado possui nome, sobrenome e salário.  
Ao se instanciar um empregado, todos os seus dados deverão ser informados pelas classes classe Principal.  
Além disso, em qualquer momento durante a existência de um empregado, as seguintes restrições devem ser obedecidas:  

1) Os valores de nome e sobrenome não podem ser iguais a null;  
2) O nome deve ser diferente do sobrenome;  
3) O salário deve ser um valor positivo.  

Além disso, crie um método que ‘simule’ o valor do salário que um
empregado qualquer receberia após x anos, supondo-se que, a cada ano, seu
salário sofra aumento de 2%.  

Crie a classe Principal que realize as seguintes tarefas:  
a) Crie um empregado;  
b) Efetue uma simulação do salário com base em 5 anos e mostre o novo salário;  
c) Mostre todos os dados de um empregado. 

========================================================================================

## Atividade 1

## Exercício 1. 
Elabore um programa composto por uma janela gráfica que permita ao usuário inserir
dados de empregados de uma empresa. Para um empregado, o usuário deve informar nome, salário
base e tempo de serviço. Todo empregado também possui salário final, que deve ser calculado
considerando-se o salário base e um valor de bônus. O bônus é um percentual calculado sobre o
salário base, e é determinado com base no tempo de serviço. Para que seja possível ao usuário
informar o tempo de serviço, a janela deverá apresentar três opções: 1 ano; 2 a 5 anos e Mais de 5
anos. A tabela a seguir mostra o percentual de bônus de acordo com o tempo de serviço:  

Tempo de serviço   Percentual de bônus  
	1 ano              2.5%  
	2 a 5 anos         5.0%  
	Mais de 5 anos     7.5%  
	
Caso o empregado possua menos de 1 ano de serviço, ele não receberá bônus. A janela gráfica deve
possuir três botões:

Botão “Novo empregado”: esse botão deve permitir limpar todos os elementos de controle
do formulário (se houver alguma opção de tempo de serviço marcada, ela deverá ser
desmarcada). No momento que o programa for carregado, esse deverá ser o único botão
habilitado na janela.

Botão “Inserir dados”: esse botão somente será habilitado após o usuário clicar no botão
“Novo empregado”. No momento que o botão “Inserir dados” for clicado, um empregado
deverá ser criado no programa, e seu salário final deverá ser devidamente calculado. Esse
botão deve manter-se desabilitado até que o botão “Novo empregado” seja clicado
novamente.

Botão “Imprimir dados”: esse botão somente será habilitado após o usuário clicar no botão
“Inserir dados”. O objetivo desse botão é exibir na tela todos os dados do empregado
inserido no programa (incluindo-se seu salário final). Use a classe JOptionPane para esse
propósito.

Além da classe que represente uma janela gráfica, crie uma classe que represente empregados (nome,
salário base, tempo de serviço e salário final). O programa deve armazenar os dados de apenas um
empregado (não há necessidade de utilizar arrays/arranjos). 


## Exercício 2. 
Escreva um programa que simule um jogo de acertos, organizado em três níveis (fácil,
médio e difícil). O programa deve conter uma janela gráfica que permita ao jogador escolher o nível
do jogo e informar sua aposta (número). A tabela a seguir mostra as regras do jogo para cada nível:  
Nível Regras  

Fácil  
Dois números entre 1 e 10 devem ser gerados. O jogador ganhará se acertar um dos números. O jogador possui três tentativas para
acertar.

Médio  
Dois números entre 10 e 100 devem ser gerados. O jogador ganhará se acertar um dos números. O jogador possui duas tentativas para
acertar.

Difícil  
Dois números entre 1 e 100 devem ser gerados. O jogador ganhará se acertar a soma dos números. O jogador possui uma tentativa para
acertar.

Em todos os casos, deve-se garantir que os dois números gerados pelo programa sejam diferentes
entre si. A janela gráfica deve possuir ainda dois botões: um botão deve permitir a criação de um jogo
com base no nível escolhido e o outro deve permitir jogar. O botão para jogar somente deve ser
habilitado após o jogador ter iniciado um jogo e deverá manter-se habilitado até que o jogo termine.
Crie uma classe que represente a lógica do jogo. Use os componentes JRadioButton e ButtonGroup
para permitir ao jogador selecionar um determinado nível. 
