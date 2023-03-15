1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?

R: O valor será 91


2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

R: Está nos arquivos Java com nome de Fibonacci.java.

3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____


R:
a) A lógica é adicionar 2 ao número anterior. O próximo número é 9.
b) A lógica é multiplicar por 2 o número anterior. O próximo número é 128.
c) A lógica é elevar ao quadrado o número anterior. O próximo número é 49.
d) A lógica é adicionar 12 ao número anterior. O próximo número é 100.
e) A lógica é somar os dois números anteriores. O próximo número é 13.
f) A lógica é somar 8 ao primeiro número, somar 2 ao segundo número, somar 4 ao terceiro número e assim por diante. O próximo número é 20.


4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.


R:  Primeiro tem-se de calcular o tempo que o caminhão leva para chegar a Ribeirão Preto sem o pedágio. Para isso, foi usada a seguinte formula:

                                                          S = Vo*t + So
                                                          
    Como o caminhão começou em Franca, assume-se que sua posição So é de 100 000m. Enquanto sua velocidade inicial de 80km/h, convertida para metros/s
    é igual a 22,22m/s. Assim temos a formula acima como:
                                                      
                                                          0 = -22,22*t + 100 000
                                                          
                                           Dividindo 100 000 por 22,22, obtemos que o tempo t é:
                                                  
                                                             t = 4500,45s
                                                             
                                                     que dividido por 60 é igual a:
                                                     
                                                          4500/60 = 75minutos
                                                          
                                       Assim temos o tempo que o caminhão levaria para chegar à cidade de
                                       Ribeirão Preto sem passar pelos pedágios, porém, o exercício em questão
                                       diz que houveram 2 pedágios de 5minutos cada no caminho. Então, para 
                                       calcular o tempo que o caminhão levou em seu trajeto passando pelos pedágios,
                                       somamos os 10 minutos adicionais ao tempo total t, de forma que:
                                       
                                                               t = 85min
                                                               t = 5100s
                                                               
                                                    Com isso, a formula dessa vez será
                                       
                                                         0 = Vo*5100 + 100 000
                                                            
                                                             Resultando em
                                                            
                                                             Vo = 19,608m/s
                                                             
                             Agora com este resultado, pode-se calcular a diferença de tempo entre o caminhão e o carro,
                             no qual a velocidade do carro foi constante de 110km/h, ou seja, 30,55m/s. Então, para encontrar
                             o momento no qual ambos os veículos se encontram na rodovia, precisamos igualar as duas equações
                             de modo que a equação resultante será:
                             
                                                     30,55*t + 0 = -19,608*t + 100 000 
                                   (OBS: o sinal negativo é porque o caminhao anda no sentido contrario do carro)
                                                     
                                                           50,16*t = 100 000
                                                           
                                                  E assim temos que o tempo será igual a:
                                                           
                                                             t = 1 993,62s
                                                             
                                                          O que é equivalente a
                                                          
                                                              t = 33 min
                                                              
                                 Temos então que após 33 minutos, o carro e o caminhão irão se encontrar na rodovia.
                                 Quanto à pergunta sobre a proximidade de ambos em relação à Ribeirão Preto, ambos 
                                 estão a mesma distancia da cidade. O que pode ser comprovado pelas seguintes equações:
                                 
                                                             Para o carro:
                                                             S = 30,55*1993,62 + 0
                                                             S = 60 905m
                                                             
                                                             Para o caminhão
                                                             S = -(19,608)*1993,62 + 100 000
                                                             S = 60 909m (OBS: A diferença de 4m é por conta de arredondamentos feitos ao longo das contas.)
                                                             
                                      E com isto é provado que, ao minuto 33, ambos estão à uma distancia de 60,9km
                                      de distância da cidade de Ribeirão Preto.
                                                             
                                   
                                                     
                                                     
                             
                                                       



5) Escreva um programa que inverta os caracteres de um string.



IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

R: Está nos arquivos Java como a função StringReversa.java
