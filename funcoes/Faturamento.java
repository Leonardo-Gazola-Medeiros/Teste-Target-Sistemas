package funcoes;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Faturamento {
    
    Date data;
    double valor;
    

    public Faturamento(Date data, double valor) {
        this.data = data;
        this.valor = valor; 
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void maiorValor(List<Faturamento> faturamentos , Date data) {

        double valorMax = 0;

        for(Faturamento fatura : faturamentos){

            if(fatura.getData().equals(data)){
                double valor = fatura.getValor();

                if(valor > valorMax){
                    valorMax = valor;
                }
            }
        }
        if(valorMax == 0){
            System.out.println("Não hove vendas nesse dia.");
        }else{
            System.out.println("O maior valor do dia "+ data +" foi de: "+ valorMax);
        }
    }

    public void menorValor(List<Faturamento> faturamentos , Date data) {
        
        double valorMin = 0;

        for(Faturamento fatura : faturamentos){

            if(fatura.getData().equals(data)){
                double valor = fatura.getValor();
                if(valorMin == 0){
                    valorMin = valor;
                }
                if(valor < valorMin){
                    valorMin = valor;
                }
            }
        }
        if(valorMin == 0){
            System.out.println("Não hove vendas nesse dia.");
        }else{
            System.out.println("O menor valor do dia "+ data +" foi de: "+ valorMin);
        }   
    }


    public void minMAxValor(List<Faturamento> faturamentos , Date data) {
        
        double valorMax = 0;
        double valorMin = 0;

        for(Faturamento fatura : faturamentos){

            if(fatura.getData().equals(data)){
                double valor = fatura.getValor();
                if(valorMin == 0){
                    valorMin = valor;
                }else if(valor < valorMin){
                    valorMin = valor;
                }
                if(valor > valorMax){
                    valorMax = valor;
                }
            }
        }
        if(valorMax == 0){
            System.out.println("Não hove vendas nesse dia.");
        }else{
            System.out.println("O maior valor do dia "+ data +" foi de: "+ valorMax);
            System.out.println("O menor valor do dia "+ data +" foi de: "+ valorMin);
        }
    }


    public static double mediaMes(List<Faturamento> faturamentos, int ano, int mes) {
        Map<Integer, Double> somaMap = new HashMap<>();
        Map<Integer, Integer> contadorMap = new HashMap<>();
        Calendar cal = Calendar.getInstance();
        for (Faturamento fatura : faturamentos) {
            cal.setTime(fatura.getData());
            if (cal.get(Calendar.YEAR) == ano && cal.get(Calendar.MONTH) == mes) {
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                double valor = fatura.getValor();
                somaMap.put(dia, somaMap.getOrDefault(dia, 0.0) + valor);
                contadorMap.put(dia, contadorMap.getOrDefault(dia, 0) + 1);
            }
        }
        double soma = 0.0;
        int contador = 0;
        for (int dia : somaMap.keySet()) {
            double somaDia = somaMap.get(dia);
            int contaDia = contadorMap.get(dia);
            if (contaDia > 0) {
                soma += somaDia;
                contador += contaDia;
            }
        }
        if (contador == 0) {
            return 0.0;
        } else {
            return soma / contador;
        }
    }
}




