import funcoes.Fibonacci;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import funcoes.Faturamento;
import funcoes.PorcentualRepresentativo;
import funcoes.StringReversa;

public class Main {
    
static Fibonacci testeFibonacci = new Fibonacci(56);


static Faturamento fatura1 = new Faturamento(new Date(2023,4,6),5500.00);
static Faturamento fatura2 = new Faturamento(new Date(2023,2,16),2500.00);
static Faturamento fatura3 = new Faturamento(new Date(2023,4,1),1500.00);
static Faturamento fatura4 = new Faturamento(new Date(2023,4,5),500.00);
static Faturamento fatura5 = new Faturamento(new Date(2023,4,14),1660.00);
static Faturamento fatura6 = new Faturamento(new Date(2023,3,8),6500.00);

static PorcentualRepresentativo estado1 = new PorcentualRepresentativo("SP", 67836.43);
static PorcentualRepresentativo estado2 = new PorcentualRepresentativo("RJ", 36678.66);
static PorcentualRepresentativo estado3 = new PorcentualRepresentativo("MG", 29229.88);
static PorcentualRepresentativo estado4 = new PorcentualRepresentativo("ES", 27165.48);
static PorcentualRepresentativo estado5 = new PorcentualRepresentativo("Outros", 19849.53);


public static void main(String[] args) {

    // RESOLUÇÃO DO SEGUNDO EXERCÍCIO PROPOSTO

    System.out.println(testeFibonacci);
    


    //RESOLUÇÃO DO QUARTO EXERCÍCIO PROPOSTO

    List<PorcentualRepresentativo> representacoes = new ArrayList<>();
    representacoes.add(estado1);
    representacoes.add(estado2);
    representacoes.add(estado3);
    representacoes.add(estado4);
    representacoes.add(estado5);

    PorcentualRepresentativo.porcentualRepresent(representacoes);


    //RESOLUÇÃO DO QUINTO EXERCÍCIO PROPOSTO

    StringReversa.reverter("Olá Mundo!!");

}


}