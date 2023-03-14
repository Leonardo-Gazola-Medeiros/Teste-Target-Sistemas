package funcoes;
public class Fibonacci {
    
        /*
        Dado a sequência de Fibonacci,
        onde se inicia por 0 e 1 e o próximo
        valor sempre será a soma dos 2 valores 
        anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
        escreva um programa na linguagem que desejar onde, 
        informado um número, ele calcule a sequência de Fibonacci 
        e retorne uma mensagem avisando se o número informado 
        pertence ou não a sequência.
         */

         

      public static void checa_fibo(int numero) {
            
        int a = 0;
        int b = 1;
        
        while(a < numero){

          int c = a + b;
          a = b;
          b = c;
        }

        if( a == numero || b == numero || a == 0){

          System.out.println("O numero faz sim parte da sequência de fibonacci");

        }else{
          System.out.println("O número não faz parte da sequência de fibonacci");
        }

      }

      public Fibonacci(int numero) {
        checa_fibo(numero);
      }
    }